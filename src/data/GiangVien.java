package data;

import java.util.Scanner;

public class GiangVien extends NhanVien {
	private String khoa;
	private String trinhDo;
	private static Scanner sc=new Scanner(System.in);
	public GiangVien(String id, String name, String dateOfBirth, double salaryFactor, String startDayWork, String khoa,
			String trinhDo) {
		super(id, name, dateOfBirth, salaryFactor, startDayWork);
		khoa = khoa;
		this.trinhDo = trinhDo;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		khoa = khoa;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	// HÀM NHẬP THÔNG TIN GIẢNG VIÊN
	public void inputGiangVien() {
		inputNhanVien();
		String khoa;
		String trinhDo;
		System.out.print("Khoa: ");
		khoa=sc.nextLine();
		System.out.print("Trình độ: ");
		trinhDo=sc.nextLine();
	}
	public double salary(String trinhDo) {
		if(trinhDo.compareTo("Tiến sĩ")==0) {
			return 5000000*salaryFactor;
		}
		else if(trinhDo.compareTo("Thạc sĩ")==0) {
			return 3000000*salaryFactor;
		}
		else 
			return 2000000*salaryFactor;
		
	}
	public void outputGiangVien() {
		outputNhanVien();
//		System.out.println("Id: "+id);
//		System.out.println("Name: "+name);
//		System.out.println("Date of birth: "+dateOfBirth);
//		System.out.println("Salary Factor: "+salaryFactor);
//		System.out.println("Start Day Work: "+startDayWork);
		System.out.println("Khoa: " + khoa);
		System.out.println("Trình Độ: " + trinhDo );
	}
}
