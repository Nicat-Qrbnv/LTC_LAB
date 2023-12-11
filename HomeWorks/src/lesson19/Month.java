package lesson19;

public enum Month {
    JAN ("winter"),
    FEB ("winter"),
    MAR ("spring"),
    APR ("spring"),
    MAY ("spring"),
    JUN ("summer"),
    JUL ("summer"),
    AUG ("summer"),
    SEP ("autumn"),
    OCT ("autumn"),
    NOV ("autumn"),
    DEC ("winter");

    String season;

    Month(String season) {
        this.season = season;
    }

    public void printMonth () {
        StringBuilder sb = new StringBuilder( String.valueOf(this) );

        if (this.season == "summer") {
            sb.append( " is summer month" );
        }

        System.out.println (sb);
    }
}
