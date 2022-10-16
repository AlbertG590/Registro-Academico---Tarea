package ui;

import java.security.Signature;
import java.util.Scanner;

import dol.Group;
import dol.Signatures;
import dol.Students;
import dol.Teachers;

public class RegisterForm {
	Scanner scan;
	Students students;
	Teachers teachers;
	Signatures signatures;
	Group group;
	public RegisterForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public RegisterForm(Scanner person, Students students, Teachers teachers, Signature signature, Group group, Signatures signatures) {
		super();
		this.students = students;
		this.teachers = teachers;
		this.signatures = signatures;
		this.group = group;
	}
	public Students catchStudents() {
		Students s = new Students();
		System.out.println("ID");
		s.setId(scan.next());
		System.out.println("Primer Nombre del estudiante");
		s.setFirststudentname(scan.next());
		System.out.println("Segundo Nombre del estudiante");
		s.setSecondstudentname(scan.next());
		System.out.println("Primer Apellido del estudiante");
		s.setFirststudentsurname(scan.next());
		System.out.println("Segundo Apellido del estudiante:");
		s.setSecondstudentsurname(scan.next());
		System.out.println("Edad");
		s.setAge(scan.next());
		System.out.println("Grado");
		s.setGrade(scan.next());
		System.out.println("Numero telefonico del estudiante");
		s.setCellphone(scan.next());
		System.out.println("Correo electronico del estudiante");
		s.setEmail(scan.next());
		System.out.println("Nota");
		s.setNote(scan.next());
		
		return s;
	}
	public void showStudents() {
		System.out.printf("ID del estudiante: %s\n", students.getId());
		System.out.printf("Primer Nombre del estudiante: %s\n", students.getFirststudentname());
		System.out.printf("Segundo Nombre del estudiante: %s\n", students.getSecondstudentname());
		System.out.printf("Primer Apellido del estudiante: %s\n", students.getFirststudentsurname());
		System.out.printf("Segundo Apellido del estudiante: %s\n", students.getSecondstudentsurname());
		System.out.printf("Edad: %s\n", students.getAge());
		System.out.printf("Grado: %s\n", students.getGrade());
		System.out.printf("Numero telefonico del estudiante: %s\n", students.getCellphone());
		System.out.printf("Correo electronico del estudiante: %s\n", students.getEmail());
		System.out.printf("Nota: %s\n", students.getNote());
	}
	public Teachers catchTeacher() {
		Teachers t = new Teachers();
		System.out.println("Primer Nombre del docente");
		t.setFirstprofname(scan.next());
		System.out.println("Segundo Nombre del docente");
		t.setSecondprofname(scan.next());
		System.out.println("Primer Apellido del docente");
		t.setFirstsurname(scan.next());
		System.out.println("Segundo Apellido del docente");
		t.setSecondsurname(scan.next());
		System.out.println("Numero telefonico del docente");
		t.setCellphone(scan.next());
		System.out.println("Correo electronico del docente");
		t.setEmail(scan.next());
		
		return t;
	}
	public void showTeacher() {
		System.out.printf("Primer Nombre del docente: %s\n", teachers.getFirstprofname());
		System.out.printf("Segundo Nombre del docente: %s\n", teachers.getSecondprofname());
		System.out.printf("Primer Apellido del docente: %s\n", teachers.getFirstsurname());
		System.out.printf("Segundo Apellido del docente: %s\n", teachers.getSecondsurname());
		System.out.printf("Numero telefonico del docente: %s\n", teachers.getCellphone());
		System.out.printf("Correo electronico del docente: %s\n", teachers.getEmail());
		
	}
	public Signatures catchSignatures() {
		Signatures sig = new Signatures();
		System.out.println("Nombre de la asignatura");
		sig.setSignature(scan.next());
		System.out.println("Nivel de la asignatura");
		sig.setSignaturegrade(scan.next());
		System.out.println("Numero de estudiantes en asignatura");
		sig.setStudentsInSignature(scan.next());
		
		return sig;
	}
	public void showSignature() {
		System.out.printf("Nombre de la asignatura: %s\n", signatures.getSignature());
		System.out.printf("Nivel de la asignatura: %s\n", signatures.getSignaturegrade());
		System.out.printf("Numero de estudiantes en asignatura: %s\n", signatures.getStudentsInSignature());

	}
	public Group catchGroups() {
		Group g = new Group();
		System.out.println("Modalidad del grupo");
		g.setModalityGroup(scan.next());
		System.out.println("Numero de estudiantes en grupo");
		g.setStudentsNumber(scan.next());
		System.out.println("Nota grupal");
		g.setGroupNote(scan.next());
		
		
		return g;
	}
	public void showGroups() {
		System.out.printf("Modalidad del grupo: %s\n", group.getModalityGroup());
		System.out.printf("Numero de estudiantes en grupo: %s\n", group.getStudentsNumber());
		System.out.printf("Nota grupal: %s\n", group.getGroupNote());
	}
}
