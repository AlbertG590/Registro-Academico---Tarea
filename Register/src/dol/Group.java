package dol;

import java.io.Serializable;

public class Group implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3280179865423713345L;
	private String modalityGroup;
	private String studentsNumber;
	private String groupNote;
	public Group() {
		super();

	}
	public String getModalityGroup() {
		return modalityGroup;
	}
	public void setModalityGroup(String modalityGroup) {
		this.modalityGroup = modalityGroup;
	}
	public String getStudentsNumber() {
		return studentsNumber;
	}
	public void setStudentsNumber(String studentsNumber) {
		this.studentsNumber = studentsNumber;
	}
	public String getGroupNote() {
		return groupNote;
	}
	public void setGroupNote(String groupNote) {
		this.groupNote = groupNote;
	}

}
