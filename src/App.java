public class App {
    public static void main(String[] args) throws Exception{
        
       Banka b1=new Banka();
       b1.setHesapSahibiAdi("furkan");
       System.out.println("Hesap numarası= "+ b1.hesapNo());
       b1.setHesaptakiPara(45000);
       b1.setCekilecekTutar(20000);
       b1.setYatiralacakTutar(15000);
       b1.paraCek();
        System.out.println("Hesaptaki para= "+ b1.getHesaptakiPara());
        b1.paraYatir();
        System.out.println("Hesaptaki para= "+ b1.getHesaptakiPara());
        System.out.println("-----------------");
        
     
     
        Banka b2=new Banka();
       b2.setHesapSahibiAdi("ecrin");
       System.out.println("Hesap numarası= "+ b2.hesapNo());
       b2.setHesaptakiPara(75000);
       b2.setCekilecekTutar(10000);
       b2.setYatiralacakTutar(11000);
       b2.paraCek();
        System.out.println("Hesaptaki para= "+ b2.getHesaptakiPara());
        b2.paraYatir();
        System.out.println("Hesaptaki para= "+ b2.getHesaptakiPara());
        b2.paraCek();
        System.out.println("Hesaptaki para= "+ b2.getHesaptakiPara());
        System.out.println("-----------------");

        System.out.println("Toplam Oluşturulan Hesap Sayısı="+ Banka.olusturulanHesapSayisi);

        System.out.println("Toplam Yapılan Para Yatırma İşlemi Sayısı="+ Banka.yapilanParaYatirmaIslemiSayisi);
        System.out.println("Toplam Yapılan Para Çekme İşlemi Sayısı="+Banka.yapilanParaCekmeIslemiSayisi);
        System.out.println("------------------------------");

        Banka.Karsilatir(b1, b2);
    }
}

 class Banka {

    private String hesapSahibiAdi;
    private int cekilecekTutar;
    private int yatiralacakTutar;
    private int hesaptakiPara;
    public static int olusturulanHesapSayisi;
    public static int yapilanParaCekmeIslemiSayisi;
    public static int yapilanParaYatirmaIslemiSayisi;
 
     public Banka(){
        olusturulanHesapSayisi++;
     }
   

    public String getHesapSahibiAdi() {
        return this.hesapSahibiAdi;
    }

    public void setHesapSahibiAdi(String hesapSahibiAdi) {
        this.hesapSahibiAdi = hesapSahibiAdi;
    }

    public int getCekilecekTutar() {
        return this.cekilecekTutar;
    }

    public void setCekilecekTutar(int cekilecekTutar) {
        this.cekilecekTutar = cekilecekTutar;
    }

    public int getYatiralacakTutar() {
        return this.yatiralacakTutar;
    }

    public void setYatiralacakTutar(int yatiralacakTutar) {
        this.yatiralacakTutar = yatiralacakTutar;
    }
     public int getHesaptakiPara() {
        return this.hesaptakiPara;
    }

    public void setHesaptakiPara(int hesaptakiPara) {
        this.hesaptakiPara = hesaptakiPara;
    }
    
    public int paraYatir(){
    System.out.println("Para yatırılıyor...");
    yapilanParaYatirmaIslemiSayisi++;
    return hesaptakiPara+=yatiralacakTutar;
    }
    
    public int paraCek(){
    System.out.println("Para çekiliyor...");
    yapilanParaCekmeIslemiSayisi++;
    return hesaptakiPara-=cekilecekTutar;
    }

    public String hesapNo(){
        return hesapSahibiAdi+"0123";
    } 
    
    public static void Karsilatir(Banka b1, Banka b2){
        if(b1.getHesaptakiPara()>b2.getHesaptakiPara()){
            System.out.println("Son durumda "+ b1 + " hesabındaki para, " +b2 +" hesabındaki paradan çoktur.");
        
        }
        else if(b1.getHesaptakiPara()==b2.getHesaptakiPara()){
            System.out.println("Son durumda "+ b1 + " hesabındaki para, " +b2 +" hesabındaki paraya eşittir.");
        }
        else{
            System.out.println("Son durumda "+ b1 + " hesabındaki para, " +b2 +" hesabındaki paradan azdır.");
        }
    }


    
    
}

