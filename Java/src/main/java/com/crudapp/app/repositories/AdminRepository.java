package com.crudapp.app.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crudapp.app.models.StudentModel;
import com.crudapp.app.models.TeacherModel;

@Repository
public class AdminRepository {

	//This fn is used to ban and unban users.
	@Autowired
	StudentRepository repo;
	@Autowired
	TeacherRepository repo1;
	
	public String manageAccess(long uid) {
		StudentModel student=repo.db.get(uid);
		if(student!=null) {
			if(!student.getisBanned()) {
				student.setisBanned(!student.getisBanned());
				return "User Banned Succesfully";
			}else {
				student.setisBanned(!student.getisBanned());
				return "user Unbanned Successfully";
			} 
		}
		TeacherModel teacher=repo1.db.get(uid);	
		if(teacher!=null){
			teacher.setisBanned(!teacher.getisBanned());
		}
	}
	//update user data
	public void updateUser() {
		
	}
	//fn to delete user data
	public void deleteUser() {
		
	}
}
