package huynhtrivy_23681901;
public class HangThucPham extends HangHoa{
	private String ngaySanXuat;
	private String ngayHetHan;
	private String nhaCungCap;
	
	public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, String ngaySanXuat,
			String ngayHetHan, String nhaCungCap) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}

	@Override
	public double tinhVAT() {
		return donGia * 0.05;
	}

	@Override
	public String danhGiaMucDoBanBuon() {
		if(soLuongTon > 0 && ngayHetHan.compareTo("today") <= 0) {
			return "Kho ban";
		}
		else
			return "Ban duoc";
	}
}
