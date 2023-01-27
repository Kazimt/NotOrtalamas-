import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        mat=inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik=inp.nextInt();

        System.out.println("Kimya Notunuz ");
        kimya=inp.nextInt();

        System.out.println("Turkce Notunuz:");
        turkce = inp.nextInt();

        System.out.println("tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam/6 ;
        System.out.println("Not Ortalaması:" + sonuc);
        String kosul1=sonuc>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(kosul1);


    }
}