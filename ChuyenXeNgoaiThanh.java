package do_an_nhom8;
import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    

	@Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nơi đến: ");
        noiDen = scanner.nextLine();
        System.out.print("Nhập số ngày đi được: ");
      //yêu cầu nhập dữ liệu theo kiểu int
        while (true) {
            try {
                soNgayDiDuoc = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số ngày đi được không hợp lệ. Vui lòng nhập lại.");
                System.out.print("Nhập số ngày đi được: ");
            }
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Nơi đến: " + noiDen);
        System.out.println("Số ngày đi được: " + soNgayDiDuoc);
    }

	public double getDoanhThu() {
		return 0;
	}
}
