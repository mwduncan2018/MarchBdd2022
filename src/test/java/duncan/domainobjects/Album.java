package duncan.domainobjects;

public class Album {
	private String band;
	private String name;
	private Double price;
	public Album(String band, String name, Double price) {
		super();
		this.band = band;
		this.name = name;
		this.price = price;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
