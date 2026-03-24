package com.crudapp.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.crudapp.app.models.TeacherModel;

public class TeacherRepository {
	Map<Long, TeacherModel> db=new HashMap<Long, TeacherModel>();
	
	//showAll
	public ArrayList<TeacherModel> showAll(){
		ArrayList<TeacherModel> list = new ArrayList<TeacherModel>();
		list.addAll(db.values());
		return list;
	} 
	//showOne
	public TeacherModel showOne(long uid) {
		return db.get(uid);
	}
}
 