package veteriner_birligi;

import jdk.swing.interop.SwingInterOpUtils;

public class YonetimPaneli<T> {

    public void bilgilerigoster(T nesne) {

        System.out.println(nesne);

    }

    public <T extends Musteri>void sahipOlunanHayvanlar(T musteri) {


        System.out.println(musteri.getMusteriHayvanlari());


    }


}
