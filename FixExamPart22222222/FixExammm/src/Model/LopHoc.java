package Model;

public class LopHoc {
    private int id;
    private String tenLop;
    static int count =0;
    private String tenGiaoVien;

    public LopHoc() {
        id = ++count;
    }

    public LopHoc(String tenLop, String tenGiaoVien) {
        id = ++count;
        this.tenLop = tenLop;
        this.tenGiaoVien = tenGiaoVien;
    }

    public int getId() {
        return id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getTenGiaoVien() {
        return tenGiaoVien;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setTenGiaoVien(String tenGiaoVien) {
        this.tenGiaoVien = tenGiaoVien;
    }

    @Override
    public String toString() {
        return "Lớp hoc{" +
                "id=" + id +
                ", tenLop='" + tenLop + '\'' +
                ", tenGiaoVien='" + tenGiaoVien + '\'' +
                '}';
    }
}