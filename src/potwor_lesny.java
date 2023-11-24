abstract class potwor_lesny extends potwor{
    private String kamufalrz;

    public potwor_lesny(boolean agresywny, String kamufalrz) {
        super(agresywny);
        this.kamufalrz = kamufalrz;
    }

    public potwor_lesny() {
        this.kamufalrz = "mech";
    }

    public void zmiana_kamuflarzu(){
        if(getPokrycie()=="mech"){
            System.out.println("potwor wytaplal sie w blocie");
            setPokrycie("bloto");
        }
        else
            System.out.println("potwor nie moze zmienic kamuflarzu");
    }


    public String getPokrycie() {
        return kamufalrz;
    }

    public void setPokrycie(String kamufalrz) {
        this.kamufalrz = kamufalrz;
    }
}
