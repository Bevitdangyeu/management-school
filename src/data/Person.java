package data;
import java.util.Scanner;

import MyLibrary.utill.Mylibrary;
public class Person {
	protected String id;
	protected String name;
	protected String dateOfBirth;
	// Hàm tạo cho class person;
	private static Scanner sc=new Scanner(System.in);
	
	public Person(String id, String name, String dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	// Hàm nhập thông tin
	public void inputPerson() {
		String id;
		String name;
		String dateOfBirth;
		System.out.print("Nhập vào id: ");
		id=sc.nextLine();
		System.out.print("Nhập vào họ tên: ");
		name=sc.nextLine();
		System.out.print("Nhập vào ngày tháng năm sinh( dd/MM/yyy ): ");
		dateOfBirth=sc.nextLine();
		
	}
	public void outputPerson() {
		System.out.println("id: "+ id );
		System.out.println("name: "+ name );
		System.out.println("dateOfBirth: "+ dateOfBirth);
		
	}
	
}
