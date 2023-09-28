package ForthNum1;

public class TestEnum {
    public static void main(String[] args) {
        for(Enum1.Seasons seas : Enum1.Seasons.values()){
            System.out.println(seas+" "+seas.getTemp()+" "+seas.getDescription());
        }
    }
}
