package school;

public class ExtractGrade implements Grading{

	public ExtractGrade(Student s1){
		System.out.println("major grade : "+major_grading(s1.getMajorScore(s1)));
		System.out.println("non-major grade : "+nonMajor_grading(s1.getNonmajorScore(s1)));
	}
	
	public String major_grading(int score) {
		if(score>=95)
			return "S";
		else if(score>=90)
			return "A";
		else if(score>=80)
			return "B";
		else if(score>=70)
			return "C";
		else if(score>=60)
			return "D";
		else
			return "F";
	}

	public String nonMajor_grading(int score) {
		if(score>=90)
			return "A";
		else if(score>=80)
			return "B";
		else if(score>=70)
			return "C";
		else if(score>=55)
			return "D";
		else
			return "F";
	}

	public final void extractGrade(Student s1){
		System.out.println("major grade : "+major_grading(s1.getMajorScore(s1)));
		System.out.println("non-major grade : "+nonMajor_grading(s1.getNonmajorScore(s1)));
	}
}
