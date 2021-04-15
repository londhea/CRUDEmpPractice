package com.akkitech.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee_tbl")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double esalary;
	private String eaddress;
	private String egender;
	private int eage;
	private String edesgn;
	private String emobile;
	
	public Employee() {
		
	}

	public Employee(String ename,  String emobile, double esalary, String eaddress, String egender, int eage, String edesgn) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.eaddress = eaddress;
		this.egender = egender;
		this.eage = eage;
		this.edesgn = edesgn;
		this.emobile=emobile;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEgender() {
		return egender;
	}

	public void setEgender(String egender) {
		this.egender = egender;
	}

	
	public String getEmobile() {
		return emobile;
	}

	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEdesgn() {
		return edesgn;
	}

	public void setEdesgn(String edesgn) {
		this.edesgn = edesgn;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress
				+ ", egender=" + egender + ", eage=" + eage + ", edesgn=" + edesgn + ", emobile=" + emobile + "]";
	}

	
	
}