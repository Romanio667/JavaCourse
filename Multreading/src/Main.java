public class Main {
    public static void main(String[] args) {
       // RunnableTimer runnableTimer=new RunnableTimer();
        Thread timer=new Thread(new Runnable() {
            @Override
                public void run() {
                try {
                    for (int i = 0; i < 1000000; i++) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                }
            }
        });
        timer.start();
    }
}
