/*

Serialization – The mechanism of converting an object into a byte stream is called Serialization.
Deserialization – The mechanism of converting a byte stream back into an object is called Deserialization.
serialVersionUID - serialVersionUID is a unique version ID used to ensure compatibility between a serialized object and its class during deserialization.
POJO class - A POJO class is a simple Java class containing private fields, constructors, getters, and setters. [ Example: Customer class with name, id, balance, constructor, getters, and setters.]


=> This program serializes a Customer object into a byte stream and stores it in a file using ObjectOutputStream.
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Customer implements Serializable {
    private String name;
    private int c_id;
    private float bal;
    // Constructor
    public Customer(String name, int c_id, float bal) {
        this.name = name;
        this.c_id = c_id;
        this.bal = bal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
    public float getBal() {
        return bal;
    }
    public void setBal(float bal) {
        this.bal = bal;
    }
}
public class File {
    public static void main(String[] args) {
        Customer c = new Customer("Priya", 123, 100.37f);
        String path = "D:\\user\\myfiles\\data.txt";
        try {
            FileOutputStream f = new FileOutputStream(path);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(c);
            o.close();
            f.close();
            System.out.println("Object serialized successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


=> This program deserializes a byte stream from a file and converts it back into a Customer object using ObjectInputStream.
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Customer implements java.io.Serializable {
    private String name;
    private int c_id;
    private float bal;
    // Constructor
    public Customer(String name, int c_id, float bal) {
        this.name = name;
        this.c_id = c_id;
        this.bal = bal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
    public float getBal() {
        return bal;
    }
    public void setBal(float bal) {
        this.bal = bal;
    }
}
public class File {
    public static void main(String[] args) {
        String path = "D:\\user\\myfiles\\data.txt";
        try {
            FileInputStream f = new FileInputStream(path);
            ObjectInputStream o = new ObjectInputStream(f);
            Customer customer = (Customer) o.readObject();
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer ID: " + customer.getC_id());
            System.out.println("Customer Balance: " + customer.getBal());
            o.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






=> Program 1 – Serialization: This program serializes a Customer object into a byte stream and stores it in a file using ObjectOutputStream.
=> Program 2 – Deserialization: This program deserializes the byte stream from a file and converts it back into a Customer object using ObjectInputStream.

Program 1 – Serialization:

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Customer implements Serializable {
    private static final long serialVersionUID = 1011L;
    private String name;
    private int c_id;
    private float bal;
    public Customer(String name, int c_id, float bal) {
        this.name = name;
        this.c_id = c_id;
        this.bal = bal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
    public float getBal() {
        return bal;
    }
    public void setBal(float bal) {
        this.bal = bal;
    }
}
public class File {
    public static void main(String[] args) {
        Customer c = new Customer("Priya", 123, 100.37f);
        String path = "D:\\user\\myfiles\\data.txt";
        try {
            FileOutputStream f = new FileOutputStream(path);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(c);
            o.close();
            f.close();
            System.out.println("Object serialized successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


Program 2 – Deserialization:

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
class Customer implements Serializable {
    private static final long serialVersionUID = 1011L;
    private String name;
    private int c_id;
    private float bal;
    public Customer(String name, int c_id, float bal) {
        this.name = name;
        this.c_id = c_id;
        this.bal = bal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
    public float getBal() {
        return bal;
    }
    public void setBal(float bal) {
        this.bal = bal;
    }
}
public class File {
    public static void main(String[] args) {
        String path = "D:\\user\\myfiles\\data.txt";
        try {
            FileInputStream f = new FileInputStream(path);
            ObjectInputStream o = new ObjectInputStream(f);
            Customer customer = (Customer) o.readObject();
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer ID: " + customer.getC_id());
            System.out.println("Customer Balance: " + customer.getBal());
            o.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





*/
