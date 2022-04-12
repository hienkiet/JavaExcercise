import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int numberRelease;
    private int monthRelease;
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phat hanh: ");
        numberRelease = sc.nextInt();
        System.out.println("Nhap thang phat hanh");
        monthRelease = sc.nextInt();
    }
    public void output() {
        super.output();
        System.out.println(", so phat hanh la: " + numberRelease + ", thang phat hanh la thang: " + monthRelease + "\n");
    }
    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }
}
