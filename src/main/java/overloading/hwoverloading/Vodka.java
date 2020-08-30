package overloading.hwoverloading;



public class Vodka {
    private final String brand;
    private double volumeOfGlass;
    private final double PercentageOfAlcohol;
    private boolean aromaticAdditive;

    public Vodka (String brand, double PercentageOfAlcohol){
        this.brand = brand;
        this.PercentageOfAlcohol = PercentageOfAlcohol;
    }

    public Vodka (String brand, double volumeOfGlass, double PercentageOfAlcohol, boolean aromaticAdditive){
        this.brand = brand;
        this.volumeOfGlass = volumeOfGlass;
        this.PercentageOfAlcohol = PercentageOfAlcohol;
        this.aromaticAdditive = aromaticAdditive;
    }



    public void printVodka(){
        System.out.println("Я водка " + this.toString());
    }

    public void  drinkTooMuch(int glassOfVodka){
        if (glassOfVodka < 5) {
            System.out.println("Выпил " + glassOfVodka + " рюмки(ок). " + this.toString() + " Мне весело, принесите еще рюмку!" );
        } else
            System.out.println("Выпил " + glassOfVodka + " рюмки(ок). " + this.toString() + " Уже ничего не понимаю, видимо мне хватит!" );
    }

    @Override
    public String toString() {
        return "{" +
                brand +
                ", Объем рюмки = " + volumeOfGlass +
                ", Содержание алкоголя в % = " + PercentageOfAlcohol +
                ", Ароматические добавки " + aromaticAdditive +
                '}';
    }
}
