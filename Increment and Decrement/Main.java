/*

// INCREMENTATION & DECREMENTATION

//PRE INCREMENT

class Main {
    public static void main(String[] args) {
        int a = 6;
        ++a;
        System.out.println(a);
    }
}

// POST INCREMENT

class Main {
    public static void main(String[] args) {
        int a = 6;
        a++;
        System.out.println(a);
    }
}

//PRE DECREMENT

class Main {
    public static void main(String[] args) {
        int a = 6;
        --a;
        System.out.println(a);
    }
}

//POST DECREMENT

class Main {
    public static void main(String[] args) {
        int a = 6;
        a--;
        System.out.println(a);
    }
}


class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = a++;
        System.out.println(a); //7
        System.out.println(b); //6
    }
}


class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = ++a;
        System.out.println(a); //7
        System.out.println(b); //7
    }
}


class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = a-- - a++ + --a + a++ + ++a ;
        System.out.println(a); //7
        System.out.println(b); //6
    }
}


class Main{
    public static void main(String[] agrs){
        int a = 173;
        int b = 34;
        int c = 56;
        int d = a++ + b++ + ++c + c-- + a-- + b-- + ++a + b + c--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


class Main {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        System.out.println(m++ / (++n * n--) / --m); // 0
    }
}


class Main {
    public static void main(String[] args) {
        int x = 001;  // octal → decimal 1
        int y = 010;  // octal → decimal 8
        int z = 100;  // decimal 100
        int i = -- x + y++ - z-- - --z + ++y - --x + y-- - --x;
        System.out.println(i); // -167
    }
}


class Main {
    public static void main(String[] args) {
        char C='A',c='a';  //ASCII value A=65 c=97
        System.out.println(C++ * ++c); //65 * 97 = 6370
    }
}


*/




