package App.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import App.com.model.Student;
import App.com.repository.StudentRepository;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("students")
    public List<Student> getStudents() {
        return (List<Student>) this.studentRepository.findAll();
    }
}
