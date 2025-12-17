package com.example.demo.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.Repository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends JpaRepository<Student,integer
{

}