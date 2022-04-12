import java.util.ArrayList;
import java.util.Scanner;

public class KQHT  {
    ArrayList<Integer> hk = new ArrayList<Integer>();
    ArrayList<Float> diemTB = new ArrayList<Float>();
    public int n;
    public float diemTBcuoicung;
    public float diemTBcaonhat;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon nhap bao nhieu hoc ky");
        n = sc.nextInt();
        for(int i =0; i<n; i++) {
            System.out.println("Nhap ten hoc ky: ");
            hk.add(sc.nextInt());
            System.out.println("Nhap diem TB cua hoc ky do: ");
            float k = sc.nextFloat();
            if(diemTBcaonhat < k) diemTBcaonhat = k;
            diemTB.add(k);

        }
        diemTBcuoicung= diemTB.get(diemTB.size()-1);

    }

    public void output() {
        System.out.print("Ket qua hoc tap: ");
        for(int i=0; i< n; i++) {
            System.out.println("Hoc ky" + hk.get(i) + ", diem: " + diemTB.get(i));
        }
    }
    public KQHT() {
    }

    public float getDiemTBcuoicung() {
        return diemTBcuoicung;
    }

    public void setDiemTBcuoicung(float diemTBcuoicung) {
        this.diemTBcuoicung = diemTBcuoicung;
    }
}
