import java.util.ArrayList;
import java.util.Scanner;

public class BienLai {

    protected int oldNumber;
    protected int newNumber;
    protected int bill;
    KhachHang khachHang;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap so dien cu");
        oldNumber = sc.nextInt();
        System.out.println("\nNhap so dien moi");
        newNumber = sc.nextInt();
    }

    public void calculate() {
        bill = (newNumber - oldNumber) *5;
    }

    public void output() {
        calculate();
        System.out.println(", so dien cu la " + oldNumber + ", so dien moi la " + newNumber + ". So tien can phai tra la: " + bill);

    }

    public BienLai() {
    }
    public BienLai( int oldNumber, int newNumber, int bill) {

        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.bill = bill;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
