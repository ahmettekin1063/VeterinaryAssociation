package veteriner_birligi;

public class Main {

    public static void main(String[] args) {


        ilkNesneleriOlustur();
    }


    private static void ilkNesneleriOlustur(){
        Kedi kedi = new Kedi("01-01-2016",true, " van kedisi");
        Kedi kedi2= new Kedi("04-12-2020",false,"siyam");
        Kedi kedi3= new Kedi("05-03-2013",true,"Tekir");

        Kopek kopek=new Kopek("02-06-2018",true,1,"Kangal");
        Kopek kopek2= new Kopek("03-10-2015",true,3,"Golden");
        Kopek kopek3= new Kopek("01-10-2077",true,3,"Karabaş");

        Musteri m1 = new Musteri("emre","1234","balıkesir");
        m1.hayvanEkle(kedi);
        m1.hayvanEkle(kopek);

        Musteri m2 = new Musteri("hasan","4244","istanbul");
        Musteri m3 = new Musteri("ali","4432","izmir");

        Veteriner v1 = new Veteriner("ALİ","222","gazi",1);
        Veteriner v2 = new Veteriner("ahmet","422","psü",3);
        Veteriner v3 = new Veteriner("polat","522","dpü",5);

        v3.musteriEkle(m1);
        v3.musteriEkle(m2);

        v3.musteriListesi();

        SehirVeterinerlikleri ankara = new SehirVeterinerlikleri("ankara");
        ankara.veterinerEkle(v3);
        ankara.veterinerEkle(v2);

        YonetimPaneli<Hayvan> hayvanYonetimPaneli= new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgilerigoster(kedi);


        YonetimPaneli<Musteri> musteriYonetimPaneli= new YonetimPaneli<>();
        musteriYonetimPaneli.sahipOlunanHayvanlar(m1);


    }

}
