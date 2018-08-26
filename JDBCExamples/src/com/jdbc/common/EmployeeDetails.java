package com.jdbc.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name ="employeedetails")
public class EmployeeDetails implements Serializable {

	private String empName;
	private String empAddress;
	private int empId;
	

	@Override
	public String toString() {
		return "EmployeeDetails [empName=" + empName + ", empAddress=" + empAddress + ", empId=" + empId + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
