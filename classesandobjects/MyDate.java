package classesandobjects;

public class MyDate {
	
	int dd,mm,yy;
	
	public MyDate()
	{
		dd=23;
		mm=12;
		yy=2023;
	}
	
	public MyDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void display() {
	
		System.out.println("Date : "+dd+"-"+mm+"-"+yy);

	}

}
