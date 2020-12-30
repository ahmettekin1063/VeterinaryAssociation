package veteriner_birligi;

import java.util.ArrayList;

public class Musteri extends Kisi{

    private String adres;
    private ArrayList<Hayvan> musteriHayvanlari;

    public ArrayList<Hayvan> getMusteriHayvanlari() {
        return musteriHayvanlari;
    }

    public Musteri(String isim, String tcKimlik, String adres) {
        super(isim, tcKimlik);
        this.adres=adres;
        musteriHayvanlari= new ArrayList<>();

    }

    public void hayvanEkle(Hayvan h){
        musteriHayvanlari.add(h);
        System.out.println(h+"hayvanı "+getIsim()+" musterisine eklendi");
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+"ben bir müşteriyim.");
    }

    @Override
    public String toString() {
        return super.toString()+"Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
