package com.curseando.service;

import com.curseando.model.Course;
import com.curseando.model.Enrollment;
import com.curseando.model.Student;
import com.curseando.repository.CourseRepository;
import com.curseando.repository.EnrollmentRepository;
import com.curseando.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    private final CourseRepository courseRepo;
    private final StudentRepository studentRepo;
    private final EnrollmentRepository enrollmentRepo;

    public EnrollmentServiceImpl(CourseRepository courseRepo, StudentRepository studentRepo, EnrollmentRepository enrollmentRepo) {
        this.courseRepo = courseRepo;
        this.studentRepo = studentRepo;
        this.enrollmentRepo = enrollmentRepo;
    }

    @Override
    @Transactional
    public void enroll(Long courseId, String fullName, String email) {
        Course course = courseRepo.findById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));

        if (course.getEnrolledCount() >= course.getCapacity()) {
            throw new IllegalStateException("Curso lleno");
        }

        Student student = studentRepo.findByEmail(email)
                .orElseGet(() -> {
                    Student s = new Student();
                    s.setFullName(fullName);
                    s.setEmail(email);
                    return studentRepo.save(s);
                });

        if (enrollmentRepo.existsByCourseAndStudent(course, student)) {
            throw new IllegalArgumentException("Ya estás inscripto en este curso");
        }

        Enrollment e = new Enrollment();
        e.setCourse(course);
        e.setStudent(student);
        enrollmentRepo.save(e);

        course.setEnrolledCount(course.getEnrolledCount() + 1);
        courseRepo.save(course);
    }

}
