package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DB extends JpaRepository<Dept, Long>{

	public List<Dept> findByDeptno(long deptno);
	
	public List<Dept> findByDeptnoLessThan(long deptno);
	
	
	@Query(value="select * from dept",nativeQuery=true)
	public List<Dept> getbyNativeQuery();
}
