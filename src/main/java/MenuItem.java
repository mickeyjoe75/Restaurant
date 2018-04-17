public enum MenuItem {
    LASAGNE("Lasagne", "Garfield's favourite.", 7.00),
    LATTE("Latte", "Milky Coffee", 2.50),
    SAUSAGES("Sausages", "Porky goodness", 5.00),
    WAFFLES("Whisky Waffles", "Jamie's favourite drink.", 8.00),
    LETTUCE("Lettuce", "Sadness", 1.02);

    private String name;
    private String description;
    private double value;

    MenuItem(String name, String description, double value){
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getDescription(){
        return description;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}