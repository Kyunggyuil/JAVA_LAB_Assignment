package school;

public class Student {
	String name;
	int id;
	String major;
	int math;
	int english;
	
	public Student(String name, int id, String major, int math, int english){
		this.name=name;
		this.id=id;
		this.major=major;
		this.math=math;
		this.english=english;
	}
	
	public int getMajorScore(Student s1){
		if(s1.major=="수학")
			return s1.math;
		else 
			return s1.english;
	}
	
	public int getNonmajorScore(Student s1){
		if(s1.major=="수학")
			return s1.english;
		else
			return s1.math;
	}
}
