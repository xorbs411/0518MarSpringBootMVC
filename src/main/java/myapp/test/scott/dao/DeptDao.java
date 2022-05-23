package myapp.test.scott.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myapp.test.scott.dto.Dept;

@Mapper
public interface DeptDao {
	List<Dept> deptAll(); // select => 레코드 1개 : resultType 레코드가 n개 : list<resultType>
    Dept deptOne(int no);      //리턴타입<result type>메서드명(id값) ()파라미터타입 ;
    int maxNo();
    int addDept(Dept d);   // insert, update, delete =>int
    int deleteDept(int deptno);
    int updateDept(Dept dept);
    
   
    
      
	 
	

}
