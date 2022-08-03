package Model;

import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class HocSinh implements Comparator<HocSinh> {
    private int id;
    private String hoVaTen;
    private Date ngaySinh;

    private String tenLop;

    private LopHoc lopHoc;

    static int count =0;

    public HocSinh(int id) {
        id = ++count;
    }

    public HocSinh(String hoVaTen, Date ngaySinh, String tenLop) {
        id = ++count;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.tenLop = tenLop;

    }

    public int getId() {
        return id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public static Date inputBirthday() {
        Scanner scanner = new Scanner(System.in);
        String birthDay = scanner.nextLine();
        Date ngaySinh = new Date(birthDay);
        return ngaySinh;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        hoVaTen = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        inputBirthday();

    }
    @Override
    public int compare(HocSinh student1, HocSinh student2) {
        return student2.hoVaTen.compareTo(student1.hoVaTen);
    }


    @Override
    public String toString() {
        return "Hoc Sinh {" +
                "id = " + id +
                ", Họ Và Tên ='" + hoVaTen + '\'' +
                ", Ngày Sinh =" + ngaySinh +
                ",  Tên Lớp ='" + tenLop + '\'' +
                '}';
    }
}