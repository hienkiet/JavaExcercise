import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    int n=0;
    int k;

    ArrayList<TaiLieu> taiLieu = new ArrayList<>();
    public void input() {
        int themMoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai lieu: ");
        themMoi = sc.nextInt();

        for(int i=0; i<(themMoi); i++) {
            System.out.println("Ban muon nhap loai tai lieu nao: \n1.Bao \n2.Tap chi \n3.Sach");
            k = sc.nextInt();
            if(k==1) {
                TaiLieu bao = new Bao();
                bao.input();
                taiLieu.add(bao);
            }
            else if(k==2) {
                TaiLieu tapchi = new TapChi();
                tapchi.input();
                taiLieu.add(tapchi);
            }
            else if(k==3) {
                TaiLieu sach = new Sach();
                sach.input();
                taiLieu.add(sach);
            }
            else {
                System.out.println("Ban da nhap sai");
                i--;
            }

        }
        n += themMoi;
    }
    public void output() {
        for(int i=0; i<taiLieu.size(); i++) {
            taiLieu.get(i).output();
        }
    }
    public void delete() {
        String code;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nNhap ma so tai lieu ma ban muon tim kiem: ");
        code = sc.nextLine();
        for(int i=0; i< taiLieu.size(); i++) {
            if(code.compareTo(taiLieu.get(i).bookID) == 0) {
                taiLieu.remove(i);
                break;
            }
        }
    }
    public void find() {
        int luachon;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap ten loai tap chi ban muon tim\n1.Bao\n2.Tap chi\n3.Sach");
        luachon = sc.nextInt();
        for(int i=0; i< taiLieu.size(); i++) {
            if( luachon ==1 && taiLieu.get(i) instanceof Bao) {
                taiLieu.get(i).output();
            }
            else if( luachon ==2 && taiLieu.get(i) instanceof TapChi) {
                taiLieu.get(i).output();
            }
            else if( luachon ==1 && taiLieu.get(i) instanceof Bao) {
                taiLieu.get(i).output();
            }
        }

    }
    public static void main(String[] args) {
        int luachon;
        QuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("Menu\n" + "1. Them sach\n2. Xoa tai lieu\n3. Hien thi thong tin tai lieu\n4. Tìm kiếm tài liệu\n5. Exit\nMoi ban nhap lua chon");
            do {
                System.out.println("Bấm số để chọn (1/2/3/4/5): ");
                luachon = sc.nextInt();
            } while ((luachon < 1) || (luachon > 5));
            switch (luachon) {
                case 1:
                    ql.input();
                    break;
                case 2:
                    ql.delete();
                    break;
                case 3:
                    ql.output();
                    break;
                case 4:
                    ql.find();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

}
