package com.cg.jdbc.bean;

public class ContractBean {
	private int contractNO;
	private int custId;
	private int haulId;
	private int prodId;
	private int quantity;
	private String deliveryDate;
	private String deliveryDay;

	public int getContractNO() {
		return contractNO;
	}

	public void setContractNO(int contractNO) {
		this.contractNO = contractNO;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getHaulId() {
		return haulId;
	}

	public void setHaulId(int haulId) {
		this.haulId = haulId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryDay() {
		return deliveryDay;
	}

	public void setDeliveryDay(String deliveryDay) {
		this.deliveryDay = deliveryDay;
	}

	@Override
	public String toString() {
		return "ContractBean [contractNO=" + contractNO + ", custId=" + custId + ", haulId=" + haulId + ", prodId="
				+ prodId + ", quantity=" + quantity + ", deliveryDate=" + deliveryDate + ", deliveryDay=" + deliveryDay
				+ "]";
	}

}
