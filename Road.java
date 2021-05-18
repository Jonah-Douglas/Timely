public class Road {
    String roadName;
    int roadAppearanceTally;            //how often this given road has packages ordered to it (used for optimizing 2d roadmap)
    int roadZipCode;                    //if 00000, road spans multiple zip codes
}
