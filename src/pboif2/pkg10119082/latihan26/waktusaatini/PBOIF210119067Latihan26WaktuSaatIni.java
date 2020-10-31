/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan26.waktusaatini;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi Program : Waktu Saat Ini
 */
public class PBOIF210119067Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date tanggal = new Date();

        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        System.out.println("Hari ini :"+ format.format(tanggal));
        System.out.println("Developed by : Danhago");
    }
    
}
