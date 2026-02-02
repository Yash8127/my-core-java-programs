package com.DailyTask;

public class AverageStudent {
	String subject1;
	String subject2;
	String subject3;
	String subject4;
	String subject5;
	int marks1,marks2,marks3,marks4,marks5;
	int sum;
	float average;
int sum() {
	sum = marks1+marks2+marks3+marks4+marks5;
	return sum;
}
float average() {
	average = sum/5;
	return average;
}
	void main() {
		AverageStudent stu = new AverageStudent();
		stu.subject1 = "Tekugu";
		stu.marks1 = 80;
		stu.subject2 = "Hindi";
		stu.marks2 = 75;
		stu.subject3 = "English";
		stu.marks3 = 86;
		stu.subject3 = "mathematics";
		stu.marks4 = 83;
		stu.subject3 = "science";
		stu.marks5 = 89;
		stu.sum();
		stu.average();
		System.out.println("Total marks out of 500 = "+stu.sum);
		System.out.println("Average = "+stu.average);
		
	}

}
