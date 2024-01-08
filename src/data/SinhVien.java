package data;

import java.util.Scanner;
import MyLibrary.utill.Mylibrary;
public class SinhVien extends Person {
	private String major;
	private String khoa;
	private double gpa;
//	private SinhVien sv[]=new SinhVien[100];
//	private int count=0;
	private Scanner sc=new Scanner(System.in);
	public SinhVien(String id, String name, String dateOfBirth, String major, String khoa, double gpa) {
		super(id, name, dateOfBirth);
		this.major = major;
		this.khoa = khoa;
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	// hàm nhập thông tin sinh viên
	public void inputSinhVien1() {
		inputPerson();
		String major;
		String khoa;
		double gpa;
		System.out.print("Major: ");
		major=sc.nextLine();
		System.out.print("Khoa: ");
		khoa=sc.nextLine();
		gpa=Mylibrary.inputDouble("Gpa: "," Vui lòng nhập số từ 1-10: ",1, 10);
		SinhVien x= new SinhVien( id, name, dateOfBirth, major, khoa,  gpa);
		}
}
