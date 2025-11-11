package com.curseando.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String instructor;
    private Integer durationHours;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private Integer capacity;
    private Integer enrolledCount = 0;

    @Column(length = 2000)
    private String description;

    @Version
    private Long version;

    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(length = 3000)
    private String modules;
}
