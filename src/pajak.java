public class pajak extends potwor_lesny{
    private boolean zadlo;

    public pajak(boolean agresywny, String makuflarz, boolean zadlo) {
        super(agresywny, makuflarz);
        this.zadlo = zadlo;
    }

    public pajak() {
        this.zadlo = true;
    }

    public void wbicie_zadla(){
        if(isZadlo()){
            if(getPokrycie().equals("bloto"))
                System.out.println("wbicie zadla z ukrycia, przeciwnik sie nie spodziewal");
            else
                System.out.println("przeciwnik cie zauwazyl, wiec jedynie musnales go zadlem");
        }
        else System.out.println("nie mozna wbic zadla jesli sie go nie ma");

        setZadlo(false);
    }
    public void leczenie(){
        magia.odrost_zadla(this);
    }
    public boolean isZadlo() {
        return zadlo;
    }

    public void setZadlo(boolean zadlo) {
        this.zadlo = zadlo;
    }
}
