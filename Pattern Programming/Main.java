/* 

// PATTERN PROGRAMMING



class Main{
    public static void main(String[] args) {
        System.out.println("*");
    }
}



class Main{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
        System.out.println("*");
        }
    }
}
output:
*
*
*
*
*



class Main{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
        System.out.print("*");
        }
    }
}
output:
*****



class Main{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
output:
*****
*****
*****
*****
*****



class Main{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
output:
11111
22222
33333
44444
55555



class Main{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
output:
12345
12345
12345
12345
12345



class Main{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5)
                System.out.print("*");

                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
output:
*****
*   *
*   *
*   *
*****



class Main{
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
output:
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25



class Main{
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(count<10){
                 System.out.print("0");
                }
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
output:
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 





*/





