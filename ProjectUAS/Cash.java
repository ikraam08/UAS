package Praktikum8;

public class Cash extends Payment{

    private final float cash;


    @Override
    public void Pembayaran(){
        super.Pembayaran();
        System.out.println("Di Bayarkan " + cash);
    }

    public Cash(float amount, float cash) {
        super(amount);
        this.cash = cash;

    }
}
