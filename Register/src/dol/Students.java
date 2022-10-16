package dol;

import java.io.Serializable;

public class Students implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3930352919678213089L;
	private String id;
	private String firststudentname;
	private String secondstudentname;
	private String firststudentsurname;
	private String secondstudentsurname;
	private String age;
	private String grade;
	private String cellphone;
	private String email;
	private String note;
	public Students() {
		super();
	
		
	}
	public String getFirststudentname() {
		return firststudentname;
	}
	public void setFirststudentname(String firststudentname) {
		this.firststudentname = firststudentname;
	}
	public String getSecondstudentname() {
		return secondstudentname;
	}
	public void setSecondstudentname(String secondstudentname) {
		this.secondstudentname = secondstudentname;
	}
	public String getFirststudentsurname() {
		return firststudentsurname;
	}
	public void setFirststudentsurname(String firststudentsurname) {
		this.firststudentsurname = firststudentsurname;
	}
	public String getSecondstudentsurname() {
		return secondstudentsurname;
	}
	public void setSecondstudentsurname(String secondstudentsurname) {
		this.secondstudentsurname = secondstudentsurname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	
}
