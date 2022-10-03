package com.GreatLearning.Driver;

import java.util.Scanner;

import com.GreatLearning.AdminDepartment.AdminDepartment;
import com.GreatLearning.HRDepartment.HRDepartment;
import com.GreatLearning.TechDepartment.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		AdminDepartment ad=new AdminDepartment();
		HRDepartment hrd=new HRDepartment();
		TechDepartment td=new TechDepartment();
		
		
	
	while(true) {
		System.out.println("----------------------------------------");
		System.out.println("Press 1 for Admin Department");
		System.out.println("Press 2 for HR Department");
		System.out.println("Press 3 for Tech Department");
		System.out.println("Press 4 for Exit");
		System.out.println("----------------------------------------");
		
		
		System.out.println("Enter Department");
		int inputDepart=sc.nextInt();
		//System.out.println("Day of today?");
		//String day=sc.next();
		
		
		switch(inputDepart) {
		case 1:{
			System.out.println(ad.departmentName());
			System.out.println(ad.getTodaysWork());
			System.out.println(ad.getWorkDeadline());
			break;
		}
		case 2:{
			System.out.println(hrd.departmentName());
			System.out.println(hrd.doActivity());
			System.out.println(hrd.getTodaysWork());
			System.out.println(hrd.getWorkDeadline());
			break;
			}
		case 3:{
			System.out.println(td.departmentName());
			System.out.println(td.getTodaysWork());
			System.out.println(td.getWorkDeadline());
			System.out.println(td.isTodayAHoliday());
			break;
		}
		case 4:{
			System.exit(0);
		}
		default:
			System.out.println("Please Enter valid option");
			
		}
		
	}
	
	}
}
