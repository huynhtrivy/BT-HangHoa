package huynhtrivy_23681901;

public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh; //tinh bang thang
	private double congSuat; //tinh bang KW
	
	
public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh,
		double congSuat) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}
	@Override
	public double tinhVAT() {
		return donGia*0.1;
	}
	@Override
	public String danhGiaMucDoBanBuon() {
		if (soLuongTon < 3) {
			return "Ban duoc";
		} else {
			return "Chua danh gia";
		}
	}
}
