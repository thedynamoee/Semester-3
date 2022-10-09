import java.util.Scanner;

public class prima {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int bilangan, check=0;

        System.out.println("PROGRAM MENENTUKAN BILANGAN PRIMA ATAU TIDAK");
        System.out.println("===================================");
        System.out.print("Masukkan bilangan !");
        bilangan = scanner.nextInt();

        for(int i=2; i<=bilangan; i++){
            if (bilangan%i==0){
                check++;
            }
        }

        if(bilangan < 1){
            System.out.println("Input harus besar dari 0");

        }
        if (check==1){
            System.out.println(bilangan + " adalah bilangan prima");
        }
        else {
            System.out.println(bilangan + " bukan bilangan prima");
        }

    }
}
