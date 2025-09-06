package com.jspiders.springcore.dto;

import lombok.Data;

@Data
public class StudentDto {
	private int SID;
	private String Name;
	private String RollNo;
	private String Mail;
	private long Contact;
	public StudentDto(String Name, String RollNo, String Mail) {
		super();
		this.Name = Name;
		this.RollNo = RollNo;
		this.Mail = Mail;
	}
	
	
}
