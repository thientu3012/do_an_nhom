package do_an_nhom8;
import java.util.Scanner;

public class QuanLyChuyenXe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int nNoiThanh = 0;
        int nNgoaiThanh = 0;
//khai báo 2 mảng 
        ChuyenXeNoiThanh[] chuyenXeNoiThanh = null;
        ChuyenXeNgoaiThanh[] chuyenXeNgoaiThanh = null;
        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Nhập thông tin chuyến xe nội thành");
            System.out.println("2. Nhập thông tin chuyến xe ngoại thành");
            System.out.println("3. Hiển thị danh sách chuyến xe nội thành");
            System.out.println("4. Hiển thị danh sách chuyến xe ngoại thành");
            System.out.println("5. Tính tổng doanh thu chuyến xe nội thành");
            System.out.println("6. Tính tổng doanh thu chuyến xe ngoại thành");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng chuyến xe nội thành: ");
                    nNoiThanh = scanner.nextInt();
                    chuyenXeNoiThanh = new ChuyenXeNoiThanh[nNoiThanh];

                    System.out.println("Nhập thông tin chuyến xe nội thành:");
                    for (int i = 0; i < nNoiThanh; i++) {
                        System.out.println("Nhập thông tin chuyến xe nội thành thứ " + (i + 1) + ":");
                        chuyenXeNoiThanh[i] = new ChuyenXeNoiThanh();
                        chuyenXeNoiThanh[i].nhapThongTin();
                    }
                    break;

                case 2:
                    System.out.print("Nhập số lượng chuyến xe ngoại thành: ");
                    nNgoaiThanh = scanner.nextInt();
                    chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh[nNgoaiThanh];

                    System.out.println("Nhập thông tin chuyến xe ngoại thành:");
                    for (int i = 0; i < nNgoaiThanh; i++) {
                        System.out.println("Nhập thông tin chuyến xe ngoại thành thứ " + (i + 1) + ":");
                        chuyenXeNgoaiThanh[i] = new ChuyenXeNgoaiThanh();
                        chuyenXeNgoaiThanh[i].nhapThongTin();
                    }
                    break;

                case 3:
                    System.out.println("\nDanh sách chuyến xe nội thành:");
                    for (int i = 0; i < nNoiThanh; i++) {
                        chuyenXeNoiThanh[i].xuatThongTin();
                    }
                    break;

                case 4:
                    System.out.println("\nDanh sách chuyến xe ngoại thành:");
                    for (int i = 0; i < nNgoaiThanh; i++) {
                        chuyenXeNgoaiThanh[i].xuatThongTin();
                    }
                    break;

                case 5:
                    double tongDoanhThuNoiThanh = 0;
                    for (int i = 0; i < nNoiThanh; i++) {
                        tongDoanhThuNoiThanh += chuyenXeNoiThanh[i].getDoanhThu();
                    }
                    System.out.println("Tổng doanh thu chuyến xe nội thành: " + tongDoanhThuNoiThanh);
                    break;

                case 6:
                    double tongDoanhThuNgoaiThanh = 0;
                    for (int i = 0; i < nNgoaiThanh; i++) {
                        tongDoanhThuNgoaiThanh += chuyenXeNgoaiThanh[i].getDoanhThu();
                    }
                    System.out.println("Tổng doanh thu chuyến xe ngoại thành: " + tongDoanhThuNgoaiThanh);
                    break;
                default:
                    System.out.print("Lựa chọn cua bạn đã sai mời bạn nhập lại");
        } 
        }while (choice != 0);  
    }
}
