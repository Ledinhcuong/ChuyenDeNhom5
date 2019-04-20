package vn.edu.tdc.lamdep.Model;

public class OutfitThoiTrang_model  {
    private int id;
    private int hinhAnh;
    private String tenbaiviet;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTenbaiviet() {
        return tenbaiviet;
    }

    public void setTenbaiviet(String tenbaiviet) {
        this.tenbaiviet = tenbaiviet;
    }



    public OutfitThoiTrang_model(int id, int hinhAnh, String tenbaiviet) {
        this.id = id;
        this.hinhAnh = hinhAnh;
        this.tenbaiviet = tenbaiviet;
    }


}
