import java.util.Scanner;

public class SVtaichuc  extends SinhVien{
    private String diadiem;


    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap dia diem lien ket: ");
        diadiem = sc.nextLine();
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }
}
