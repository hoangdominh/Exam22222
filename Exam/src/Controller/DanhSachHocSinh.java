package Controller;

import Model.HocSinh;

import java.util.*;

public class DanhSachHocSinh {
    private ArrayList<HocSinh> hocSinhList;
    Scanner scanner = new Scanner(System.in);


    public DanhSachHocSinh() {
        this.hocSinhList = new ArrayList<HocSinh>();

    }

    public DanhSachHocSinh(ArrayList<HocSinh> hocSinhList) {
        this.hocSinhList = new ArrayList<HocSinh>();

    }

    //  Cho phép nhập vào học sinh các lớp
    public void addHocSinh(HocSinh hocSinh) {
        this.hocSinhList.add(hocSinh);
    }


//  In ra màn hình danh sách học sinh của các lớp

    public void inDanhSachHocSinh() {
        ArrayList<HocSinh> hocSinhLop1A = new ArrayList<HocSinh>();
        ArrayList<HocSinh> hocSinhLop1B = new ArrayList<HocSinh>();
        ArrayList<HocSinh> hocSinhLop1C = new ArrayList<HocSinh>();
        for(HocSinh hocSinh : hocSinhList){
            if(hocSinh.getTenLop().equals("Lớp 1A")){
                hocSinhLop1A.add(hocSinh);
            }
            else if(hocSinh.getTenLop().equals("Lớp 1B")){
                hocSinhLop1B.add(hocSinh);
            }
            else if(hocSinh.getTenLop().equals("Lớp 1C")){
                hocSinhLop1C.add(hocSinh);
            }else {
                System.out.println("Nhập sai tên lớp ");
            }
        }
        System.out.println("Danh Sách lớp 1A: ");
        for (HocSinh hocSinh : hocSinhLop1A){
            System.out.println(hocSinh);
        }
        System.out.println("Danh Sách lớp 1B: ");
        for (HocSinh hocSinh : hocSinhLop1B){
            System.out.println(hocSinh);
        }

        System.out.println("Danh Sách lớp 1C: ");
        for (HocSinh hocSinh : hocSinhLop1C){
            System.out.println(hocSinh);
        }

    }


//   Nhập ID học sinh cho sửa thông tin học sinh
    public void suaThongTinHocSinh(){
            System.out.println("Nhập id học sinh bạn muốn sửa: ");
            int id = Integer.parseInt(scanner.nextLine());
            for (HocSinh hocSinh : hocSinhList){
                if(hocSinh.getId() == id){
                    hocSinh.getHoVaTen();
                    hocSinh.getNgaySinh();
                }
            }

        }

//   Nhập ID học sinh cho xóa thông tin học sinh

    public void xoaThongTinHocSinh(HocSinh hocSinh){
        System.out.println("Nhập id học sinh bạn muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (HocSinh o : hocSinhList){
            if(o.getId()==(id)){
                hocSinhList.remove(o);
                break;
            }
        }
    }


//  Nhập tên và tìm kiếm học sinh trong list học sinh đã nhập
    public void timHocSinh(String hoVaTen){
        for (HocSinh hocSinh : hocSinhList){
            if(hocSinh.getHoVaTen().indexOf(hoVaTen) >=0){
                System.out.println(hoVaTen);
            }
        }
    }

//  In ra danh sách sắp xếp theo tên
    public void inDanhSachXepSepTheoTen(){
        Collections.sort(this.hocSinhList, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.getHoVaTen().toUpperCase(Locale.ROOT).equals(o2.getHoVaTen().toUpperCase(Locale.ROOT))){
                    return 1;
                } else{
                    return -1;
                }
            }
        });
    }

//  Nhập vào năm sinh, in ra danh sách học sinh trong năm đó

    public void timNamSinh(String namSinh){
        for (HocSinh hocSinh :hocSinhList){
            if (hocSinh.getNgaySinh().indexOf(namSinh)>=0){
                System.out.println(hocSinh);
            }
        }
    }

}