package com.GreatLearning.HRDepartment;

import com.GreatLearning.department.SuperDepartment;

public class HRDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "You are in HR Department\n";
	}
	
	public String getTodaysWork() {
		return "Today work : Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Work Deadline : Complete by EOD";
	
	}
	public String doActivity() {
		return "Activity : Team Lunch";
	
	}

}
