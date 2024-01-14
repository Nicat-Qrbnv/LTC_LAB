package prjcts.P3_MapApp;

import prjcts.P3_MapApp.enums.Geometry;

public interface Mappable {

    String JSON_PROPERTY = "\"properties\" : {%s}";

    String getLabel ();
    Geometry getType ();
    String getMarker();

    default String toJSON () {
        return """
                "type" : "%s", "label" : "%s", "marker" : "%s" """.formatted(getType(), getLabel(), getMarker());
    }

    static void printProperties (Mappable mpl) {
        System.out.println (JSON_PROPERTY.formatted(mpl.toJSON()));
    }
}
