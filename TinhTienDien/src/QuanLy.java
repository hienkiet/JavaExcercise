import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<BienLai> bienlai = new ArrayList<>();
    ArrayList<KhachHang> khachhang = new ArrayList<>();
    public void Input() {
        Scanner sc = new Scanner(System.in);
        int themMoi=0;
        System.out.println("\nBan muon them bao nhieu?");
        themMoi = sc.nextInt();
        for(int i=0; i<themMoi; i++) {
            BienLai newBienLai = new BienLai();
            KhachHang newKhachHang = new KhachHang();
            newKhachHang.input();
            newBienLai.input();
            bienlai.add(newBienLai);
            khachhang.add(newKhachHang);
        }
    }
    public void output() {
        for(int i=0; i< bienlai.size(); i++) {
            System.out.printf((i+1) + ". ");
            khachhang.get(i).output();
            bienlai.get(i).output();

        }
    }
    public void delete() {
            int code;
            Scanner sc = new Scanner(System.in);

            System.out.println("\nNhap ma so cong to dien: ");
            code = sc.nextInt();
            for(int i=0; i< bienlai.size(); i++) {
                if(code == khachhang.get(i).getID()) {
                    bienlai.remove(i);
                    khachhang.remove(i);
                    break;
                }
            }
        }

    public void calculate() {
        for(int i=0; i< bienlai.size(); i++) {
            //bienlai.get(i).calculate();
            System.out.println((i+1) + ". " + bienlai.get(i).getBill());
        }
    }
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);
        int luachon;
        for(;;) {
            do {
                System.out.println("\nMenu:\n1.Them\n2.Xoa\n3.Tinh tien dien\n4.Hien thi danh sach");
                luachon = sc.nextInt();
            }while (luachon<1 || luachon >4);
            switch (luachon) {
                case 1:
                    ql.Input();
                    break;
                case 2:
                    ql.delete();
                    break;
                case 3:
                    ql.calculate();
                    break;
                case 4:
                    ql.output();
            }

        }
    }

}
