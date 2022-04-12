import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Thread1 extends Thread {
    private File file;
    private Scanner sc;
    private SharedData sharedData;
    public Thread1(SharedData sharedData) throws FileNotFoundException {
        this.file = new File("D:\\Study\\Tuhoc\\Java\\Thread-practice\\src\\file.txt");
        this.sc = new Scanner(file);
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while(sc.hasNextLine()) {
            String temp = this.sc.nextLine();
            synchronized (this) {
                try {
                    Integer number = Integer.valueOf(temp);
                    sharedData.setNumber(number);
                }
                catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
