package mytest;

import java.util.*;

/**
 * Created by dell1 on 2018/12/18 0018.
 */
public class MyTest {
    public static void main (String args[]){
        Date d=new Date();
        System.out.println();
        Set<String> stringSet =new HashSet<String>();
        stringSet.add("zhou");
        stringSet.add("wu");
        stringSet.add("zheng");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()){
           String s = stringIterator.next();
            System.out.println(s);
        }

        HashMap<String,String> stringHashMap = new HashMap<String,String>();
        stringHashMap.put("001","王明");
        stringHashMap.put("002","Lucy");
        stringHashMap.remove("001");
        stringHashMap.containsKey("001");

        Hashtable<String,String> stringHashtable = new Hashtable<String, String>();
        stringHashtable.put("001","Bob");
        stringHashtable.containsValue("Bob");

        int[][] array =new int[1][0];
        System.out.println(array.length);
        float floatVar=0.34f;
        int intVar=2;
        String stringVar="zs zxcxzc";
        stringVar.replace(" ","%20");
        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", floatVar, intVar, stringVar);


        System.out.println(array.toString());
        System.out.println(array.length+"!"+array[0].length+find(16,array));
}

    public static boolean find(int target,int[][] array){
        int len = array.length-1;
        int i = 0;
        while(len>=0&&i<=array[0].length-1){
            if(target < array[len][i]){
                len--;
            }
            else if(target > array[len][i])
                i++;
            else
                return true;
        }
        return false;
    }

//一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序递增，当值大于5000时，把值按照指定顺序输出来
    public void doublen(int n){
        System.out.println(n);
        if(n<=5000){
            doublen(2*n);
            System.out.println(n);
        }
    }

    //第1个人10，第2个比第1个人大2岁，依次递推，请用递归方式计算出第8个人多大？
    public int computeAge(int n){
        int age =10;
        if (n<1) return 0;
        else if(n==1) return age;
        else {
            return computeAge(n-1)+2;
        }
        //return age+2*(n-1);
    }
}
