package javatestproj;

public class Main {
    public static int square(int num){
        return num*num;
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(4,5));
        System.out.println(square(9));
        System.out.println("Hello world!");
    }
}