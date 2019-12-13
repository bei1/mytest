package mytest;


public class MyThreadt {


    public static void main(String[] arg){
       final ThreadRun mythread=new ThreadRun();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=1;i<=5;i++) {
                        mythread.subThreadRun(i);
                    }
                }
            }).start();



            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=1;i<=5;i++) {
                        mythread.mainThreadRun(i);
                    }
                }
            }).start();
    }
}

 class ThreadRun{
    boolean subThreadisRun = true;
    public synchronized void subThreadRun(int i){
        if (!subThreadisRun){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int j=1;j<=10;j++){
            System.out.println("subThread:"+i+" loop:"+j);
        }
        subThreadisRun=false;
        this.notify();
    }

    public synchronized void mainThreadRun(int i){
        if(subThreadisRun){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int j=1;j<=20;j++){
            System.out.println("mainThread:"+i+" loop:"+j);
        }
        subThreadisRun=true;
        this.notify();
    }
        }
