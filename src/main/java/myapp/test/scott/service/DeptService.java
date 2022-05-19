package myapp.test.scott.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myapp.test.scott.dao.DeptDao;
import myapp.test.scott.dto.Dept;

@Service
public class DeptService {
	@Autowired
	DeptDao dao;
	
	public List<Dept> deptAll(){
		return dao.deptAll();				
	}
	public Dept deptOne(int no) {
		
		return dao.deptOne(no);
	}
	
	

}
