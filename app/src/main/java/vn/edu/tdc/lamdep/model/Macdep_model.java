package vn.edu.tdc.lamdep.Model;

public class Macdep_model {

    public Macdep_model(int idDanhMucMacDep, int hinhAnh, String tenDanhMuc) {
        this.idDanhMucMacDep = idDanhMucMacDep;
        this.hinhAnh = hinhAnh;
        this.tenDanhMuc = tenDanhMuc;
    }



    public int getIdDanhMucMacDep() {
        return idDanhMucMacDep;
    }

    public void setIdDanhMucMacDep(int idDanhMucMacDep) {
        this.idDanhMucMacDep = idDanhMucMacDep;
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

    private int idDanhMucMacDep;
    private int hinhAnh;
    private String tenDanhMuc;
}
