package Praktikum8;

import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {


        //scanner untuk memasukan input user
        Scanner masukan = new Scanner(System.in);

        // membuat object orderan pada pada kelas Order
        Order orderan1 = new Order(121123,"Menunggu Pembayaran",new OrderDetail(5));
        Cash COD = new Cash(10000,10000);
        Credit Ngutang = new Credit((float) 10000," 12121212828362863826"," Credit");
        Check PC = new Check(10000,"uauaxi","1212121212");
        JumlahHarga jum = new JumlahHarga(10000);


        // object OrderDetail
        OrderDetail barang = new OrderDetail(5);
        barang.setQuantity(new Item(100000, (float) 2));

        // List data customer menggunakan setter
        orderan1.setDataCustomer(new Customer("palpalepalpale","kessa,Jawa Utara,12255"));

        /* callmethod menggunakan for dan Arrsday.asList pada infoOrderan
         beserta operasi class lain
         */
        orderan1.infoOrderan();
        orderan1.SubTotal();
        orderan1.TotalWeight();
        orderan1.Total();
        barang.calcSubTotal();
        barang.calcWeight();
        orderan1.calcTax();
        System.out.println();
        System.out.println("=== PILIH METODE PEMBAYARAN====");
        System.out.print("mau bayar pake apa kak cash,credit atau check :");

        // Membuat GUI dan dengan switch case
        // object jframe untuk menampilkan frame
        JFrame jFrame;
        String pilih;
        masukan.next();
        pilih = masukan.next();
        switch (pilih) {
            case "cash" -> {
                System.out.println("===INI STRUCKNYA KAK===");
                System.out.println("METODE PEMBAYARAN CASH");
                COD.Pembayaran();
                //memanggil method class abstract
                System.out.println(jum.toString());
                System.out.println(jum.getJumlah());
                System.out.println("terima kasih telah berbelanja di toko kami,Saya tunggu kedatangannya kembali ya kak");
            }
            case "credit" -> {

                jFrame = new JFrame();
                jFrame.setSize(400, 300);
                jFrame.setVisible(true);
                JOptionPane.showInputDialog(null,
                        "setiap pembayaran ada biaya admin ya kak",JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(jFrame,"Baik Terima kasih");
                System.out.println();

                System.out.println("===INI STRUCKNYA===");
                System.out.println("METODE PEMBAYARAN KREDIT");
                Ngutang.Pembayaran();
                //memanggil method class abstract
                System.out.println(jum.toString());
                System.out.println(jum.getJumlah());
                System.out.println("jangan telat bayar setiap bulannya yaa kak");
            }

            case "check" -> {

                jFrame = new JFrame();
                jFrame.setSize(400, 300);
                jFrame.setVisible(true);

                String inputString=
                        JOptionPane.showInputDialog(null,"Masukan Nama Bank",
                                JOptionPane.QUESTION_MESSAGE);
                String str = String.format(inputString);

                String input2String=
                        JOptionPane.showInputDialog(null,"Masukan password",
                                JOptionPane.QUESTION_MESSAGE);

                String pass = String.format(input2String);
                System.out.println("Nama Bank = " +str);
                System.out.println("password = " +pass);
                System.out.println();
                JOptionPane.showMessageDialog(jFrame,"terima kasih telah berbelanja di toko kami,Saya tunggu kedatangannya kembali ya kak");


                System.out.println("===INI STRUCKNYA===");
                System.out.println("METODE PEMBAYARAN CHECK");
                PC.Pembayaran();
                //memanggil method class abstract
                System.out.println(jum.toString());
                System.out.println("Jadi Total di bayar : "+jum.getJumlah());
            }
        }

    }
}
