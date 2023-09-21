package ForthNum1;

public class Enum1 {
    public enum Seasons{
        WINTER(-5),
        SPRING(+8),
        SUMMER(+20),
        AUTUMN(+3);
        private final int temp;
        //Constructor of Season
        private Seasons(int temp)
        {
            this.temp = temp;
        }
        public int getTemp() {
            return this.temp;
        }
    }
    public String infoSeason(Seasons season)
    {
        return switch (season) {
            case WINTER -> "I like winter";
            case SPRING -> "I like spring";
            case SUMMER -> "I like summer";
            case AUTUMN -> "I like autumn";
            default -> "Wrong season";
        };

    }
}
