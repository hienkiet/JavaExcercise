import java.util.*;

public class QuanLy {
    ArrayList<SinhVien> sv = new ArrayList<>();
    public void input() {
        int n;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien ban muon them");
        n = sc.nextInt();
        for(int i=0; i< n; i++) {
            do {
                System.out.println("Nhap sinh vien thu " + (i+1) + ": \n1.Chinh quy\n2.Tai chuc");
                k = sc.nextInt();
            }while(k <0 || k>2);
            if(k==1) {
                SinhVien a = new SVchinhquy();
                a.input();
                sv.add(a);
            }
            else if(k ==2) {
                SinhVien b = new SVtaichuc();
                b.input();
                sv.add(b);
            }
        }
    }
    public void output() {
        for(int i=0; i< sv.size(); i++) {
            System.out.println("Sinh vien thu "+ (i+1));
            sv.get(i).output();
        }
    }
    public void xacdinhCQ() {
        Scanner sc = new Scanner(System.in);
        int j;

        System.out.println("Moi ban nhap mssv cua sinh vien do");
        j= sc.nextInt();
        for(int i=0; i< sv.size(); i++) {
            if(sv.get(i) instanceof SVchinhquy && j == sv.get(i).getMssv()) {
                System.out.println("sinh vien do thuoc chinh quy");
                return;
            }
        }
        System.out.println("sinh vien do khong thuoc chinh quy");
    }
    public void layDiemTB() {
        Scanner sc = new Scanner(System.in);
        int cloneMSSV;
        int cloneHK;
        int j=0;
        System.out.println("Moi ban nhap mssv cua sinh vien do");
        cloneMSSV= sc.nextInt();
        System.out.println("Moi ban nhap hoc ky can tim kiem cua sinh vien do");
        cloneHK = sc.nextInt();
        for(int i=0; i< sv.size(); i++) {
            if(cloneMSSV == sv.get(i).getMssv()) {
                j = i;
                break;
            }
        }
        for(int i=0; i<sv.get(j).getKetqua().diemTB.size(); i++) {
            if(sv.get(j).getKetqua().hk.get(i) == cloneHK ) {
                System.out.println("Diem cua hoc ky do la: " + sv.get(j).getKetqua().diemTB.get(i));
                break;
            }
        }
    }
    public void soSVChinhQuy() {
        int count=0;
        for(int i=0; i< sv.size(); i++) {
            if(sv.get(i) instanceof SVchinhquy ) count++;
        }
        System.out.println("So chinh vien chinh quy la " + count);
    }
    public void dauVaoCaoNhat() {
        int max1=0,max2=0,max3=0;
        for(int i=0; i< sv.size(); i++) {
            if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thong tin" && max1 <= sv.get(i).getDiemDauVao())  max1 = sv.get(i).getDiemDauVao();
            if(sv.get(i).getKhoa().getTenKhoa() == "Toan tin" && max2 <= sv.get(i).getDiemDauVao()) max2 = sv.get(i).getDiemDauVao();
            if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thuc pham" && max3 <= sv.get(i).getDiemDauVao()) max3 = sv.get(i).getDiemDauVao();
        }
        System.out.println("Diem dau vao cao nhat cua khoa CNTT la: " + max1);
        System.out.println("Diem dau vao cao nhat cua khoa Toan tin la: " + max2);
        System.out.println("Diem dau vao cao nhat cua khoa CNTP la: " + max3);
    }
    public void dsSVTaiChuc() {
        ArrayList<Integer> taichucCNTT = new ArrayList<>() ;
        ArrayList<Integer> taichucToanTin = new ArrayList<>() ;
        ArrayList<Integer> taichucCNTP = new ArrayList<>() ;
        for(int i=0; i< sv.size(); i++) {

            if(sv.get(i) instanceof SVtaichuc) {
                if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thong tin" ) taichucCNTT.add(i);
                if(sv.get(i).getKhoa().getTenKhoa() == "Toan tin") taichucToanTin.add(i);
                if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thuc pham") taichucCNTP.add(i);
            }
            else continue;
        }

        System.out.println("Danh sach sinh vien tai chuc cua khoa CNTT la \n");
        for(int i=0; i< taichucCNTT.size(); i++) {
            sv.get(taichucCNTT.get(i)).output();
        }
        System.out.println("Danh sach sinh vien tai chuc cua khoa Toan Tin la \n");
        for(int i=0; i< taichucToanTin.size(); i++) {
            sv.get(taichucToanTin.get(i)).output();
        }
        System.out.println("Danh sach sinh vien tai chuc cua khoa CNTT la \n");
        for(int i=0; i< taichucCNTT.size(); i++) {
            sv.get(taichucCNTT.get(i)).output();
        }
    }
    public void dsSVtren8() {
        ArrayList<Integer> tren8CNTT = new ArrayList<>() ;
        ArrayList<Integer> tren8ToanTin = new ArrayList<>() ;
        ArrayList<Integer> tren8CNTP = new ArrayList<>() ;
        for(int i=0; i< sv.size(); i++) {

            if(sv.get(i).getKetqua().getDiemTBcuoicung() > 8) {
                if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thong tin" ) tren8CNTT.add(i);
                if(sv.get(i).getKhoa().getTenKhoa() == "Toan tin") tren8ToanTin.add(i);
                if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thuc pham") tren8CNTP.add(i);
            }
            else continue;
        }

        System.out.println("Danh sach sinh vien tren 8 o ky hoc cuoi cung cua khoa CNTT la \n");
        for(int i=0; i< tren8CNTT.size(); i++) {
            sv.get(tren8CNTT.get(i)).output();
        }
        System.out.println("Danh sach sinh vien tren 8 o ky hoc cuoi cung cua khoa Toan Tin la \n");
        for(int i=0; i< tren8ToanTin.size(); i++) {
            sv.get(tren8ToanTin.get(i)).output();
        }
        System.out.println("Danh sach sinh vien tren 8 o ky hoc cuoi cung cua khoa CNTP la \n");
        for(int i=0; i< tren8CNTP.size(); i++) {
            sv.get(tren8CNTP.get(i)).output();
        }
    }
    public void diemTBCaoNhatKhoa() {
        float diemTBCaoNhatCNTT=0;
        float diemTBCaoNhatToanTin=0;
        float diemTBcaoNhatCNTP=0;
        for(int i=0; i< sv.size(); i++) {
                if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thong tin" && sv.get(i).getKetqua().diemTBcaonhat > diemTBCaoNhatCNTT ) diemTBCaoNhatCNTT = sv.get(i).getKetqua().diemTBcaonhat;
                if(sv.get(i).getKhoa().getTenKhoa() == "Toan tin" && diemTBCaoNhatToanTin < sv.get(i).getKetqua().diemTBcaonhat) diemTBCaoNhatToanTin = sv.get(i).getKetqua().diemTBcaonhat;
                if(sv.get(i).getKhoa().getTenKhoa() == "Cong nghe thuc pham" && diemTBcaoNhatCNTP < sv.get(i).getKetqua().diemTBcaonhat) diemTBcaoNhatCNTP = sv.get(i).getKetqua().diemTBcaonhat;
        }
        System.out.println("Diem trung binh cao nhat khoa CNTT la: " + diemTBCaoNhatCNTT);
        System.out.println("Diem trung binh cao nhat khoa Toan Tin la: " + diemTBCaoNhatToanTin);
        System.out.println("Diem trung binh cao nhat khoa CNTP la: " + diemTBcaoNhatCNTP);
    }
    public void sxNamHoc() {
        Collections.sort(sv);
        for(int i=0; i<sv.size(); i++) {
            sv.get(i).output();
        }
    }
    public void ThongKeNamVaoHoc() {
        int nam2016=0;
        int nam2017=0;
        int nam2018=0;
        int nam2019=0;
        int nam2020=0;

        for(int i=0; i< sv.size(); i++) {
            if(sv.get(i).getNamVao() == 2016) nam2016++;
            if(sv.get(i).getNamVao() == 2017) nam2017++;
            if(sv.get(i).getNamVao() == 2018) nam2018++;
            if(sv.get(i).getNamVao() == 2019) nam2019++;
            if(sv.get(i).getNamVao() == 2020) nam2020++;
        }
        System.out.println("So sinh vien vao nam 2016 la: " +  nam2016);
        System.out.println("So sinh vien vao nam 2017 la: " +  nam2017);
        System.out.println("So sinh vien vao nam 2018 la: " +  nam2018);
        System.out.println("So sinh vien vao nam 2019 la: " +  nam2019);
        System.out.println("So sinh vien vao nam 2020 la: " +  nam2020);

    }
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int luachon;
            do {
                System.out.println("Menu\n1.Them sinh vien\n2.Hien thi ra man hinh danh sach sinh vien\n" +
                        "3.Xac dinh sinh vien co phai chinh quy khong?\n4.Lay diem trung binh\n5.So sinh vien chinh quy la\n" +
                        "6.Dau vao cao nhat cua moi khoa\n7.Danh sach sinh vien tai chuc cua moi khoa\n" + "8.Danh sach sinh vien tren 8 o cac khoa\n"+
                        "9.Diem trung binh cao nhat khoa\n" + "10.Sap xep theo nam vao hoc\n11.Thong ke theo nam vao hoc (2016-2020)\n12.Exit");
                luachon = sc.nextInt();
            }while(luachon <0);
            switch (luachon) {
                case 1:
                    ql.input();
                    break;
                case 2:
                    ql.output();
                    break;
                case 3:
                    ql.xacdinhCQ();
                    break;
                case 4:
                    ql.layDiemTB();
                case 5:
                    ql.soSVChinhQuy();
                    break;
                case 6:
                    ql.dauVaoCaoNhat();
                    break;
                case 7:
                    ql.dsSVTaiChuc();
                    break;
                case 8:
                    ql.dsSVtren8();
                    break;
                case 9:
                    ql.diemTBCaoNhatKhoa();
                    break;
                case 10:
                    ql.sxNamHoc();
                    break;
                case 11:
                    ql.ThongKeNamVaoHoc();
                    break;
                case 12:
                    System.exit(0);
                    break;
            }

        }
    }
}
