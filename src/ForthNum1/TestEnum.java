package ForthNum1;

public class TestEnum {

    public static void main(String[] args) {
        Enum1 num = new Enum1();
        System.out.println(num.infoSeason(Enum1.Seasons.SUMMER));
        System.out.println(Enum1.Seasons.SUMMER.getTemp());
        System.out.println(Enum1.Seasons.WINTER.getDescription());
    }
}
