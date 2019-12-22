package com.cg.flipkart.bean;

import java.io.Serializable;

public class ProductBean implements Serializable{
private  int Prod_id;
private String Prod_name;
private double Prod_cost;
private String Prod_color;
private String description;
private int no_of_prod;
public int getProd_id() {
	return Prod_id;
}
public void setProd_id(int prod_id) {
	Prod_id = prod_id;
}
public String getProd_name() {
	return Prod_name;
}
public void setProd_name(String prod_name) {
	Prod_name = prod_name;
}
public double getProd_cost() {
	return Prod_cost;
}
public void setProd_cost(double prod_cost) {
	Prod_cost = prod_cost;
}
public String getProd_color() {
	return Prod_color;
}
public void setProd_color(String prod_color) {
	Prod_color = prod_color;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getNo_of_prod() {
	return no_of_prod;
}
public void setNo_of_prod(int no_of_prod) {
	this.no_of_prod = no_of_prod;
}
@Override
public String toString() {
	return "ProductBean [Prod_id=" + Prod_id + ", Prod_name=" + Prod_name + ", Prod_cost=" + Prod_cost + ", Prod_color="
			+ Prod_color + ", description=" + description + ", no_of_prod=" + no_of_prod + "]";
}



}
