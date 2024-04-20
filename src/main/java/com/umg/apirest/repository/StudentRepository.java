package com.umg.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.umg.apirest.model.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
