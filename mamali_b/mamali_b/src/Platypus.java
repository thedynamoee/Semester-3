public class Platypus extends Mamalia implements IBerenangAble{
    public void melahirkan(){
        System.out.println(this.getClass().getName() + " bertelur");

    }
    public void move(){
        System.out.println(this.getClass().getName() + " berpindah");
    }

    public void berenang(){
        System.out.println(" berenang");
    }
    
    public void menyelam(){
        System.out.println(" menyelam");
    }
}
