abstract class potwor {
    private boolean agresywny;
    public void atak(){
        if(isAgresywny())
            System.out.println("grozny atak");
        else
            System.out.println("niechetny atak");
    }

    public potwor(boolean agresywny) {
        this.agresywny = agresywny;
    }
    public potwor() {
        this.agresywny = false;
    }

    public boolean isAgresywny() {
        return agresywny;
    }

    public void setAgresywny(boolean agresywny) {
        this.agresywny = agresywny;
    }
}
