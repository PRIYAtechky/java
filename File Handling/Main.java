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


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        File f = new File("D:\\user\\myfiles\\data.txt");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        try{
            FileWriter w = new FileWriter(f);
            w.write(s1);
            w.flush();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}



import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        FileWriter w = null;
        try{
            w = new FileWriter("D:\\user\\myfiles\\data.txt",true);
            w.write(s1);
            w.flush();
            w.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        sc.close();
    }
}


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s1 = sc.nextLine();

        try {
            FileWriter w = new FileWriter("D:\\user\\myfiles\\data.txt", true);

            w.write(s1);
            w.write(System.lineSeparator());

            w.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}




=>Program reads up to 30 characters from a file into a character array and prints them to the console.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       
        char[] ch = new char[30];
        FileReader r = null;
        try{
            r = new FileReader("D:\\user\\myfiles\\data.txt");
            r.read(ch);
            System.out.println(ch);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}




=>Program reads a file character by character using FileReader and prints the contents to the console.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = new char[30];
        FileReader r = null;
        try{
            r = new FileReader("D:\\user\\myfiles\\data.txt");
            int c=r.read();
            while(c!=-1){
            System.out.print((char)c);
            c=r.read();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        sc.close();
    }
}




=>Program reads a text file line by line and prints each line on the console.

import java.io.BufferedReader;
import java.io.FileReader;
public class Main{
    public static void main(String[] args) {
       FileReader r = null;
       BufferedReader br = null;
       try{
        r = new FileReader("D:\\user\\myfiles\\data.txt");
        br = new BufferedReader(r);

        String value = br.readLine();
        while(value != null){
            System.out.println(value);
            value = br.readLine();
        }
       }
        catch (Exception e) {
        e.printStackTrace();
       }
    }
}




=>Program reads a text file line by line and counts the total number of lines in the file.

import java.io.BufferedReader;
import java.io.FileReader;
public class Main{
    public static void main(String[] args) {
       FileReader r = null;
       BufferedReader br = null;
       int count=0;
       try{
        r = new FileReader("D:\\user\\myfiles\\data.txt");
        br = new BufferedReader(r);

        String value = br.readLine();
        while(value != null){
            count++;
            value = br.readLine();
        }
        System.out.println(count);
       }
        catch (Exception e) {
        e.printStackTrace();
       }
    }
}




=>Program reads a text file line by line and calculates the total number of characters in the file.

import java.io.BufferedReader;
import java.io.FileReader;
public class Main{
    public static void main(String[] args) {
       FileReader r = null;
       BufferedReader br = null;
       int size = 0;
       int sum=0;
       try{
        r = new FileReader("D:\\user\\myfiles\\data.txt");
        br = new BufferedReader(r);

        String line = br.readLine();
        while(line != null){
            sum+=line.length();
            line=br.readLine();
        }
        System.out.println(sum);
       }
        catch (Exception e) {
        e.printStackTrace();
       }
    }
}




=> Program reads names and phone numbers from two separate files and combines them into a single phonebook.txt file in name : number format.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class Main{
    public static void main(String[] args) {
       String path1="D:\\user\\myfiles\\name.txt";
       String path2="D:\\user\\myfiles\\phonenumber.txt";
       String path3="D:\\user\\myfiles\\phonebook.txt";
       FileReader r1 = null;
       BufferedReader b1 = null;
       FileReader r2 = null;
       BufferedReader b2 = null;
       FileWriter w=null;
       try{
        r1 = new FileReader(path1);
        r2 = new FileReader(path2);
        b1 = new BufferedReader(r1);
        b2 = new BufferedReader(r2);
        w = new FileWriter(path3);

        String name=b1.readLine();
        String number=b2.readLine();

        while (name != null && number != null) {
            w.write(name+" : "+number+"\n");
            name=b1.readLine();
            number=b2.readLine();
        }
        w.flush();
       }
        catch (Exception e) {
        e.printStackTrace();
       }
    }
}










*/





