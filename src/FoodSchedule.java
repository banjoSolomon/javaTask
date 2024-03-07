public enum FoodSchedule {
    MONDAY("Rice", "Beans","Yam"),
    TUESDAY("Spag", "Eba", "Fish"),
    WEDNESDAY("Rice", "Potato", "Meat"),
    THUSDAY("Pizza", "Rice", "Beans"),
    FRIDAY("Peper", "Plantain", "Yam");

    private  String[] Foods;
    FoodSchedule(String...Foods){
        this.Foods = Foods;
    }

    public void setFoods(String...foods) {
        Foods = foods;
    }

    public String[] getFoods() {
        return Foods;
    }

}
