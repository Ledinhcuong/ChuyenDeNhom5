package vn.edu.tdc.lamdep.Model;

public class DangDep_model {
    public DangDep_model(int idDanhMucDangDep, int hinhAnh, String tenDanhMuc) {
        this.idDanhMucDangDep = idDanhMucDangDep;
        this.hinhAnh = hinhAnh;
        this.tenDanhMuc = tenDanhMuc;
    }

    private int idDanhMucDangDep;

    public int getIdDanhMucDangDep() {
        return idDanhMucDangDep;
    }

    public void setIdDanhMucDangDep(int idDanhMucDangDep) {
        this.idDanhMucDangDep = idDanhMucDangDep;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    private int hinhAnh;
    private String tenDanhMuc;
}
