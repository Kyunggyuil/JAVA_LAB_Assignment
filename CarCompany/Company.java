package assignment;

public class Company {
	private static Company company = new Company();
	private Car[] carList = new Car[3];
	
	{
	carList[0] = new Sonata();
	carList[1] = new Grandeur();
	carList[2] = new Genesis();
	}
	
	private Company(){
		System.out.println("인스턴스를 생성했습니다.");
	}
	
	public static Company getInstance(){
		if(company==null)
			company = new Company();
		return company;
	}

	public Car[] getCarList() {
		return carList;
	}
	
	
}

