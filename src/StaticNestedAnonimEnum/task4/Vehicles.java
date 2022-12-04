package StaticNestedAnonimEnum.task4;

public enum Vehicles {
    LAMBORGINI(100_000) {
        @Override
        public String getColor() {
            return "Lime";
        }
    }, LADA(2000) {
        @Override
        public String getColor() {
            return "Brown";
        }
    }, NISSAN(50_000) {
        @Override
        public String getColor() {
            return "Black";
        }
    };

    int price;

    Vehicles(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "car : " + super.name() + " color:" + getColor() + " price: "+getValue();
    }
    public abstract String  getColor();

    public int getValue(){
        return price;
    }


}
