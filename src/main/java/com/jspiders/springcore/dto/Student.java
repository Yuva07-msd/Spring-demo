package com.jspiders.springcore.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student {
	private int SID;
	private String Name;
	private String RollNo;
	private String Mail;
	private long Contact;
	private List<String> Subject;
	private Set<String> Sub;
	private Map<Integer,String> map;
	
	
}
