package nlayereddemo.entities.concretes;

import nlayereddemo.entities.abstracts.Entity;

public class Product implements Entity{

	private int id;
	private int categortId;
	private String name;
	private int unitPrice;
	private double unitInStock;
	public Product() {
		
	}
	public Product(int id, int categortId, String name, int unitPrice, double unitInStock) {
		super();
		this.id = id;
		this.categortId = categortId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategortId() {
		return categortId;
	}
	public void setCategortId(int categortId) {
		this.categortId = categortId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(double unitInStock) {
		this.unitInStock = unitInStock;
	}
	
	
}
