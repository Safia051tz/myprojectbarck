package com.example.patient.patient.Controller;

import com.example.patient.patient.Model.Patient;
import com.example.patient.patient.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/patient")
public class PatientApi {
        @Autowired
        private PatientService patientService;

        @PostMapping
        public Patient post(@RequestBody Patient patient) {
            return patientService.post(patient);
        }

        @GetMapping
        public List<Patient> getAllPatent() {
            return patientService.getPatient();
        }

        @GetMapping("/{id}")
        public Optional<Patient> getById(@PathVariable Integer id) {
            return patientService.getById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteById(@PathVariable Integer id) {
            patientService.deleteById(id);
        }

        @PutMapping("/{id}")
        public Patient updatePatient(@PathVariable int id, @RequestBody Patient patient) {
            return patientService.updatePatient(id, patient);
        }


    }


