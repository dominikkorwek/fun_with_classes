public class test {
    public static void main(String[] args) {
        potwor[] tablica = new potwor[3];
        tablica[0] = new pajak();
        tablica[1] = new zombie();
        tablica[2] = new Szkielet_boss(true);
        System.out.println();

        tablica[0].atak();

        if(tablica[0] instanceof potwor_lesny)
            ((potwor_lesny)tablica[0]). zmiana_kamuflarzu();

        tablica[0].atak();
        ((pajak)tablica[0]).wbicie_zadla();
        ((pajak)tablica[0]).leczenie();
        System.out.println();

        if(tablica[1] instanceof zombie){
            ((zombie)tablica[1]).leczenie();
            ((zombie)tablica[1]).setOderwana_reka(true);
        }

        tablica[1]. atak();
        System.out.println();

        ((Szkielet_boss)tablica[2]).stworz_szkieleta();
        ((Szkielet_boss)tablica[2]).stworz_szkieleta();
        ((Szkielet_boss)tablica[2]).atak_szkieletow();


    }
}
