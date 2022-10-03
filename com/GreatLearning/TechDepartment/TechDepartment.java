package com.GreatLearning.TechDepartment;

import com.GreatLearning.department.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Your are in Tech Department";
	}
	
	public String getTodaysWork() {
		return "Today work : Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Work Deadlin : Complete by EOD";
	
	}
	public String getTechStackInformation() {
		return "Tech Information : core Java";
	
	}

}
