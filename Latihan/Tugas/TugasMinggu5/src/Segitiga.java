import java.nio.channels.ScatteringByteChannel;

public class Segitiga{

    public String nama;

    public static double hitungLuasSegitiga(double al, double t){
        double luasSegitiga;
        luasSegitiga = 0.5 * al * t;
        return luasSegitiga;
    }
    public static double hitungLuasSegitiga(double a, double b, double c){
        double s = (a+b+c)/2;
        double luasSegitiga = Math.sqrt ((s-a)*(s-b)*(s-c)*s);
        return luasSegitiga;
    
    }
    
}
