package duncan.domainobjects;

public class Guitar {
	private String manufacturer;
	private String model;
	private Double price;
	public Guitar(String manufacturer, String model, Double price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
