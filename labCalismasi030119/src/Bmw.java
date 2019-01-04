
public class Bmw extends Otomobil{
    public String model;
    public String renk;
    public String fiyat;

    
    public Bmw(String model, String renk, String fiyat, String marka, int agirlik, int tekerlekSayisi, String tur, String yapimYili) {
        super(marka, agirlik, tekerlekSayisi, tur, yapimYili);
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    public Bmw(String marka, int agirlik, int tekerlekSayisi, String tur, String yapimYili) {
        super(marka, agirlik, tekerlekSayisi, tur, yapimYili);
    }
    
  

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    
    
    @Override
    public void ekranaYazdir() {
        super.ekranaYazdir();
        System.out.println("model : "+this.model);
        System.out.println("renk :"+this.renk);
        System.out.println("fiyat : "+this.fiyat);
        System.out.println("--------------------------");
    }
    
    
}
