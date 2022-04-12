import java.util.Scanner;

public class TaiLieu {
    protected String bookID;
    protected String publisher;
    protected int countRelease;
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Nhap ma tai lieu: ");
        bookID = sc.nextLine();
        System.out.println("Nhap ten nha xuat ban");
        publisher = sc.nextLine();
        System.out.println("Nhap so ban phat hanh");
        countRelease = sc.nextInt();
    }
    public void output() {
        System.out.println("Ma tai lieu la: " + bookID + ", ten nha xuat ban la: " + publisher + ", so ban phat hanh la: " + countRelease);
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
}
