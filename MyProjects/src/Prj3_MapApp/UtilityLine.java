package Prj3_MapApp;

import Prj3_MapApp.enums.Geometry;
import Prj3_MapApp.enums.LineMarker;
import Prj3_MapApp.enums.UtilityType;

public class UtilityLine implements Mappable{
    private static final Geometry TYPE = Geometry.LINE;
    private final LineMarker marker;
    private final String name;
    private final UtilityType utility;

    public UtilityLine(LineMarker marker, String name, UtilityType utility) {
        this.marker = marker;
        this.name = name;
        this.utility = utility;
    }

    @Override
    public String getLabel() {
        return "%s (%s)".formatted(name, utility);
    }

    @Override
    public Geometry getType() {
        return TYPE;
    }

    @Override
    public String getMarker() {
        return marker.toString();
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name" : "%s", "utility" : "%s" """.formatted(name, utility);
    }
}
