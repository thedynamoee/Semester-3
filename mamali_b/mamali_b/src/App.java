import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
 
        Mamalia mama = new Mamalia();
        

        // Mamalia kuda = new Mamalia();
        // kuda.melahirkan();
        // kuda.menyusui();

        // Mamalia gajah = new Mamalia();
        // gajah.melahirkan();
        // gajah.menyusui();

        // Kucing kucing = new Kucing();
        // kucing.melahirkan();
        // kucing.menyusui();
        // kucing.berlagakImut();

        Kelelawar kelelawar = new Kelelawar();

        Platypus platypus = new Platypus();
        // platypus.melahirkan();
        // platypus.move();
        // platypus.berenang();
        // platypus.menyelam();

        Paus paus = new Paus();
        // paus.berenang();
        // paus.menyelam();

        Lumba lumba = new Lumba();

        if (platypus instanceof IBerenangAble){
            System.out.println("Ya, platypus bisa berenang");
        }else{
            System.out.println("Tidal, platypus tidak bisa berenang");
        }

        if (lumba instanceof IBerenangAble){
            System.out.println("Ya, lumba-lumba bisa berenang");
        }else{
            System.out.println("Tidal, lumba-lumba tidak bisa berenang");
        }
    }
}
