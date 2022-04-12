import java.util.Scanner;

import static java.lang.System.*;

public class KhachHang {
    protected String name;
    protected int address;
    public int ID;
    public void input() {
        Scanner sc = new Scanner(in);
        out.println("\n Nhap ten chu nha: ");
        name = sc.nextLine();
        out.println("\nNhap dia chi nha: ");
        address = sc.nextInt();
        out.println("\nNhap ma so cong to dien");
        ID = sc.nextInt();

    }
    public void output() {
        out.printf("Khach hang co ten la: " + name + ", o tai dia chi: "+ address + ", co ma so cong to dien la: " + ID);

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
