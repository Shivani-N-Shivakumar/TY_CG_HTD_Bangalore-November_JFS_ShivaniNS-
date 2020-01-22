package com.cg.jdbc.bean;


public class SchedulerBean {

	private int scheduleId;
	private int contractId;
	private int productId;
	private int quantity;
	private String delivaryDate;
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public int getContractId() {
		return contractId;
	}
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDelivaryDate() {
		return delivaryDate;
	}
	public void setDelivaryDate(String delivaryDate) {
		this.delivaryDate = delivaryDate;
	}
	@Override
	public String toString() {
		return "SchedulerBean [scheduleId=" + scheduleId + ", contractId=" + contractId + ", productId=" + productId
				+ ", quantity=" + quantity + ", delivaryDate=" + delivaryDate + "]";
	}
	
	
}
