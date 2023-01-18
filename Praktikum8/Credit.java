package Praktikum8;

public class Credit extends Payment{

    private String number;
    private String tipe;



    public void Pembayaran(){

        super.Pembayaran();
        System.out.println("Nomer Pembayaran" + number);
        System.out.println("Tipe pembayran" + tipe);


    }

    public Credit(Float amount, String number, String tipe) {
        super(amount);
        this.number = number;
        this.tipe = tipe;
    }

}
