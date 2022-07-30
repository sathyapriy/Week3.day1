package org.student;

import org.department.Department;

public class Student extends Department{

	public String studentName()
	{
		return "StudentName:Sathya";
	}
	public String studentDept()
	{
		return "CS";
	}
	public int studentId()
	{
		return 34567;
	}
	
	public static void main(String[] args) {
		
		Department d=new Department();
		d.collegeCode();
		d.collegeName();
		d.collegeRaank();
		d.deptName();
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
