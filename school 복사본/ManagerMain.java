package school;

public class ManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("이승기", 141213, "수학", 95, 20);
		Student s2=new Student("김수현", 141518, "영어", 90, 100);
		Student s3=new Student("주원", 141230, "수학", 76, 60);
		Student s4=new Student("김우빈", 141255, "수학", 85, 89);
		Student s5=new Student("이민호", 141590, "영어", 90, 95);
		
		Grading ex1 = new ExtractGrade(s1);
		Grading ex2 = new ExtractGrade(s2);
		Grading ex3 = new ExtractGrade(s3);
		Grading ex4 = new ExtractGrade(s4);
		Grading ex5 = new ExtractGrade(s5);
		
		
	}

}
