package Praktikum8;

public class OrderDetail {
    private Item quantity = new Item("mahas",(float)43);
    private final String taxStatus;

    // operator calcSubTotal asosiasi dari class Item
    public void calcSubTotal (){
        quantity.Barang();
    }
    // operator asosiasi dari class Item juga
    public void calcWeight (){
        System.out.println("Berat                  : " + quantity.getShipingWeight() +" kg");
    }

    //operator class ini sendiri
    public void calcTax (){
        System.out.println("Admin                  : " + taxStatus);
    }

    // setter
    public void setQuantity(Item quantity) {
        this.quantity = quantity;
    }

    public OrderDetail(String taxStatus) {
        this.taxStatus = taxStatus;
    }

}
