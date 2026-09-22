/*
STRING

String - A String is a sequence of characters used to store text.

Example:
String name = "Padmapriya";


-> Create a String

class Main {
    public static void main(String[] args) {
        String name = "Padmapriya";
        System.out.println(name);
    }
}

Output:
Padmapriya



-> Find the length of a String

class Main {
    public static void main(String[] args) {
        String name = "Padmapriya";
        System.out.println(name.length());
    }
}

Output:
10



-> Find a character using charAt()

class Main {
    public static void main(String[] args) {
        String name = "Padmapriya";
        System.out.println(name.charAt(0));
    }
}

Output:
P



-> Find the last character

class Main {
    public static void main(String[] args) {
        String name = "Padmapriya";
        System.out.println(name.charAt(name.length() - 1));
    }
}

Output:
a



-> Convert String to uppercase

class Main {
    public static void main(String[] args) {
        String name = "padmapriya";
        System.out.println(name.toUpperCase());
    }
}

Output:
PADMAPRIYA



-> Convert String to lowercase

class Main {
    public static void main(String[] args) {
        String name = "PADMAPRIYA";
        System.out.println(name.toLowerCase());
    }
}

Output:
padmapriya



-> Check whether two Strings are equal

class Main {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";

        System.out.println(a.equals(b));
    }
}

Output:
true



-> Check String contains a word

class Main {
    public static void main(String[] args) {
        String name = "Java Programming";

        System.out.println(name.contains("Java"));
    }
}

Output:
true



-> Check String starts with

class Main {
    public static void main(String[] args) {
        String name = "Java Programming";

        System.out.println(name.startsWith("Java"));
    }
}

Output:
true



-> Check String ends with

class Main {
    public static void main(String[] args) {
        String name = "Java Programming";

        System.out.println(name.endsWith("Programming"));
    }
}

Output:
true



-> Remove spaces using trim()

class Main {
    public static void main(String[] args) {
        String name = "   Java   ";

        System.out.println(name.trim());
    }
}

Output:
Java



-> Replace a character

class Main {
    public static void main(String[] args) {
        String name = "Java";

        System.out.println(name.replace('a', 'o'));
    }
}

Output:
Jovo



-> Extract part of a String using substring()

class Main {
    public static void main(String[] args) {
        String name = "Programming";

        System.out.println(name.substring(0, 4));
    }
}

Output:
Prog



-> Find position using indexOf()

class Main {
    public static void main(String[] args) {
        String name = "Java Programming";

        System.out.println(name.indexOf("Programming"));
    }
}

Output:
5



-> Check whether String is empty

class Main {
    public static void main(String[] args) {
        String name = "";

        System.out.println(name.isEmpty());
    }
}

Output:
true



-> Concatenate two Strings

class Main {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Programming";

        System.out.println(first + " " + second);
    }
}

Output:
Java Programming



-> Print each character of a String

class Main {
    public static void main(String[] args) {
        String name = "Java";

        for(int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}

Output:
J
a
v
a



// SIMPLE STRING PROGRAMS


-> 1. Reverse a String

class Main {
    public static void main(String[] args) {
        String name = "Java";
        String reverse = "";

        for(int i=name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println(reverse);
    }
}

Output:
avaJ



-> 2. Count vowels in a String

class Main {
    public static void main(String[] args) {
        String name = "Java";
        int count = 0;

        for(int i=0; i<name.length(); i++) {
            char c = name.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count++;
            }
        }

        System.out.println(count);
    }
}

Output:
2



-> 3. Check Palindrome String

class Main {
    public static void main(String[] args) {
        String name = "madam";
        String reverse = "";

        for(int i=name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i);
        }

        if(name.equals(reverse)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

Output:
Palindrome

*/









/*
STRING BUFFER

StringBuffer - StringBuffer is a mutable sequence of characters used to modify text.
It is synchronized and thread-safe.


-> Create a StringBuffer

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java");

        System.out.println(name);
    }
}

Output:
Java



-> Append text using append()

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java");

        name.append(" Programming");

        System.out.println(name);
    }
}

Output:
Java Programming



-> Insert text using insert()

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java");

        name.insert(4, " Programming");

        System.out.println(name);
    }
}

Output:
Java Programming



-> Replace text using replace()

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java");

        name.replace(0, 4, "Python");

        System.out.println(name);
    }
}

Output:
Python



-> Delete text using delete()

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java Programming");

        name.delete(4, 16);

        System.out.println(name);
    }
}

Output:
Java



-> Reverse a String using reverse()

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java");

        name.reverse();

        System.out.println(name);
    }
}

Output:
avaJ



-> Find length using length()

class Main {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java");

        System.out.println(name.length());
    }
}

Output:
4





STRING BUILDER

StringBuilder - StringBuilder is a mutable sequence of characters used to modify text.
It is not synchronized and is faster than StringBuffer.


-> Create a StringBuilder

class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java");

        System.out.println(name);
    }
}

Output:
Java



-> Append text using append()

class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java");

        name.append(" Programming");

        System.out.println(name);
    }
}

Output:
Java Programming



-> Insert text using insert()

class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java");

        name.insert(4, " Programming");

        System.out.println(name);
    }
}

Output:
Java Programming



-> Replace text using replace()

class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java");

        name.replace(0, 4, "Python");

        System.out.println(name);
    }
}

Output:
Python



-> Delete text using delete()

class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java Programming");

        name.delete(4, 16);

        System.out.println(name);
    }
}

Output:
Java



-> Reverse a String using reverse()

class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java");

        name.reverse();

        System.out.println(name);
    }
}

Output:
avaJ



-> Find length using length()

class Main {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java");

        System.out.println(name.length());
    }
}

Output:
4

*/
