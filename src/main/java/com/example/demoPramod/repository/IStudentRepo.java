package com.example.demoPramod.repository;

import com.example.demoPramod.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student , Integer> {
}
