package com.sudaksha.bean;

public class Student {
	
	private int studentNumber;
	private String studentName;
	private int studentMarks;
	
	public Student(){}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentMarks="
				+ studentMarks + "]";
	}
	
	

}
