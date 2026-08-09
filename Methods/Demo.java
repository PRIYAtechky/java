/*

Method:
-A method is a block of code that performs a specific task.
-It is used to reuse code and avoid writing the same code again.

| Type                   | Meaning                              | Example                  |
| -----------------------| -------------------------------------| -------------------------|
| 1. No Input, No Output | No parameter and no return value     | void add()               |
| 2. Input, No Output    | Takes parameters but returns nothing | void add(int a, int b)   |
| 3. No Input, Output    | No parameter but returns a value     | int add()                |
| 4. Input, Output       | Takes parameters and returns a value | int add(int a, int b)    |

| Value Type                                   | Reference Type                                |
| -------------------------------------------- | --------------------------------------------- |
| Stores the actual value                      | Stores the reference/address of an object     |
| Examples: `int`, `float`, `char`, `boolean`  | Examples: `String`, arrays, objects           |
| Changes to one variable don't affect another | Two variables can refer to the same object    |



class Main {
    public static void main(String[] args){
        int a=99;
        float b=99.99f;
        boolean c=true;
        double d=100.99;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
output:
99
99.99
true
100.99


public class Demo{
    int a;
    float b;
    boolean c;
    double d;
    public static void main(String[] args){
        Demo t = new Demo();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.d);

    }
}
output:
0
0.0
false
0.0


==> NO INPUT, NO OUTPUT
public class Demo{
    int a=50;
    int b=40;
    void add(){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args){
        Demo cal = new Demo();
        cal.add();
    }
}
output:
90


==>NO INPUT , OUTPUT
public class Demo{
    int a=50;
    int b=40;
    int add(){
        int c=a+b;
        return c;
    }
    public static void main(String[] args){
        Demo cal = new Demo();
        int res = cal.add();
        System.out.println(res);
    }
}
output:
90


==>INUT, NO OUTPUT
class Demo{
    int c;
    void add(int a, int b){
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Demo cal = new Demo();
        int num1, num2;
        num1 =50;
        num2 = 40;
        cal.add(num1, num2);
    }

}
output:
90


==>INTPUT, OUTPUT
class Demo{
    int c;
    int add(int a, int b){
        int c =a+b;
        return c;
    }
    public static void main(String[] args) {
       Demo cal = new Demo();
       int num1 =50;
       int num2=40;
       int res= cal.add(num1,num2);
       System.out.println(res);
    }
}
output:
90



==>Vale Type
class Main{
    public static void main(String[] args) {
        int x=100;
        int y;
        y=x;

        System.out.println(x);
        System.out.println(y);

        x=200;
        System.out.println(x);
        System.out.println(y);
    }
}
output:
100
100
200
100



==>Reference Type
class Car{
    String name;
    int cost;
    public static void main(String[] args) {
       Car x = new Car();
       x.name="Maruthi";
       x.cost=200000;
        System.out.println(x.name);
        System.out.println(x.cost);

      Car y;
      y=x;
        System.out.println(y.name);
        System.out.println(y.cost);
    }
}
output:
Maruthi
200000
Maruthi
200000



*/
