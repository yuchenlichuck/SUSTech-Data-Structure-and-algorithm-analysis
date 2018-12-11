package Lab7.Exercise1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Lab7.MyAnnotation;

public class Snack {
	public Snack(double price) {
		super();
		this.price = price;
	}

	@MyAnnotation(precision=1)
	private double price;

	@MyAnnotation(format="yyyy-MM-DD")
	private Date productionDate;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		
		this.productionDate = productionDate;
	}

	@Override
	public String toString() {
		
		return "Snack [price=" + price +	 ", productionDate=" + productionDate + "]";
	}
	
	
	public static void main(String[] args) throws ParseException, NoSuchFieldException, SecurityException {
		Class clazz = Snack.class;
		MyAnnotation myAnnotation = clazz.getDeclaredField("price").getAnnotation(MyAnnotation.class);
		String format=myAnnotation.format();
		
	//	String format = "yyyy-MM-DD HH:mm:ss";
		DateFormat dateFormat = new SimpleDateFormat(format); 
		Date date = dateFormat.parse("2018-10-24 16:10:00");
		Snack snack=new Snack(1);
		snack.setProductionDate(date);
		snack.setPrice(77.8);
		System.out.println(snack.toString());
	}
	
	
	
}