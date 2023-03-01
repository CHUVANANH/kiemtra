package Cau2;

public class Kythuat extends Nhanvien{
    private String chuyennganh;
    public Kythuat(){
    }
    @Override
    public String moTaCongViec() {
        return chuyennganh;
    }
    public Kythuat(String mnv) {
        super(mnv);
    }
    public Kythuat(String mnv, String hoten, String namsinh, String diachi, String chuyennganh) {
        super(mnv, hoten, namsinh, diachi);
        this.chuyennganh = chuyennganh;
    }
    public String getChuyennganh() {
        return chuyennganh;
    }
    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    @Override
    public String toString() {
        return "Kythuat[" + super.toString() +"chuyen nganh='" + chuyennganh + '\'' +
                ']';
    }
}
