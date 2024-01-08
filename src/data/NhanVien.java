package data;
import java.util.Scanner;

import MyLibrary.utill.Mylibrary;
public abstract class NhanVien extends Person {
	protected double salaryFactor;
	protected String startDayWork;
	//private NhanVien nv[] = new NhanVien[100];
	//private int count=0;
	private static Scanner sc=new Scanner(System.in);
	public NhanVien(String id, String name, String dateOfBirth, double salaryFactor, String startDayWork) {
		super(id, name, dateOfBirth);
		this.salaryFactor = salaryFactor;
		this.startDayWork = startDayWork;
	}
	public double getSalaryFactor() {
		return salaryFactor;
	}
	public void setSalaryFactor(double salaryFactor) {
		this.salaryFactor = salaryFactor;
	}
	public String getStartDayWork() {
		return startDayWork;
	}
	public void setStartDayWork(String startDayWork) {
		this.startDayWork = startDayWork;
	}
	// hàm nhập thông tin của nhân viên
	public  void inputNhanVien() {
		inputPerson();
		double salaryFactor;
		String startDayWork;
		salaryFactor=Mylibrary.inputDouble("Hệ số lương: "," Vui lòng nhập đúng", 0,10);
		System.out.print("Ngày bắt đầu làm: ");
		startDayWork=sc.nextLine();
		
	}
	public void outputNhanVien() {
		outputPerson();
		System.out.println("Hệ số lương: " + salaryFactor );
		System.out.println("Ngày vào làm: " + startDayWork );
	}
	// hàm abstract chưa định nghĩa cần các hàm con định nghĩa 
	public abstract double salary(String a);
	public void inputGiangVien() {
		inputNhanVien();
		inputNhanVien();
		String khoa;
		String trinhDo;
		System.out.print("Khoa: ");
		khoa=sc.nextLine();
		System.out.print("Trình độ: ");
		trinhDo=sc.nextLine();
		NhanVien nv = new GiangVien(id,name,dateOfBirth,salaryFactor,startDayWork,khoa,trinhDo);
		
	}
	public void inputNhanVienHC() {
		inputNhanVien();
		String chucVu;
		chucVu = sc.nextLine();
		NhanVien nv=new NVHanhChinh(id,name,dateOfBirth,salaryFactor,startDayWork, chucVu);
		
	}
	public void outputNVGV() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Date of birth: "+dateOfBirth);
		System.out.println("Salary Factor: "+salaryFactor);
		System.out.println("Start Day Work: "+startDayWork);
		
	}
	

}
