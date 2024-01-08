package data;

import java.util.Scanner;

public class NVHanhChinh extends NhanVien {
	private String chucVu;
	private int count =0;
	private static Scanner sc=new Scanner(System.in);
	public NVHanhChinh(String id, String name, String dateOfBirth, double salaryFactor, String startDayWork,
			String chucVu) {
		super(id, name, dateOfBirth, salaryFactor, startDayWork);
		this.chucVu = chucVu;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	// hàm nhập thông tin
	public void inputNVHanhChinh() {
		inputNhanVien();
		String chucVu;
		chucVu = sc.nextLine();
	}
	// hàm xuât thông tin
	public void outputNVHanhChinh() {
		outputNhanVien();
		System.out.println("Chức vụ: " + chucVu );
		
	}
	// HÀM TÍNH LƯƠNG
	public double salary(String chucVu) {
		if(chucVu.compareTo("Nhân viên")==0) {
			return 1000000*salaryFactor;
		}
		else if(chucVu.compareTo("Phó phòng")==0) {
			return 2000000*salaryFactor;
		}
		else {
			return 3000000*salaryFactor;
		}
	}
}
