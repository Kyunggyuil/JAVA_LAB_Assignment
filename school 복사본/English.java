package school;

public class English implements Grading  {

	public String major_grading(Student s1) {
		if(s1.major=="영어")
		{
			if(s1.math>=95)
				return "S";
			else if(s1.math>=90)
				return "A";
			else if(s1.math>=80)
				return "B";
			else if(s1.math>=70)
				return "C";
			else if(s1.math>=60)
				return "D";
			else
				return "F";
		}
		else
			return "error";
	}
	public String nonMajor_grading(Student s1){
		if(s1.major!="영어"){
			
				if(s1.math>=90)
					return "A";
				else if(s1.math>=80)
					return "B";
				else if(s1.math>=70)
					return "C";
				else if(s1.math>=55)
					return "D";
				else
					return "F";
		
		}
		else
			return "error";
	}
}
