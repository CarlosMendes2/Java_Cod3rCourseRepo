package F_OO.Abstrato;

public class TestAbstrat {
    public static void main(String[] args) {

        Mamifero a = new Cachorro();
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respírar());

    }
}
