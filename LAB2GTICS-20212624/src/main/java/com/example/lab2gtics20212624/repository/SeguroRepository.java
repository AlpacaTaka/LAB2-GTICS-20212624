package com.example.lab2gtics20212624.repository;

import com.example.lab2gtics20212624.entity.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguroRepository extends JpaRepository<Seguro, Long> {
}
