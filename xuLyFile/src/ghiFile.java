import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ghiFile {
    private static final String FILENAME = "D:\\Study\\Tu hoc\\Java\\ghiSoVaoFiletxt\\file.txt";

    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        String k = Integer.toString(ThreadLocalRandom.current().nextInt(10,101));

        try {

            File file = new File(FILENAME);
            fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            bw.write(k);
            bw.write("\n");
            for(int i=0; i<500; i++) {
                bw.write(Integer.toString(ThreadLocalRandom.current().nextInt(1,500)));
                bw.write("\n");
            }
            System.out.println("Success");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
