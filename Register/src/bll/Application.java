package bll;

import java.util.Scanner;

import dal.RegisterDal;
import ui.RegisterForm;

public class Application {
	private Scanner scan;
	public Application() {
		scan = new Scanner(System.in);
	}
	public void displayOptions() {
		System.out.println("Gestion de datos-Registro Academico 2022\n");
		System.out.println("1.Guardar datos de estudiante en registro");
		System.out.println("2.Abrir datos de estudiante en registro");
		System.out.println("3.Salir");
	}
	public void show() {
		short opc = 0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			opc = scan.nextShort();
			switch(opc) {
			case 1:
				save();
				break;
			case 2:
				open();
				break;
			case 3:
				System.exit(0);
				break;	
			}
		}while(opc!=3);
	}
	public void save() {
		RegisterForm rf = new RegisterForm(scan);
		RegisterDal rd = new RegisterDal();
		rd.setStudents(rf.catchStudents());
		rd.setTeachers(rf.catchTeacher());
		rd.setSignatures(rf.catchSignatures());
		rd.setGroups(rf.catchGroups());
		
		System.out.println("Indique la ruta de guardado para el archivo");
		rd.setFilePath(scan.next());
		System.out.println("Indique el nombre del archivo");
		rd.setFileName(scan.next());
		
		rd.save();
	}
	public void open() {
		System.out.println("Indique la ruta del archivo a abrir");
		String filePath = scan.next();
		RegisterDal rd = new RegisterDal();
		rd.setFilePath(filePath);
		
		RegisterForm rf = new RegisterForm(rd.open());
		rf.showStudents();
		rf.showTeacher();
		rf.showSignature();
		rf.showGroups();
	}

}
