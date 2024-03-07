public enum GeopoliticalZone {
    NORTH_CENTRAL("Benue", "FTC", "Kongi","Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bouchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi","Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");


    private String[] States;

    GeopoliticalZone(String...State){
        this.States = State;

    }

   public String[] getStates(){
        return States;
    }

    public void setStates(String...states) {
        States = states;
    }
}
