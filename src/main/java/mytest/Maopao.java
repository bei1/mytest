package mytest;

public class Maopao {
    public void mao(int[] a){
        for(int i=0;i<a.length;i++){
            for (int j=a.length-1;j>i;j--){
                if(a[j-1]>a[j]){
                    int t = a[j];
                    a[j-1] = a[j];
                    a[j] = t;
                }
            }
        }
    }

}
