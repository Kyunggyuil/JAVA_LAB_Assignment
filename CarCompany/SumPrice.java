package assignment;

public class SumPrice {
	private Company company;

	public SumPrice(Company company) {
		this.company = company;
	}

	public int getSumPrice() {
		Car[] tempList = company.getCarList();
		int sum = 0;

		for(int i=0; i<3; i++) {
			sum += tempList[i].price*tempList[i].numberOfCar;
		}

		return sum;
	}
}
