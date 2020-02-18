import java.util.Arrays;
import java.util.Scanner;
public class StudentsDriver{
	public void loadStudents(Students[] obj){
		for (int i = 0; i < obj.length; i++){
			obj[i] = new Students();
			obj[i].setStudentID(i+1);
			double gpa = (4 - i) * (double) (i/4) + (double) (i/2);
			obj[i].setStudentGPA(gpa);
			obj[i].setStudentName("S" + i);
		}
	}	
	public void displayStudents(Students[] obj){
		for (int i = 0; i < obj.length; i++){
			System.out.println(obj[i].getStudentID() + "\t"
				+ obj[i].getStudentName() + "\t"
				+ obj[i].getStudentGPA()); 
		}
	}	
}