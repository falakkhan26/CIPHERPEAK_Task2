package pack1;

public class CalculateStudentGrade {
	
	public static StudentGrade calculateGrade(Student s)
	{
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
