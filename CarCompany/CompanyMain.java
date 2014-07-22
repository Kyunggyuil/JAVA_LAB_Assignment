package assignment;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = Company.getInstance();
		SumPrice price = new SumPrice(company);
		System.out.println(price.getSumPrice());

	}

}
