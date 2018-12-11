package Lab7;
import java.util.Date;

public class Snack {
	public Snack(double price) {
		super();
		this.price = price;
	}

	@MyAnnotation(precision=1)
	private double price;

	@MyAnnotation()
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
}
