package prjcts.P3_MapApp;

import prjcts.P3_MapApp.enums.Geometry;
import prjcts.P3_MapApp.enums.PointMarker;
import prjcts.P3_MapApp.enums.UsageType;

public class Building implements Mappable {
    private static final Geometry TYPE = Geometry.POINT;
    private final PointMarker marker;
    private final String name;
    private final UsageType usage;

    public Building(PointMarker marker, String name, UsageType usage) {
        this.marker = marker;
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return "%s (%s)".formatted(name, usage);
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
                , "name" : "%s", "usage" : "%s" """.formatted(name, usage);
    }
}
