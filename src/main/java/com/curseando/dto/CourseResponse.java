package com.curseando.dto;

import com.curseando.model.Difficulty;
import lombok.Data;

@Data
public class CourseResponse {
    private Long id;
    private String title;
    private String instructor;
    private Integer durationHours;
    private Difficulty difficulty;
    private Integer capacity;
    private Integer enrolledCount;
    private String description;
    private String modules;
}
