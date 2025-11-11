package com.curseando.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EnrollmentRequest {
    @NotNull private Long courseId;
    @NotBlank private String fullName;
    @Email @NotBlank private String email;
}
