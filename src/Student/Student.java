package Student;

import java.util.Date;

public class Student {
    private int Masv;
    private String HvTen;
    private String NSinh;
    private int GTinh;
    private String QueQuan;
    private Float Toan,Ly,Hoa;

    public  Student()
    {

    }

    public Student(int Masv , String HvTen,String Nsinh, int Gtinh, String QueQuan,Float Toan,Float Ly,Float Hoa)
    {
        this.Masv = Masv;
        this.HvTen = HvTen;
        this.NSinh = Nsinh;
        this.GTinh = Gtinh;
        this.QueQuan = QueQuan;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;

    }

    public  int getMasv()
    {
        return Masv;
    }

    public void setMasv(int masv) {
        Masv = masv;
    }

    public String getHvTen() {
        return HvTen;
    }

    public void setHvTen(String hvTen) {
        HvTen = hvTen;
    }

    public String getNSinh() {
        return NSinh;
    }

    public void setNSinh(String NSinh) {
        this.NSinh = NSinh;
    }

    public int isGTinh() {
        return GTinh;
    }

    public void setGTinh(int GTinh) {
        this.GTinh = GTinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public Float getToan() {
        return Toan;
    }

    public void setToan(Float toan) {
        Toan = toan;
    }

    public Float getLy() {
        return Ly;
    }

    public void setLy(Float ly) {
        Ly = ly;
    }

    public Float getHoa() {
        return Hoa;
    }

    public void setHoa(Float hoa) {
        Hoa = hoa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Masv=" + Masv +
                ", HvTen='" + HvTen + '\'' +
                ", NSinh='" + NSinh + '\'' +
                ", GTinh=" + GTinh +
                ", QueQuan='" + QueQuan + '\'' +
                ", Toan=" + Toan +
                ", Ly=" + Ly +
                ", Hoa=" + Hoa +
                '}';
    }
}
