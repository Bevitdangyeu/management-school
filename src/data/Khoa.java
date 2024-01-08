package data;

import java.util.Scanner;

public class Khoa {
	private String id;
	private String name;
	private int count =0;
	private Major major[]=new Major[10];
	private Scanner sc=new Scanner(System.in);
	public Khoa(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public Major[] getMajor() {
		return major;
	}
	// hàm nhập thông tin của chuyên ngành
	public void inputMajor() {
		String id;
		String name;
		System.out.print("id Chuyên ngành: ");
		id=sc.nextLine();
		System.out.print("Tên chuyên ngành: ");
		name=sc.nextLine();	
		major[count]=new Major(id, name);
		count++;
	}
	// hàm xuất thông tin của chuyên ngành
	public void outputMajor() {
		for(int i=0;i<count;i++) {
			System.out.print("Mã chuyên ngành: "+id);
			System.out.print("Tên chuyên ngành: "+name);
		}
	}
}
