package do_an_nhom8;
import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;

	@Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tuyến: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhập số km đi được: ");
        //yêu cầu nhập dữ liệu theo kiểu double
        while (true) {
            try {
                soKmDiDuoc = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số km đi được không hợp lệ. Vui lòng nhập lại.");
                System.out.print("Nhập số km đi được: ");
            }
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số tuyến: " + soTuyen);
        System.out.println("Số km đi được: " + soKmDiDuoc);
    }

	public double getDoanhThu() {
		return doanhThu;
	}
}
