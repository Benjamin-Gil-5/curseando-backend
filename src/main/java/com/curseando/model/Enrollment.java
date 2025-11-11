package com.curseando.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Course course;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    private Student student;

    private LocalDateTime enrolledAt = LocalDateTime.now();
}
