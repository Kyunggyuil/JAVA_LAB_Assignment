package practice;

public class Birthday {

	public int year;
	public int month;
	public int day;
	boolean validDay = true;
	
	public Birthday(){}
	public Birthday(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setDate(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public boolean checkValidate()
	{
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day<1||day>31)	validDay=false;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day<1||day>30)	validDay=false;
			break;
		case 2:
			if(year%4==0&&(year%100!=0||year%400==0))	// 윤년이라면 2월달은 1일부터 29일까지 존재할 수 있다.
			{
				if(day<1||day>29)	validDay=false;
			}
			else	// 윤년이 아니라면 2월달은 1일부터 28일까지 존재할 수 있다.
				if(day<1||day>28)	validDay=false;
			break;
		default:	// 입력된 month의 값이 정상적인 값의 범위를 벗어난 경우 잘못된 입력으로 간주한다.
			validDay=false;
		}
		return validDay;
	}
}
