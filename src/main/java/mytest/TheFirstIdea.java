package mytest;

public class TheFirstIdea{

    /**
     * @param args
     */
    public static void main(String[] args) {

        new Thread(//子线程
                new Runnable(){
                    public void run(){
                        for(int i=1;i<=5;i++){
                            synchronized(TheFirstIdea.class){
                                for(int j=1;j<=10;j++){
                                    System.out.println("sub thread: "+i+",loop: "+j);
                                }
                            }
                        }
                    }
                }
        ).start();

        new Thread(//主线程
                new Runnable(){
                    public void run(){
                        for(int i=1;i<=5;i++){
                            synchronized(TheFirstIdea.class){
                                for(int j=1;j<=20;j++){
                                    System.out.println("main thread: "+i+",loop: "+j);
                                }
                            }
                        }
                    }
                }
        ).start();
    }

}
