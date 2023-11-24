public class zombie extends potwor_lesny{
    private boolean oderwana_reka;

    public zombie(boolean agresywny, String kamufalrz, boolean oderwana_reka) {
        super(agresywny, kamufalrz);
        this.oderwana_reka = oderwana_reka;
    }

    public zombie() {
        this.oderwana_reka = false;
    }

    @Override
    public void atak() {
        if(isOderwana_reka())
            System.out.println("bez reki trudno mu atakowac");
        else
            super.atak();
    }
    public void leczenie(){
        magia.odrost_reki(this);
    }

    public boolean isOderwana_reka() {
        return oderwana_reka;
    }

    public void setOderwana_reka(boolean oderwana_reka) {
        this.oderwana_reka = oderwana_reka;
    }
}
