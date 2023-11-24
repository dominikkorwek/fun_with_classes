

public class Szkielet_boss extends potwor{
    final int maks_szkieletow = 6;
    private szkielet[] szkielets ;
    private int n =0;
    private boolean kapelusz;

    public Szkielet_boss(boolean kapelusz) {
        this.kapelusz = kapelusz;
        this.szkielets = new szkielet[maks_szkieletow];
    }

    public void stworz_szkieleta(){
        if(getN()<szkielets.length){
            szkielets[n] = new szkielet();
            setN(getN()+1);
        }
        else
            System.out.println("nie mozna stworzyc wiecej szkieletow");
    }
    public void atak_szkieletow(){
        for (int i=0;i<getN();i++){
            System.out.println("szkielet "+(i+1)+" atakuje");
            szkielets[i].atakuj();
        }
        if (getN()==0)
            System.out.println("nie ma szkieletow");

        if(isKapelusz())
            System.out.println("z kapeluszem ataki wygladaja na lepsze");
    }

    public boolean isKapelusz() {
        return kapelusz;
    }

    public void setKapelusz(boolean kapelusz) {
        this.kapelusz = kapelusz;
    }

    public szkielet[] getSzkielets() {
        return szkielets;
    }
    public szkielet getszkielet(int i){
        return szkielets[i];
    }

    public void setSzkielets(szkielet[] szkielets) {
        this.szkielets = szkielets;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
