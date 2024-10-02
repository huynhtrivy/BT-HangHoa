package huynhtrivy_23681901;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected int soLuongTon;
	protected double donGia;
	
	public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
	}
	
	public abstract double tinhVAT();
	public abstract String danhGiaMucDoBanBuon();
	@Override
	public String toString() {
		return "Ma hang: "+ maHang +", Ten hang: "+ tenHang +", So luong ton: "+ soLuongTon +", Don gia: "+ donGia;
	}
}