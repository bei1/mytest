//package mytest;
//
//import java.io.*;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.HashMap;
//import java.util.Map;
//
////编写一个程序，将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔。
//public class MainClass {
//    public static void main(String[] args) throws Exception {
//        FileManager a = new FileManager("a.txt", new char[]{'\n'});
//        FileManager b = new FileManager("b.txt", new char[]{'\n', ' '});
//        FileWriter c = new FileWriter("c.txt");
//        String aWord = null;
//        String bWord = null;
//        while ((aWord = a.nextWord()) != null) {
//            c.write(aWord + "\n");
//            bWord = b.nextWord();
//            if (bWord != null) c.write(bWord + "\n");
//        }
//        while ((bWord = b.nextWord()) != null) {
//            c.write(bWord + "\n");
//        }
//        c.close();
//    }
//}
//
//class FileManager {
//    String[] words = null;
//    int pos = 0;
//
//    public FileManager(String filename, char[] seperators) throws Exception {
//        File f = new File(filename);
//        FileReader reader = new FileReader(f);
//        char[] buf = new char[(int) f.length()];
//        int len = reader.read(buf);
//        String results = new String(buf, 0, len);
//        String regex = null;
//        if (seperators.length > 1) {
//            regex = "" + seperators[0] + "|" + seperators[1];
//        } else {
//            regex = "" + seperators[0];
//        }
//        words = results.split(regex);
//    }
//
//    public String nextWord() {
//        if (pos == words.length) return null;
//        return words[pos++];
//    }
//}
//
////编写一个程序，将d:\java目录下的所有.java文件复制到d:\jad目录下，并将原来文件的扩展名从.java改为.jad。
////listFiles方法接受一个FileFilter对象，这个FileFilter对象就是过滤的策略对象，不同的人提供不同的FileFilter实现，即提供了不同的过滤策略。
//class Jad2Java {
//    public static void main2(String[] args) throws Exception {
//        File srcDir = new File("java");
//        if (!(srcDir.exists() && srcDir.isDirectory())) throw new Exception ("目录不存在");
//        File[] files = srcDir.listFiles(new FilenameFilter() {
//            public boolean accept (File dir, String name){
//                return name.endsWith(".java");
//            }
//        });
//        System.out.println(files.length);
//        File destDir = new File("jad");
//        if (!destDir.exists()) destDir.mkdir();
//        for (File f : files) {
//            FileInputStream fis = new FileInputStream(f);
//            String destFileName = f.getName().replaceAll("\\.java$", ".jad");
//            FileOutputStream fos = new FileOutputStream(new File(destDir, destFileName));
//            copy(fis, fos);
//            fis.close();
//            fos.close();
//        }
//    }
//
//    private static void copy(InputStream ips, OutputStream ops) throws Exception {
//        int len = 0;
//        byte[] buf = new byte[1024];
//        while ((len = ips.read(buf)) != -1) {
//            ops.write(buf, 0, len);
//        }
//    }
//}
//
////统计字符串每种字符的个数
//class tongji{
//    void f(String str){
//
//        HashMap map=new HashMap();
//        for (int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            Integer n = (Integer) map.get(c);
//            if (n==null){
//                n=1;
//                map.put(n,c);
//            }
//            else {
//                n++;
//                map.put(n,c);
//            }
//        }
//        for(Map.Entry entry : map){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }
//    }
//}