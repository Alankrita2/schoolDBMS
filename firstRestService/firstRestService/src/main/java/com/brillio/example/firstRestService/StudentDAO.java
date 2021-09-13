package com.brillio.example.firstRestService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//equivalent @Component @Bean
public interface StudentDAO extends JpaRepository<StudentDTO, String> //Datatype of id
{
    public abstract List<StudentDTO> findAllByFname(String fname);
    //function name should be same as defined in studentDTO
    public abstract List<StudentDTO> findAllByLname(String lname);
    public abstract List<StudentDTO> findAllByFnameAndLname(String fname, String lname);

}
