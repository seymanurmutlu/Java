
public class Otomobil extends Arac{
    
    public String marka;
    public int agirlik;
    public int tekerlekSayisi;

    public Otomobil(String marka, int agirlik, int tekerlekSayisi, String tur, String yapimYili) {
        super(tur, yapimYili);
        this.marka = marka;
        this.agirlik = agirlik;
        this.tekerlekSayisi = tekerlekSayisi;
    }



    public Otomobil(String tur, String yapimYili) {
        super(tur, yapimYili);
    }
    

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    @Override
    public void ekranaYazdir() {
        super.ekranaYazdir();
        System.out.println("marka : "+this.marka);
        System.out.println("agirlik : " +this.agirlik);
        System.out.println("--------------------------");
    }
    

    
}
