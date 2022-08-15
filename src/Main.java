import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz, bolen = 0, toplam = 0;
        double ort = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fiz = input.nextInt();
        System.out.println("Turkce notunuz: ");
        tur = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kim = input.nextInt();
        System.out.println("Muzik notunuz: ");
        muz = input.nextInt();

        if ((mat >= 0) && (mat <= 100)){
            toplam += mat;
            bolen ++;
        }
        if ((fiz >= 0) && (fiz <= 100)){
            toplam += fiz;
            bolen ++;
        }
        if ((tur >= 0) && (tur <= 100)){
            toplam += tur;
            bolen ++;
        }
        if (kim >= 0 && kim <= 100){
            toplam += kim;
            bolen ++;
        }
        if (muz >= 0 && muz <= 100){
            toplam += muz;
            bolen ++;
        }
        if (bolen > 0){
            ort = toplam / bolen;
        }
        if (ort >= 55){
            System.out.println("Geçtiniz !");
        }
        else{
            System.out.println("Kaldınız !");
        }
        System.out.println("Ortalamanız : "+ ort);




    }

}
