package com.deloitte.thirdmvn.hibthird.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AadharCard {
	@Id
	
	private int aid;
	@Column(name="issue_auth")
	private String issueAuth;
	@Column(name="issue_date")
	private java.sql.Date issueDate;
	public AadharCard() {
		super();
	}
	public AadharCard(int aid, String issueAuth, Date issueDate) {
		super();
		this.aid = aid;
		this.issueAuth = issueAuth;
		this.issueDate = issueDate;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getIssueAuth() {
		return issueAuth;
	}
	public void setIssueAuth(String issueAuth) {
		this.issueAuth = issueAuth;
	}
	public java.sql.Date getIssueDate() {
		return issueDate;
	}
	public void setIssuedate(java.sql.Date issueDate) {
		this.issueDate = issueDate;
	}
	

}
