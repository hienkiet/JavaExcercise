import java.util.ArrayList;
import java.util.Scanner;

public class Khoa {
    private int luachon;
    Scanner sc = new Scanner(System.in);
    private String tenKhoa;
    public Khoa() {
    }

    public void input() {
        System.out.println("\nNhap ten khoa ma sinh vien do dang hoc: \n1.CNTT\n2.Toan tin\n3.CNTP");
        luachon = sc.nextInt();
        if (luachon ==1) tenKhoa = "Cong nghe thong tin";
        else if(luachon ==2) tenKhoa = "Toan tin";
        else if(luachon == 3) tenKhoa = "Cong nghe thuc pham";
    }
    public void output() {

    }

    public int getLuachon() {
        return luachon;
    }

    public void setLuachon(int luachon) {
        this.luachon = luachon;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
}
