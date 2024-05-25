package pack1;

public class CalculateStudentGrade {
	
	public static StudentGrade calculateGrade(Student s)
	{
//		int mark=Integer.parseInt(s.getMarks());
//		if(student.getM)
//			return StudentGrade;
		char grade;
		if(s.getMarks()<=90)
		{
			grade='A';
		}
		else if(s.getMarks()<=80)
		{
			grade='B';
		}
		else if(s.getMarks()<=70)
		{
			grade='C';
		}
		else if(s.getMarks()<=60)
		{
			grade='D';
		}
		else
		{
			grade='F';
		}
		return new  StudentGrade(s,grade);
		//return ;
	}

}
