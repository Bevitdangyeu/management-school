package data;

import java.util.Scanner;
import data.Person;
import data.SinhVien;
import MyLibrary.utill.Mylibrary;

public class Major {
	private String id;
	private String name;
	//private SinhVien sv[]=new SinhVien[100];
	//private int count=0;
	private Scanner sc=new Scanner(System.in);
	public Major(String id, String name) {
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

	
}
