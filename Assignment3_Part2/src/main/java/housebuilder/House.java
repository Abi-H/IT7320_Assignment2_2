// IT7320 Assignment 2 Part 3 2151241

package housebuilder;

public class House {
	int pricePerSquareMetre, squareMetres, bedrooms, bathrooms, priceBedroom, priceBathroom, totalPrice;
	String houseType;

	public House(int squareMetres, String houseType) {
		setHouseType(houseType);
		setSquareMetres(squareMetres);
		setPricePerSquareMetre(getHouseType());
		setBedrooms(0);
		setBathrooms(0);
		this.priceBedroom = 25000;
		this.priceBathroom = 20000;
	}

	public void setPricePerSquareMetre(String type) {
		if (type.equals("deluxe")) {
			this.pricePerSquareMetre = 1000;
		} else if (type.equals("custom")) {
			this.pricePerSquareMetre = 1500;
		} else if (type.equals("deluxe custom")) {
			this.pricePerSquareMetre = 2500;
		} else {
			setHouseType("basic");
			this.pricePerSquareMetre = 620;
		}
	}
	
	public boolean withinBudget(int budget) {
		return getTotalPrice() <= budget;
	}

	public int getTotalPrice() {
		return (getPricePerSquareMetre() * getSquareMetres()) + (getBedrooms() * priceBedroom) + (getBathrooms() * priceBathroom);
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public int getSquareMetres() {
		return squareMetres;
	}

	public void setSquareMetres(int squareMetres) {
		this.squareMetres = squareMetres;
	}
	
	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getPricePerSquareMetre() {
		return pricePerSquareMetre;
	}

	
}
