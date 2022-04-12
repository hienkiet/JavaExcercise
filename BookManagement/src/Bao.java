import java.util.Scanner;

public class Bao extends TaiLieu{
    private int dateRelease;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh: ");
        dateRelease = sc.nextInt();
    }
    public void output() {
        super.output();
        System.out.println(", ngay phat hanh la ngay: " + dateRelease + "\n");
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }
}
