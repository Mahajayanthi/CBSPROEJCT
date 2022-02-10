package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "canteen")
public class Canteen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
	private String  place;
	private String  companyName;
	private long phoneNo;
	private String emailId;
	private String startDate;
	private String endDate;
	private String shopName;
	
	public Canteen() {
		super();
	}
	

	public Canteen(int id, String place, String companyName, long phoneNo, String emailId, String startDate,
			String endDate, String shopName) {
		super();
		Id = id;
		this.place = place;
		this.companyName = companyName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.shopName = shopName;
	}
	


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	@Override
	public String toString() {
		return "Canteen [  place=" + place + ", companyName=" + companyName + ", phoneNo=" +phoneNo + ", emailId=" + emailId+ " ,"
				+ ",Startdate=" +startDate+ ",Enddate=" + endDate +", shopName=" +shopName
				+ "]";	
	}
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="shopName") private shopname shopName;
	 */
	
	}
	

