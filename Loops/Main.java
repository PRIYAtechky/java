/* 

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
}

//LOOPS
1) for loop
2) while loop
3) do-while loop


//Syntax  
==> for loop

for(initialization; condition; update){
    // code
}

==> while loop

initialization
while(condition){
    // code
    increment / decrement
}

==> do-while loop 

initialization
do{
    // code
    increment / decrement
}while(condition);




class Main {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            System.out.println("Hello World!");
        }
    }
}



class Main {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
}




class Main {
    public static void main(String[] args){
        for(int i=1; i<=5; i=i+2){
            System.out.println(i);
        }
    }
}




class Main {
    public static void main(String[] args){
        for(int i=10; i>=1; i=i-2){
            System.out.println(i);
        }
    }
}


class Main {
    public static void main(String[] args){
        for(int i=100; i>=50; i=i-25+1){
            System.out.println(i);
        }
    }
}




class Main {
    public static void main(String[] args){
        int j;
        for(j=0; j<=5;){
            System.out.println(j); //infinite loop
        }
    }
}


class Main {
    public static void main(String[] args){
        int i;
        for(i=1; i<=10; --i){
            System.out.println(i);//infinite loop
        }
    }
}




class Main {
    public static void main(String[] args){
        int i=0;
        while(i<=4){
            System.out.println("Hello");
            i++;
        }
    }
}



class Main {
    public static void main(String[] args){
        int i, sum;
        for(i=1, sum=0; i<=5; sum+=i , ++i)
            {
            System.out.println(i);
        }
    }
}
output:
1
2
3
4
5



class Main {
    public static void main(String[] args){
        int i, sum=0;
        for(i=1; i<=10; i++){
            sum += i;
        }
        System.out.println(sum); //55
    }
}



class Main {
    public static void main(String[] args){
        for(int i=0, j=0; i<5 && j<3; i++, j++){
           System.out.println(i); 
           System.out.println(j); 
        }
    }
}
output:
0
0
1
1
2
2



class Main {
    public static void main(String[] args){
        for(int i=0, j=5; i<5 && j>0; i++, j--){
           System.out.println("i="+i+" "+"j="+j); 
        }
    }
}
output:
i=0 j=5
i=1 j=4
i=2 j=3
i=3 j=2
i=4 j=1



class Main {
    public static void main(String[] args){
        boolean cnt = false;
        for(int i=0;i<10 && !cnt; i++){
           System.out.print(i); 

        if(i==5){
            cnt = true;
        }
        }
    }
}
output:
012345



class Main {
    public static void main(String[] args){
        int cnt=0;
        boolean b = true;
        while(b){
            System.out.print(cnt+"  ");
            cnt++;
        
        if(cnt == 4)
            b=false;
        }
    }
}
output:
0  1  2  3



class Main {
    public static void main(String[] args){
        int i=0;
        do{
            System.out.println("hello");
            i++;
        }
        while(i<=4);
    }
}
output:
hello
hello
hello
hello
hello



class Main {
    public static void main(String[] args){
        int j=4;
        do{
            System.out.println(j+" ");
            j++;
        }
        while(j<4);
    }
}
output:
4



*/
