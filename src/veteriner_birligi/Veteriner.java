package veteriner_birligi;

import java.util.ArrayList;

public class Veteriner extends Kisi {

    private String mezunOlduguOkul;
    private int calismaSuresi;
    private ArrayList<Musteri> vetSahipMus;
    private int musteriSayisi;

    public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi) {

        super(isim, tcKimlik);

        this.mezunOlduguOkul = mezunOlduguOkul;
        this.calismaSuresi = calismaSuresi;

        vetSahipMus = new ArrayList<>();
        musteriSayisi = 0;


    }

    @Override
    void kendiniTanit() {

        System.out.println(toString() + "Ben bir veterinerim.");
    }

    @Override
    public String toString() {
        return super.toString() + "Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }

    void musteriEkle(Musteri m) {
        vetSahipMus.add(m);
        musteriSayisi++;
        System.out.println(m + "musterisi" + getIsim() + "veterinerine eklendi.");
        System.out.println(getIsim() + " isimli veterinerin " + musteriSayisi + " müşterisi vardır.");
    }

    void musteriListesi(){
        for(Musteri m : vetSahipMus){
            m.kendiniTanit();
        }
    }
}
