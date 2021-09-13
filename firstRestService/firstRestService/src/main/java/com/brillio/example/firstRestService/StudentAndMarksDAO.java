package com.brillio.example.firstRestService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface StudentAndMarksDAO extends JpaRepository<StudentAndMarksDTO, String> {

    @Query(value = "select fname, cityname, statename from sdetails s inner join connect ct on ct.sid = s.sid inner join city c on ct.citycode = c.citycode inner join state st on st.statecode = c.statecode", nativeQuery = true)
    public List<String> getJointDetails() ;


}
