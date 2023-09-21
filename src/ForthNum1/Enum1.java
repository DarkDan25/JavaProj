package ForthNum1;

public class Enum1 {
    public enum Seasons{
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
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
