package com.cg.jdbc.bean;

public class LandBean {
private int landId;
private String landOwner;
private int landCost;
private int acres;

public int getLandId() {
	return landId;
}
public void setLandId(int landId) {
	this.landId = landId;
}
public String getLandOwner() {
	return landOwner;
}
public void setLandOwner(String landOwner) {
	this.landOwner = landOwner;
}
public int getLandCost() {
	return landCost;
}
public void setLandCost(int landCost) {
	this.landCost = landCost;
}
public int getAcres() {
	return acres;
}
public void setAcres(int acres) {
	this.acres = acres;
}
@Override
public String toString() {
	return "LandBean [landId=" + landId + ", landOwner=" + landOwner + ", landCost=" + landCost + ", acres=" + acres
			+ "]";
}


}
