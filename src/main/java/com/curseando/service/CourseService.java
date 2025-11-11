package com.curseando.service;

import com.curseando.dto.CourseResponse;
import com.curseando.model.Difficulty;

import java.util.List;

public interface CourseService {
    List<CourseResponse> getCourses(Difficulty difficulty);
    CourseResponse getCourseById(Long id);
}
