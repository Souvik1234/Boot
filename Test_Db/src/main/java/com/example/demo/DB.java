package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DB extends JpaRepository<Dept, Long>{

	public List<Dept> findByDeptno(long deptno);
}
