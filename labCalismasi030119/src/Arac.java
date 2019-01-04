
public class Arac {
    public String tur;
    public String yapimYili;

    public Arac(String tur, String yapimYili) {
        this.tur = tur;
        this.yapimYili = yapimYili;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getYapimYili() {
        return yapimYili;
    }

    public void setYapimYili(String yapimYili) {
        this.yapimYili = yapimYili;
    }
    
    public void ekranaYazdir(){
        System.out.println("tur : " +this.tur);
        System.out.println("yapim yili : "+this.yapimYili);
        System.out.println("--------------------------");
    }
}
