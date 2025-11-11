package com.curseando.service;

import com.curseando.dto.CourseResponse;
import com.curseando.model.Course;
import com.curseando.model.Difficulty;
import com.curseando.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repo;

    public CourseServiceImpl(CourseRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<CourseResponse> getCourses(Difficulty difficulty) {
        List<Course> courses = (difficulty == null)
                ? repo.findAll()
                : repo.findAll().stream()
                .filter(c -> c.getDifficulty() == difficulty)
                .toList();

        return courses.stream().map(this::toResponse).toList();
    }

    @Override
    public CourseResponse getCourseById(Long id) {
        Course c = repo.findById(id).orElseThrow();
        return toResponse(c);
    }

    private CourseResponse toResponse(Course c) {
        CourseResponse res = new CourseResponse();
        res.setId(c.getId());
        res.setTitle(c.getTitle());
        res.setInstructor(c.getInstructor());
        res.setDurationHours(c.getDurationHours());
        res.setDifficulty(c.getDifficulty());
        res.setCapacity(c.getCapacity());
        res.setEnrolledCount(c.getEnrolledCount());
        res.setDescription(c.getDescription());
        res.setModules(c.getModules());
        return res;
    }
}
