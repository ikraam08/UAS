package Praktikum8;

public class Payment{
    private final float amount;

    public void Pembayaran(){

        System.out.println("Jumlah pembayaran  = " + amount);

    }

    public Payment(float amount) {
        this.amount = amount;
    }
}
