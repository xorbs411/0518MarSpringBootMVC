package myapp.test.scott.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

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
	}//dao에 있는 메서드 호출하고 결과물 리턴 받아와서 컨트롤로
	//dao.deptOne(no); 호출하고  return dao.deptOne(no);리턴
	
	public int maxNo() {
		return dao.maxNo();
	}
	public int addDept(Dept d) {
		return dao.addDept(d);
	}
	public int deleteDept(int deptno) {
		return dao.deleteDept(deptno);
	}
	public  int updateDept(Dept dept) {
		return dao.updateDept(dept);
	}

	

}

