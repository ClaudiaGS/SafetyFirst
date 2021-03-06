package com.safetyfirst.SafetyFirstApp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class MedicalRecord {
    private String firstName;
    private String lastName;
    private String birthdate;
    private List<String>medications;
    private List<String>allergies;
}
