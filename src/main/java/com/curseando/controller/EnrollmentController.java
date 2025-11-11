package com.curseando.controller;

import com.curseando.dto.EnrollmentRequest;
import com.curseando.service.EnrollmentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin
public class EnrollmentController {

    private final EnrollmentService service;

    public EnrollmentController(EnrollmentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> enroll(@Valid @RequestBody EnrollmentRequest request) {
        service.enroll(request.getCourseId(), request.getFullName(), request.getEmail());
        return ResponseEntity.ok(Map.of("message", "Inscripción exitosa"));
    }
}
