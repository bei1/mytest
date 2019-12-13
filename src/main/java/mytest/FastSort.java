package mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FastSort{

    public static void main(String []args){
        Map<Integer,String> resultMap = new HashMap<Integer,String>();
        ArrayList<String> resultList =new ArrayList<String>();
        System.out.println("Hello World");
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }

    public static void sort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];


        while(end>start){
            //从后往前比较
            while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
    }

}

 class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }
void kuaisupaixu(int a[],int l,int r){

        if(l<r){
            int i=l;
            int j=r;
            int k=a[i];
             while(i<j){
                 while(i<j&&a[j]>k){
                     j--;
                 }
                 if(i<j){
                     a[i]=a[j];
                     i++;
                 }
                 while(i<j&&a[i]<k)
                     i++;
                 if(i<j)
                     a[j--]=a[i];
             }
             a[i]=k;
             kuaisupaixu(a,l,i-1);
             kuaisupaixu(a,i+1,r);
        }
     }
     /**
      * 交换数组元素
      * @param arr
      * @param a
      * @param b
      */
     public static void swap(int []arr,int a,int b){
         arr[a] = arr[a]+arr[b];
         arr[b] = arr[a]-arr[b];
         arr[a] = arr[a]-arr[b];
     }
     /**
      * 插入排序
      *
      * @param arr
      */
     public static void insertionSort(int[] arr) {
         for (int i = 1; i < arr.length; i++) {
             int j = i;
             while (j > 0 && arr[j] < arr[j - 1]) {
                 swap(arr,j,j-1);
                 j--;
             }
         }
     }
     void zhijie(int a[]){
         for(int i=0;i<a.length;i++){
             int j = i;
             while (a[j]<a[j-1]) {
                 swap(a, j, j - 1);
                 j--;
             }
         }
     }
     void kuai(int a[],int l,int r){
         if(l < r){
             int i = l;
             int j = r;
             int x = a[i];
             while (i<j){
                 while (i < j && a[j] > x)
                     j--;
                 if (i<j)
                     a[i++] = a[j];
                 while (i < j && a[i] < x)
                     i++;
                 if(i<j)
                     a[j--] = a[i];
             }
             a[i] = x;
             kuai(a,l,i-1);
             kuai(a,i+1,r);
         }
     }



    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    void qs(int a[],int l,int r){
        if(l < r){
            int i = l,j = r;
            int x = a[i];
            while (i<j) {
                while (i < j && a[j] > x)
                    j--;
                if (i < j)
                    a[i++] = a[j];
                while (i < j && a[i] < x)
                    i++;
                if (i < j)
                    a[j--] = a[i];
            }
            a[i] = x;
            qs(a,l,i-1);
            qs(a,i+1,r);
        }
    }
}
//
//class qs{
//    void quickSort(int a[],int left,int right)
//    {
//　　int i=left;
//　　int j=right;
//　　int temp=a[left];
//　　if(left>=right)
//　　　　return;
//　　while(i!=j)
//　　{
//　　　　while(i<j&&a[j]>=temp)
//　　　　j--;
//　　　　if(j>i)
//　　　　　　a[i]=a[j];//a[i]已经赋值给temp,所以直接将a[j]赋值给a[i],赋值完之后a[j],有空位
//　　　　while(i<j&&a[i]<=temp)
//　　　　i++;
//
//　　　　if(i<j)
//　　　　　　a[j]=a[i];
//　　}
//　　a[i]=temp;//把基准插入,此时i与j已经相等R[low..pivotpos-1].keys≤R[pivotpos].key≤R[pivotpos+1..high].keys
//　　quickSort(a,left,i-1);/*递归左边*/
//　　quickSort(a,i+1,right);/*递归右边*/
//    }
//        }

