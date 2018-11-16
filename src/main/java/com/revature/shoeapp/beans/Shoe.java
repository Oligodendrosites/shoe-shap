package com.revature.shoeapp.beans;

public class Shoe {
	
	private Integer shoeid;
	private Integer userid;
	private String brand;
	private Double size;
	private Double price;
	private String color;
	public Shoe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shoe(Integer shoeid, Integer userid, String brand, Double size, Double price, String color) {
		super();
		this.shoeid = shoeid;
		this.userid = userid;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
	}
	public Shoe(Integer userid, String brand, Double size, Double price, String color) {
		super();
		this.userid = userid;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
	}
	public Integer getShoeid() {
		return shoeid;
	}
	public void setShoeid(Integer shoeid) {
		this.shoeid = shoeid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getSize() {
		return size;
	}
	public void setSize(Double size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((shoeid == null) ? 0 : shoeid.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoe other = (Shoe) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (shoeid == null) {
			if (other.shoeid != null)
				return false;
		} else if (!shoeid.equals(other.shoeid))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Shoe [shoeid=" + shoeid + ", userid=" + userid + ", brand=" + brand + ", size=" + size + ", price="
				+ price + ", color=" + color + "]";
	}

	
}
