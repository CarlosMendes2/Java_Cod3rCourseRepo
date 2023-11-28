package A_Fundamentos;

public class DesafiosOperadoresArit {
    public static void main(String[] args) {
        // [(a/b)²-(c/d)²]³/10³
        int a1 = (6*(3+2));
        int a2 =(int) Math.pow(a1,2);
        int a3 = a2/(3*2);

        int b1 = ((1-5)*(2-7))/2;
        int b2 =(int) Math.pow(b1,2);

        int c1 =(int) Math.pow(10,3);
        int a3b2 = a3-b2;

        int a3b21 =(int) Math.pow(a3b2,3);

        int total = a3b21/c1;



        System.out.println(total);
    }
}
