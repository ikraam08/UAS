package Praktikum8;

public class JumlahHarga extends Jumlah {
     private double jum;

     public JumlahHarga (double jum){
     this.jum= jum;
     }

    public double getJumlah() {
         return jum + 4500;

     }


    public String toString() {
        return "Jumlah harga di potong pajak 5%";
    }
}
