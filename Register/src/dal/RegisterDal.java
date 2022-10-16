package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import dol.Group;
import dol.Signatures;
import dol.Students;
import dol.Teachers;
//import ui.RegisterForm;

public class RegisterDal {
	private Students students;
	private Teachers teachers;
	private Signatures signatures;
	private Group groups;
	private String filePath;
	private String fileName;
	public RegisterDal() {
		super();
	}
	public Students getStudents() {
		return students;
	}
	public void setStudents(Students students) {
		this.students = students;
	}
	public Teachers getTeachers() {
		return teachers;
	}
	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}
	public Signatures getSignatures() {
		return signatures;
	}
	public void setSignatures(Signatures signatures) {
		this.signatures = signatures;
	}
	public Group getGroups() {
		return groups;
	}
	public void setGroups(Group groups) {
		this.groups = groups;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void save() {
		
		File file = new File(filePath + "\\" + fileName);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(students);
			os.writeObject(teachers);
			os.writeObject(signatures);
			os.writeObject(groups);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Scanner open() {
		try {
			File file = new File(filePath);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Scanner sc = (Scanner)ois.readObject();
			ois.close();
			return sc;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}

