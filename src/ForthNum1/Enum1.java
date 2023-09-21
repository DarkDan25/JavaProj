package ForthNum1;

public class Enum1 {
    public enum Seasons{
        WINTER(-5),
        SPRING(+8),
        SUMMER(+20){
            @Override
            public String getDescription() {
                return "Warm season";
            }
        },
        AUTUMN(+3);
        private final int temp;
        //Constructor of Season
        private Seasons(int temp)
        {
            this.temp = temp;
        }
        public String getTemp() {
            return "Temp:" +this.temp;
        }

        public String getDescription()
        {
            return "Cold season";
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
