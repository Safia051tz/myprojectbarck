package com.example.patient.patient.Service;

import com.example.patient.patient.Model.Patient;
import com.example.patient.patient.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepo patientRepo;

    public Patient post(Patient patient) {
        return patientRepo.save(patient);
    }

    public List<Patient> getPatient() {
        return patientRepo.findAll();
    }

    public Optional<Patient> getById(Integer id) {
        return patientRepo.findById(id);
    }

    public void deleteById(Integer id) {
        patientRepo.deleteById(id);
    }

    public Patient updatePatient(int id, Patient patient) {
        Optional<Patient> existingPatientOptional = patientRepo.findById(id);

        if (existingPatientOptional.isPresent()) {
            Patient existingPatient = existingPatientOptional.get();
            existingPatient.setName(patient.getName());
            existingPatient.setAge(patient.getAge());
            existingPatient.setGender(patient.getGender());
            existingPatient.setAddress(patient.getName());
           return patientRepo.save(existingPatient);
        } else {
            throw new RuntimeException("Patient not found with id: " + id);
        }
    }
}



