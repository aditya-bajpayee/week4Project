package com.GreatLearning.AdminDepartment;

import com.GreatLearning.department.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "You are in Admin Department";
	}
	
	public String getTodaysWork() {
		return "Today Work : Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Work Deadline : Complete by EOD";
	
	}

}
