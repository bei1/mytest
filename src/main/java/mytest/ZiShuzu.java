package mytest;

public class ZiShuzu {
    public static void zi(int[] a ,int[] b){
        int i=0,j=0;
        int x=-1;
        for (i=0;i<a.length;i++){
            if(a[i]==b[0]){
                int q=i,t=0;
                for(j=0;j<b.length;j++,q++){
                    if(b[j]!=a[q]){
                        t=1;
                    }
                }
                if(t==0){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        zi(new int[]{1,5,6,5,3,8,5,3,8},new int[]{5,3,8});
    }
}
