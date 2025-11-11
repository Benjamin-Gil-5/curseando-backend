package com.curseando.controller;

import com.curseando.dto.CourseResponse;
import com.curseando.model.Difficulty;
import com.curseando.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<CourseResponse> getCourses(@RequestParam(required = false) Difficulty difficulty) {
        return service.getCourses(difficulty);
    }

    @GetMapping("/{id}")
    public CourseResponse getById(@PathVariable Long id) {
        return service.getCourseById(id);
    }
}
