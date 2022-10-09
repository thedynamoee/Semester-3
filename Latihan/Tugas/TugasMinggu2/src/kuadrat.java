import java.util.Scanner;

public class kuadrat {
    public static void main(String[] args) throws Exception {
        int n=0; 
        int kuadrat = 0; 
        int jumlah = 0;
        int totalKuadrat = 0; 
        int jumlahKuadrat; 
        int selisih;

        Scanner scanner = new Scanner (System.in);

        while (n<=0){
            System.out.println("Masukkan Nilai n : ");
            n=scanner.nextInt();

            if(n<=0){
                System.out.println("Invalid Input");
            }
        }
        for (int i =1; i<=n; i++){
            kuadrat=i*i;
            totalKuadrat=totalKuadrat + kuadrat;
            jumlah = jumlah + i;
        }
        jumlahKuadrat = jumlah*jumlah;
        if(jumlahKuadrat>totalKuadrat){
            selisih = jumlahKuadrat-totalKuadrat;
        }
        else {
            selisih = totalKuadrat-jumlahKuadrat;
        }
        System.out.println("Selisih kuadrat - jumlah = " + selisih);
        
    }
}
