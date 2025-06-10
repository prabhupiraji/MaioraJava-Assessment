package com.StudentManagementSystem.service;




import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentManagementSystem.model.Student;
import com.StudentManagementSystem.repository.StudentRepository;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student calculateAndUpdateAge(Long id) {
        Student student = studentRepository.findById(id).orElseThrow();
        LocalDate dob = LocalDate.of(student.getBirthYear(), student.getBirthMonth(), student.getBirthDay());
        int age = LocalDate.now().getYear() - dob.getYear();
        if (LocalDate.now().getDayOfYear() < dob.getDayOfYear()) {
            age--; 
        }
        student.setAge(age);
        return studentRepository.save(student);
    }

    public List<Student> getStudentsBetweenAgeRange(int minAge, int maxAge) {
        return studentRepository.findByAgeBetween(minAge, maxAge);
    }
}

