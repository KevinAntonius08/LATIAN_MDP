package com.example.tugasmdp;
import java.util.ArrayList;

public class Order {
    String jenis;
    ArrayList<String> toping = new ArrayList<String>();
    int harga,qty;

    public Order( String jenis, ArrayList<String> toping, int harga,int qty) {
        this.jenis = jenis;
        this.toping = toping;
        this.harga = harga;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public ArrayList<String> getToping() {
        return toping;
    }

    public void setToping(ArrayList<String> toping) {
        this.toping = toping;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
