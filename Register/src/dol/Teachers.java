package dol;

import java.io.Serializable;

public class Teachers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 478939544899783915L;
	private String firstprofname;
	private String secondprofname;
	private String firstsurname;
	private String secondsurname;
	private String cellphone;
	private String email;
	public Teachers() {
		super();

		
	}
	public String getFirstprofname() {
		return firstprofname;
	}
	public void setFirstprofname(String firstprofname) {
		this.firstprofname = firstprofname;
	}
	public String getSecondprofname() {
		return secondprofname;
	}
	public void setSecondprofname(String secondprofname) {
		this.secondprofname = secondprofname;
	}
	public String getFirstsurname() {
		return firstsurname;
	}
	public void setFirstsurname(String firstsurname) {
		this.firstsurname = firstsurname;
	}
	public String getSecondsurname() {
		return secondsurname;
	}
	public void setSecondsurname(String secondsurname) {
		this.secondsurname = secondsurname;
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
	
	
	

}
