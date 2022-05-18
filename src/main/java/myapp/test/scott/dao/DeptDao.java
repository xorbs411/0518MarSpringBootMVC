package myapp.test.scott.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myapp.test.scott.dto.Dept;

@Mapper
public interface DeptDao {
	
      List<Dept> deptAll();
      
	//리턴타입<result type>메서드명(id값) ()파라미터타입 ; 
	

}
