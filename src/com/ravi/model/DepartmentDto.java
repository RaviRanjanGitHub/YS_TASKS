package com.ravi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "Department")
public class DepartmentDto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DepttId")
	private int depttId;
	@Column(name =  "DepttName")
	private String depttName;
	public int getDepttId() {
		return depttId;
	}
	public void setDepttId(int depttId) {
		this.depttId = depttId;
	}
	public String getDepttName() {
		return depttName;
	}
	public void setDepttName(String depttName) {
		this.depttName = depttName;
	}
	@Override
	public String toString() {
		return "Department [depttId=" + depttId + ", depttName=" + depttName + "]";
	}
	
	
	
}
