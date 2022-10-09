public class Objek {
    //method / properti static pada level class bukan pada level objek lagi : bisa memanggil method langsung dari class nya
    public static void main(String[] args) throws Exception {

        Segitiga s1 = new Segitiga();
        s1.nama = "Daffa";
        System.out.println(s1.nama);

        Segitiga s3 = new Segitiga();
        s3.nama = "Budi";
        System.out.println(s3.nama);
        System.out.println(s1.nama);

        int b = 7;
        String x = "5" + b;
        System.out.println(x);

    }
}
