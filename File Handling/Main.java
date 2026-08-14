/*

File Handling: File handling is used to create, read, write, update, and delete files using Java.

import java.io.File;;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles\\data.txt");
        System.out.println(f.exists());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.isFile());
        System.out.println(f.list());
    }
}
output:
true
true
true
abc.txt
D:\user\myfiles
D:\user\myfiles\abc.txt
true
null


import java.io.File;
import java.io.IOException;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles\\abc.txt");
        try{
            f.createNewFile();  
        }
        catch(IOException e){
            e.printStackTrace();
        }      
    }
}



import java.io.File;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles");
        String list[]= f.list();
        for (String l:list){
            System.out.println(l);
        }
             
    }
}
output:
abc.txt
data.txt



import java.io.File;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles\\data.txt");
        f.delete();
    }
}
    


import java.io.File;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles\\data.txt");
        f.delete();
    }
}



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles\\data.txt");
        try{
            FileWriter w = new FileWriter(f);
            w.write("hello");
            w.write("world !");
            w.flush();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles\\data.txt");
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter w = new FileWriter(f);
            String w1=sc.next();
            String w2=sc.next();
            w.write(w1);
            w.write(w2);
            w.flush();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}


*/





