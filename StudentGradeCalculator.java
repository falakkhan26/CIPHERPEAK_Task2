package pack1;

public class StudentGradeCalculator {

	public static void main(String[] args) {

	Student s1=new Student("Falak",90);
	StudentGrade s=CalculateStudentGrade.calculateGrade(s1);
	System.out.println(s);
	}

}
