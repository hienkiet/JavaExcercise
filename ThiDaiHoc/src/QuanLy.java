import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

    private ArrayList<inforStudent> student = new ArrayList<>();
    public void input() {
        int themMoi;
        int luaChon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien ban muon them");
        themMoi = sc.nextInt();
        for(int i=0; i<themMoi; i++) {
            System.out.println("Sinh vien thi khoi (A/B/C):\n1.KhoiA\n2.KhoiB\n3.KhoiC\n");
            luaChon = sc.nextInt();
            if(luaChon == 1) {
                inforStudent a = new khoiA();
                a.input();
                student.add(a);
            }
            else if(luaChon == 2) {
                inforStudent b = new khoiB();
                b.input();
                student.add(b);
            }
            else if(luaChon == 3) {
                inforStudent c = new khoiC();
                c.input();
                student.add(c);
            }
            else {
                System.out.println("Ban da nhap sai");
                i--;
            }
        }
    }

    public void Output() {
        for(int i=0; i<student.size(); i++) {
            student.get(i).output();
        }
    }
    public void find() {
        String k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap SBD ban muon tim kiem");
        k = sc.nextLine();
        for(int i=0; i<student.size(); i++) {
            if(k.compareTo(student.get(i).studentID) ==0) {
                student.get(i).output();
                break;
            }
        }
    }
    public static void main(String[] args) {
        int luachon;
        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);
        for(;;) {
            do {
                System.out.println("\nMenu\n" + "1. Them thi sinh\n2. Hien thi thong tin\n3. Tim kiem\n4. Exit\nMoi ban nhap lua chon");
                luachon = sc.nextInt();
            } while (luachon <1 || luachon >4);
            switch (luachon) {
                case 1:
                    ql.input();
                    break;
                case 2:
                    ql.Output();
                    break;
                case 3:
                    ql.find();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
