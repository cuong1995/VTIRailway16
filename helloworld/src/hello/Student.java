package hello;

import java.util.Date;

public class Student {

	Department dept;
	
	int id;
	float salary;
	String fullName;
	char a;
	boolean isPassCource;
	Date birthDay;
	Gender gender;
	int[] diems;
	
	//1 phương thức / hàm / method có tên là gotoSchool
	void goToSchool(){
		System.out.println(fullName + " going to school ...!");
		
	}
	void doHomeWork(){
		System.out.println("I'm doing homework ...!");
		
	}
}
