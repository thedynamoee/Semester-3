import javax.sound.sampled.SourceDataLine;

public class Paus extends Mamalia implements IBerenangAble{
    
    @Override
    public void berenang(){
        System.out.println(
            this.getClass().getName() + " berenang"
        );
    }
    @Override
    public void menyelam(){
        System.out.println(
            this.getClass().getName() + " menyelam"
        );
    }
}
