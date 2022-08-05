package View;

import Controller.DanhSachHocSinh;
import Model.HocSinh;
import Model.LopHoc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static Model.HocSinh.inputBirthday;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<LopHoc> lopHocs = new ArrayList<>();

        lopHocs.add(new LopHoc("Lớp 1A","Nguyễn Thị Huyền"));
        lopHocs.add(new LopHoc("Lớp 1B","Nguyễn Thị Thơm"));
        lopHocs.add(new LopHoc("Lớp 1C","Nguyễn Thị Lan"));
        System.out.println(lopHocs);

        DanhSachHocSinh dshs = new DanhSachHocSinh();
        int luaChon =0;
        do {
            System.out.println("----------------Menu------------");
            System.out.println("1. Cho phép nhập học sinh vào các lớp");
            System.out.println("2. In ra màn hình danh sách học sinh của các lớp (Lớp 1A, Lớp 1B, Lớp 1C)");
            System.out.println("3. Nhập ID học sinh cho sửa thông tin học sinh: ");
            System.out.println("4. Nhập ID học sinh cho xóa thông tin học sinh: ");
            System.out.println("5. Nhập tên vào tìm kiếm học sinh trong list học sinh đã nhập.");
            System.out.println("6. In ra danh sách học sinh sắp xếp theo tên");
            System.out.println("7. Nhập vào năm sinh, In ra danh sách học sinh cho năm đó");
            System.out.println("0. Thoát chương trình ");
            System.out.println("Chọn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if(luaChon == 1){
                System.out.println("Nhập họ và tên: ");String hoVaTen = scanner.nextLine();
                System.out.println("Nhập ngày tháng năm sinh: ");
                Date ngaySinh = inputBirthday();
                System.out.println("Nhập lớp( Theo định dạng <Lớp 1A hoặc Lớp 1B hoặc Lớp 1C>): "); String tenLop = scanner.nextLine();
                HocSinh hocSinh = new HocSinh(hoVaTen,ngaySinh,tenLop);
                dshs.addHocSinh(hocSinh);
            }
            else if(luaChon == 2){
                dshs.inDanhSachHocSinh();
            }
            else if(luaChon == 3){
                dshs.suaThongTinHocSinh();
            }
            else if(luaChon == 4){
                dshs.xoaThongTinHocSinh();

            }else if(luaChon == 5){
                System.out.println("Nhập tên học sinh mà bạn muốn tìm: ");String ten = scanner.nextLine();
                dshs.timHocSinh(ten);
            }
            else if(luaChon ==6){
                dshs.inDanhSachXepSepTheoTen();
                dshs.inDanhSachHocSinh();
            } else if (luaChon ==7) {
                System.out.println("Nhập năm sinh: "); int namSinh = scanner.nextInt();
                dshs.timNamSinh(namSinh);
            }

        } while (luaChon!=0);
    }

}