package F_OO;

public class teste {
    public static void main(String[] args) {
        int a = 10;
        int b ;
        int c = 0;
        System.out.println(a);
        for(b = 1; b< 4; b++){
            System.out.println(a+" "+b);
            c = a + b;
            System.out.println(a+" "+b+" "+c);
            a -= b;
            System.out.println(a+" "+b+" "+c);
        }
        System.out.println(a+" "+b+" "+c);

    }
}
