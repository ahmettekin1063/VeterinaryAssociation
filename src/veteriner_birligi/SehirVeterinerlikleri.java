package veteriner_birligi;

import java.util.ArrayList;

public class SehirVeterinerlikleri {

    private String sehir;
    private ArrayList<Veteriner> sehirVeterinerleri;
    private int veterinerSayisi;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirVeterinerleri = new ArrayList<>();
        veterinerSayisi =0;
    }

    void veterinerEkle(Veteriner v){

        sehirVeterinerleri.add(v);
        veterinerSayisi++;
        System.out.println(v.getIsim()+"isimli veteriner " + sehir +"sehrindeki veterinerlere eklendi."+sehir+ "sehrindeki veteriner sayisi: " + veterinerSayisi);
    }
}
