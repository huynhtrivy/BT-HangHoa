package huynhtrivy_23681901;
import java.util.ArrayList;

public class QuanLyHangHoa {
    public static void main(String[] args) {
        ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();

        // Thêm dữ liệu mẫu
        danhSachHangHoa.add(new HangThucPham("TP01", "Sữa", 10, 20000, "2024-01-01", "2024-10-01", "Vinamilk"));
        danhSachHangHoa.add(new HangDienMay("DM01", "Tivi", 2, 5000000, 24, 200));
        danhSachHangHoa.add(new HangSanhSu("SS01", "Chén sứ", 60, 30000, "Gốm sứ Bát Tràng", "2024-09-01"));

        // Hiển thị danh sách hàng hóa và tính toán
        for (HangHoa hangHoa : danhSachHangHoa) {
            System.out.println(hangHoa.toString());
            System.out.println("VAT: " + hangHoa.tinhVAT());
            System.out.println("Đánh giá: " + hangHoa.danhGiaMucDoBanBuon());
            System.out.println("------------------------");
        }
    }
}