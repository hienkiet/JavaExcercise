import java.util.Scanner;

public class inforStudent {

    protected String studentID;
    protected String name;
    protected String address;
    protected int priorityLevel;
    public inforStudent() {

    }

    public inforStudent(String studentID, String name, String address, int priorityLevel) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
    }

    public void input() {
          System.out.println("Nhap SBD: ");
          studentID = sc.nextLine();
          System.out.println("Nhap ten: ");
          name = sc.nextLine();
          System.out.println("Nhap dia chi: ");
          address = sc.nextLine();
          System.out.println("Nhap muc do uu tien: ");
          priorityLevel = sc.nextInt();
    }
    public void output() {
        System.out.printf(c"\nSinh vien co SBD: " + studentID + ", ten la: " +name + ", dia chi la: " + address + ", muc do uu tien la: " + priorityLevel);
    }


    Scanner sc = new Scanner(System.in);
}
