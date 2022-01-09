package com.spring.jparelations.student;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface StudentRepository extends JpaRepository<Student, Long> {
}
