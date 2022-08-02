package Model;

import java.util.Date;
import java.util.Scanner;

public class HocSinh {
    private int id;
    private String hoVaTen;
    private String ngaySinh;

    private String tenLop;

    private LopHoc lopHoc;

    static int count =0;

    public HocSinh(int id) {
        id = ++count;
    }

    public HocSinh(String hoVaTen, String ngaySinh, String tenLop) {
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

    public String getNgaySinh() {
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

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
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
