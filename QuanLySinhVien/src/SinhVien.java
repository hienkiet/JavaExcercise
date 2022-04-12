import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien> {
    private int mssv;
    private String ten;
    private int sinhnhat;
    private int namVao;
    private int diemDauVao;
    private KQHT ketqua;
    private Khoa khoa;

    public int compareTo(SinhVien sinhvien) {
        return sinhvien.getNamVao() - this.getNamVao() ;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap ho va ten: ");
        ten = sc.nextLine();
        System.out.println("\nNhap mssv: ");
        mssv = sc.nextInt();
        System.out.println("\nNhap nam sinh: ");
        sinhnhat = sc.nextInt();
        System.out.println("\nNhap nam bat dau hoc: ");
        namVao = sc.nextInt();
        System.out.println("\nNhap diem dau vao: ");
        diemDauVao = sc.nextInt();
        ketqua = new KQHT();
        khoa = new Khoa();
        this.ketqua.input();
        this.khoa.input();
    }
    public void output() {
        System.out.print("SinhVien{" +
                "mssv=" + mssv +
                ", ten='" + ten + '\'' +
                ", sinhnhat=" + sinhnhat +
                ", namVao=" + namVao +
                ", diemDauVao=" + diemDauVao +
                ", khoa= " + khoa.getTenKhoa());
        this.ketqua.output();
    }

    public SinhVien() {
        super();
    }



    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }


    public KQHT getKetqua() {
        return ketqua;
    }

    public void setKetqua(KQHT ketqua) {
        this.ketqua = ketqua;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }

    public int getDiemDauVao() {
        return diemDauVao;
    }

    public void setDiemDauVao(int diemDauVao) {
        this.diemDauVao = diemDauVao;
    }

    public int getNamVao() {
        return namVao;
    }

    public void setNamVao(int namVao) {
        this.namVao = namVao;
    }
}
