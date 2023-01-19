package Praktikum8;

public class Check extends Payment{

    private String name;
    private String bangID;


    @Override
    public void Pembayaran(){
        super.Pembayaran();
        System.out.println("Nama Akun  = " + name);
        System.out.println("ID Bank    = " +bangID );
    }

    public Check(float amount, String name, String bangID) {
        super(amount);
        this.name = name;
        this.bangID = bangID;

    }
}
