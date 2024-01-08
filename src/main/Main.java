package main;
import data.Person;
import data.SinhVien;
import data.Major;
import data.NVHanhChinh;
import data.Khoa;
import data.GiangVien;
import data.NhanVien;

import java.util.Scanner;

import MyLibrary.utill.Mylibrary;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien sv[]= new SinhVien[100];
		int countSV=0;
		NhanVien nv[]= new NhanVien[30];
		int countNV=0;
		Khoa khoa[]=new Khoa[10];
		int countK=0;
		System.out.println("1.Nhập sinh viên");
		System.out.println("2.Nhập nhân viên");
		System.out.println("3.Xuất nhân viên");
		System.out.println("4.Xuất sinh viên");
		int choose ;
		choose=Mylibrary.inputInteger("Input your choice: ","Vui lòng nhập từ 1-6",0,6);
		if (choose==1) {
			sv[countSV].inputSinhVien1();
			countSV++;
		}
		if (choose==2) {
			System.out.println("1. Nhập giảng viên");
			System.out.println("2. Nhập nhân viên hành chính");
			int choice;
			choice=Mylibrary.inputInteger("Input your choice","Vui lòng nhập từ 1-2",0,3);
			if(choice==1) {
				nv[countNV].inputGiangVien();
				countNV++;
			}
			else 
				nv[countNV].inputNhanVienHC();
				countNV++;
		}
		if(choose==3) {
			for (int i=0;i<countNV;i++) {
				if(nv[i] instanceof GiangVien) {
					((GiangVien)nv[i]).outputGiangVien();
				}
				else if(nv[i] instanceof GiangVien) {
					((NVHanhChinh)nv[i]).outputNVHanhChinh();
				}
		}
	}

}
}
