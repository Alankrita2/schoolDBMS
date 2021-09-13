package com.brillio.example.firstRestService.Controllers;

import com.brillio.example.firstRestService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Component
public class MyRestController {

    @Autowired
    StudentDAO studentDAO;

    @Autowired
    StudentAndMarksDAO studentAndMarksDAO;

    @Autowired
    MarksDAO marksDAO;

    @GetMapping("/")
    public String firstMethod(){
        return("Welcome to String Boot Application");
    }

    @GetMapping("/student")
    @Cacheable("sdetails")
    public List<StudentDTO> getAllStudents(){
        return studentDAO.findAll();
    }

    @GetMapping("/student/{id}")
    public Optional<StudentDTO> getStudentById(@PathVariable String id){
        return studentDAO.findById(id); //Optional returns null if not null then implicit type casting is there
    }

    @GetMapping("/student/fname/{fname}")
    public List<StudentDTO> getStudentByFname(@PathVariable String fname){
        return studentDAO.findAllByFname(fname); //Optional returns null if not null then implicit type casting is there
    }

    @GetMapping("/student/lname/{lname}")
    public List<StudentDTO> getStudentByLname(@PathVariable String lname){
        return studentDAO.findAllByLname(lname); //Optional returns null if not null then implicit type casting is there
    }

    @GetMapping("/student/name/{fname}/{lname}")
    public List<StudentDTO> getStudentByName(@PathVariable String fname, @PathVariable String lname){
        return studentDAO.findAllByFnameAndLname(fname,lname); //Optional returns null if not null then implicit type casting is there
    }

    @GetMapping("/student/marks")
    public List<StudentAndMarksDTO> getAllStudentMarks(){
        return studentAndMarksDAO.findAll(); //Optional returns null if not null then implicit type casting is there
    }

    @GetMapping("/student/getdetails")
    public List<String> getAllStudentDetails(){
        return studentAndMarksDAO.getJointDetails(); //Optional returns null if not null then implicit type casting is there
    }

    @GetMapping("/student/gettestdetails")
    public List<List<String>> getTestDetails(){
        return marksDAO.getTestDetails(); //Optional returns null if not null then implicit type casting is there
    }



}
