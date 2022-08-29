package models;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.name="ilayda";
        ogr1.ogrNo=1;
        ogr1.email="ilayda@kocaeli.edu.tr";
        ogr1.sinif=4;
        ogr1.setPassword("kqmex2u13");
        ogr1.bolum= "Bilgisayar";


       Fakulte ilaydaFakulte = new Fakulte();
       ilaydaFakulte.fakulteName="Mühendislik";
       ilaydaFakulte.fakulteNo=1;

        Ogrenci ogr2 = new Ogrenci();
        ogr2.name="sude";
        ogr2.ogrNo=1;
        ogr2.email="sude@kocaeli.edu.tr";
        ogr2.sinif=4;
        ogr2.bolum= "Elektrik";


        Fakulte sudeFakulte = new Fakulte();
        sudeFakulte.fakulteName="Mühendislik";
        sudeFakulte.fakulteNo=1;




       Ogretmen ogretmen1=new Ogretmen();
       ogretmen1.name="ahmet can";
       ogretmen1.email="ahmetcan@kocaeli.edu.tr";
       ogretmen1.ders= "java, görsel programlama, yazılım lab";
       ogretmen1.bolum= "Bilgisayar";


        Ogretmen ogretmen2=new Ogretmen();
        ogretmen2.name="ayse";
        ogretmen2.email="ayse@kocaeli.edu.tr";
        ogretmen2.ders= "makine ogrenmesi, yazılım lab";
        ogretmen2.bolum= "Bilgisayar";

    }

    /*
    public static List<Ogrenci> get.Ogrenci(){

    }
    public static List<Ogretmen> get.Ogrenci(){

    }
    public static List<Ogrenci> get.Ogrenci(){

    }

     */


}








