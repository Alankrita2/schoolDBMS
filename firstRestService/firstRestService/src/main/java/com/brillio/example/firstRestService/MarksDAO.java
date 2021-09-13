package com.brillio.example.firstRestService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarksDAO extends JpaRepository<MarksDTO, MarksKey> {
    @Query(value = "select s.sid, s.fname, t.tests, t.avgmarks from sdetails s join (select sid, count(testno) as tests, avg(m1+m2+m3)/3 as avgmarks from marks group by sid)  t on s.sid = t.sid", nativeQuery = true)
    public List<List<String>> getTestDetails() ;

}
