class Kisi{
    String isim;

    public Kisi(String isim) {
        this.isim = isim;
    }
    
    String getIsim(){
        return this.isim;
    }
}
class Calisan extends Kisi{
    
    public int maas;

    public Calisan(String isim,int maas) {
        super(isim);
        this.maas = maas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int ms) {
        this.maas = ms;
    }
    
}
class Yonetici extends Calisan{
    int bonus;

    public Yonetici( String isim, int maas) {
        super(isim, maas);
        this.bonus = 0;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bns) {
        this.bonus = bns;
    }

    @Override
    public int getMaas() {
        return super.getMaas()+bonus;
    }
}


public class Sirket {
    public Calisan[] calisanlar ;
    
    public Sirket(){
        calisanlar = new Calisan[3];
        Yonetici yonetici = new Yonetici("Seyma Nur Mutlu",2000);
        yonetici.setBonus(20);
        calisanlar[0] = yonetici;
        calisanlar[1]= new Calisan("Utku Sayan",1000);
        calisanlar[2]= new Calisan("Duygu Ucer",1500);
    }
    public void CalisanlariGoster(){
        for(int i = 0; i< 3;i++){
        System.out.println(calisanlar[i].isim + " : "+ calisanlar[i].getMaas());
    }
    }
    public static void main(String[] args) {
        Sirket sirket = new Sirket();
        sirket.CalisanlariGoster();
    }
}
