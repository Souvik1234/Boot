package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DB extends JpaRepository<Dept1, Long>{

	public List<Dept1> findByDeptno(long deptno);
	
	public List<Dept1> findByDeptnoLessThan(long deptno);
	
	//public List<Dept1> queryTop2ByDeptno(long deptno);
	
	@Query(value="select * from dept1",nativeQuery=true)
	public List<Dept1> getbyNativeQuery();
}
