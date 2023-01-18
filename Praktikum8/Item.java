package Praktikum8;

public class Item {

    private final float shipingWeight;
    private final int deskripsi;



    //method
    public void Barang(){

        System.out.println("\nDeskripsi              : Batu Safir muliaa");
        System.out.println("Jumlah Stock           : 11");
        System.out.println("Harga                  : " +getDeskripsi());

    }
    // getter
    public int getDeskripsi() {
        return deskripsi;
    }

    public double getShipingWeight() {
        return shipingWeight;
    }

    public Item(int deskripsi,Float shipingWeight) {
        this.deskripsi = deskripsi;
        this.shipingWeight = shipingWeight;
    }


}


