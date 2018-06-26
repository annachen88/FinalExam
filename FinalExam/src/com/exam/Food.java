package com.exam;

public class Food {
	int number;
	String food;
	int price ;
	int col;

public Food(int number, String food, int price, int col) {
	super();
	this.number = number;
	this.food = food;
	this.price = price;
	this.col = col;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getFood() {
	return food;
}

public void setFood(String food) {
	this.food = food;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getCol() {
	return col;
}

public void setCol(int col) {
	this.col = col;
}

}
