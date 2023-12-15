package do_an_nhom8;
import java.util.Scanner;
public class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã số chuyến: ");
        maSoChuyen = scanner.nextLine();
        System.out.print("Nhập họ tên tài xế: ");
        hoTenTaiXe = scanner.nextLine();
        System.out.print("Nhập số xe: ");
        soXe = scanner.nextLine();
        System.out.print("Nhập doanh thu: ");
        doanhThu = scanner.nextDouble();
    }

    public void xuatThongTin() {
        System.out.println("Mã số chuyến: " + maSoChuyen);
        System.out.println("Họ tên tài xế: " + hoTenTaiXe);
        System.out.println("Số xe: " + soXe);
        System.out.println("Doanh thu: " + doanhThu);
    }
}