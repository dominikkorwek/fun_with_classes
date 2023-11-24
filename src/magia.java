public class magia {
    public static void odrost_reki(zombie z){
        if(z.isOderwana_reka()){
            System.out.println("zombie odrasta reka");
            z.setOderwana_reka(false);
        }
        else
            System.out.println("zombie ma wszystkie rece");
    }
    public static void odrost_zadla(pajak p){
        if (p.isZadlo())
            System.out.println("pajak ma zadlo");
        else{
            System.out.println("pajakowi odroslo zadlo");
            p.setZadlo(true);
            }

    }
}
