package housebuilder;

public class House {
	int pricePerSquareMetre, squareMetres;
	String houseType;

	public House(int squareMetres, String houseType) {
		setHouseType(houseType);
		setSquareMetres(squareMetres);
		setPricePerSquareMetre(getHouseType());
	}

	public int getPricePerSquareMetre() {
		return pricePerSquareMetre;
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

	public boolean withinBudget(int budget) {
		return getTotalPrice() <= budget;
	}

	public int getTotalPrice() {
		return pricePerSquareMetre * squareMetres;
	}
}
