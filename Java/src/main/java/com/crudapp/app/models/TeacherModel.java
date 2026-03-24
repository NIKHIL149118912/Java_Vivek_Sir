package com.crudapp.app.models;

import java.util.ArrayList;

public class TeacherModel {

	String sectionAssigned;
	ArrayList<Subject> assignedSubjects;
	boolean isBanned;
	
	public String getSectionAssigned() {
		return sectionAssigned;
	}
	public void setSectionAssigned(String sectionAssigned) {
		this.sectionAssigned = sectionAssigned;
	}
	public ArrayList<Subject> getAssignedSubjects() {
		return assignedSubjects;
	}
	public void setAssignedSubjects(ArrayList<Subject> assignedSubjects) {
		this.assignedSubjects = assignedSubjects;
	}
	public void setisBanned(boolean isBanned) {
		this.isBanned=isBanned;
	}
	public boolean getisBanned() {
		return isBanned;
	}
}
