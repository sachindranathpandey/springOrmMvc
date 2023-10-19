package springormmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springormmvc.dao.StudentDao;
import springormmvc.entity.Student;


@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public int createStudent(Student student) {
		
		int id=(Integer)this.studentDao.saveStudent(student);
		return id;
	}
}
