
public class Thread3  extends Thread{
    private SharedData sharedData;
    public Thread3(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    public synchronized void run() {
        while(true) {
            synchronized (sharedData) {
                if(sharedData.getNumber() != null && sharedData.getNumber() %2 !=0) {
                    System.out.println("Thread3 >>" + sharedData.getNumber());
                    sharedData.setNumber(null);
                }
            }
        }
    }
}
