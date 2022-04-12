import java.util.Scanner;

public class Sach extends  TaiLieu{
    private String author;
    private int numberOfPage;
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        author = sc.nextLine();
        System.out.println("Nhap so trang");
        numberOfPage = sc.nextInt();
    }
    public void output() {
        super.output();
        System.out.println(", ten tac gia la : " + author + ", so trang la: " + numberOfPage + "\n");
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
