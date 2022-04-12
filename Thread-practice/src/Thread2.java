public class Thread2  extends Thread{
    private SharedData sharedData;
    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    public synchronized void run() {
        while(true) {
            synchronized (sharedData) {
                if(sharedData.getNumber() != null && sharedData.getNumber() %2 ==0) {
                    System.out.println("Thread2 >>" + sharedData.getNumber());
                    sharedData.setNumber(null);
                }
            }
        }
    }
}