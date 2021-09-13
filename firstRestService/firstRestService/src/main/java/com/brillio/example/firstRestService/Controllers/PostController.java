package com.brillio.example.firstRestService.Controllers;

import com.brillio.example.firstRestService.StudentDAO;
import com.brillio.example.firstRestService.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/sdetails")

public class PostController {

    @Autowired
    StudentDAO studentDAO;

    @PostMapping("/insert")
    public String insertStudent(@RequestBody StudentDTO sDto){
        try {
            studentDAO.save(sDto);
            return("Data is inserted");
        }catch(Exception e){
            return (e.getMessage());
        }

    }

    @PutMapping("/update") //Complete data will be updated
    public String updateStudent(@RequestBody StudentDTO sDto){
        try {
            studentDAO.save(sDto);
            return("Data is updated");
        }catch(Exception e){
            return (e.getMessage());
        }

    }

    @PatchMapping("/patch") //Partial Updation
    public String patchStudent(@RequestBody StudentDTO sDto){
        try {
            studentDAO.save(sDto);
            return("Data is patched");
        }catch(Exception e){
            return (e.getMessage());
        }

    }

    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable String sid){
        try {
            studentDAO.deleteById(sid);
            return("Data is deleted");
        }catch(Exception e){
            return (e.getMessage());
        }

    }

}
