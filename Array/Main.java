/*
Arrays - An array is used to store multiple values of the same data type in a single variable.


-> Find the length of an array
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        System.out.println(numbers.length);
    }
}
Output:
4



-> Print the first and last element
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
    }
}
Output:
10
50



-> Count the even numbers
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30};
        int count = 0;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
Output:
3



->Print array elements
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
output:
10
20
30
40
50



->Print array elements using index
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);
    }
}
Output:
10
30
50


->Find sum of array elements
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
Output:
150


->Find largest element
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 20, 40};
        int largest = numbers[0];

        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
Output:
50




->Find smallest element
class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 20, 40};
        int smallest = numbers[0];

        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
    }
}
Output:
10



->2D Array
class Main {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
Output:
10
20
30
40
50
60
























*/
