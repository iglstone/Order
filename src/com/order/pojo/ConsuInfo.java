package com.order.pojo;

public class ConsuInfo {
	private int userID;
	private String userMenu;
	private String userMenuCN;
	private float totalPrice;
	
	public ConsuInfo() {
		this.userID = 0;
		this.userMenu = null;
		this.userMenuCN = null;
		this.totalPrice = 0.00F;
	}
	
	public ConsuInfo(int userID, String userMenu, String userMenuCN, float totalPrice) {
		this.userID = userID;
		this.userMenu = userMenu;
		this.userMenuCN = userMenuCN;
		this.totalPrice = totalPrice;
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserMenu() {
		return userMenu;
	}
	public void setUserMenu(String userMenu) {
		this.userMenu = userMenu;
	}
	public String getUserMenuCN() {
		return userMenuCN;
	}
	public void setUserMenuCN(String userMenuCN) {
		this.userMenuCN = userMenuCN;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
}
