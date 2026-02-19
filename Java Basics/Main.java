/*

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World !");
    }
}


// DATA TYPES

class Main {
    public static void main(String[] args) {
        byte a=24;
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        byte a=129; //ERROR
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        short a=32766;
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        short a=32769; // ERROR (SHORT ONLY -3276 to 32767)
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        long a=6744016167989l;
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        float a=(float)45.5;
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        float a=45.5f;
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        int a=045;    //treat as octal
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        int a=0x45;//treat as Hexadecimal
        System.out.println(a);
    }
}

//TYPE CASTING

1)Implicit type casting
class Main {
    public static void main(String[] args) {
       byte a=45;
       double b=45.5;
       b=a;
       System.out.println(a);
       System.out.println(b);
    }
}


2)Explicit type casting
class Main {
    public static void main(String[] args) {
       byte a=45;
       double b=45.5;
       a=(byte)b;
       System.out.println(a);
       System.out.println(b);
    }
}


// TRUNCATIION

class Main{
    public static void main(String[] agrs){
        int a=26;
        int b=2;
        int res = a/b;
        System.out.println(res);
    }

} 


class Main {
    public static void main(String[] args) {
        int a = 25;
        int b = 2;
        float c = a/b; // 5 is truncated
        System.out.println(c);
    }
}


class Main {
    public static void main(String[] args) {
        int a = 25;
        float b = 2;
        float c = a/b; // 12.5 is the exact output
        System.out.println(c);
    }
}


class Main{
    public static void main(String[] agrs){
        byte a = 127;
        byte b = a+1; //error
        System.out.println(b);
    }
} 


class Main {
    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte)(a+1);
        System.out.println(b);//-128
    }
}


class Main {
    public static void main(String[] args) {
        short a = 32767;
        short b = (short)(a+5);
        System.out.println(b);//-32764
    }
}


*/


