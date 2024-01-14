package prjcts.P3_MapApp;

import prjcts.P3_MapApp.enums.LineMarker;
import prjcts.P3_MapApp.enums.PointMarker;
import prjcts.P3_MapApp.enums.UsageType;
import prjcts.P3_MapApp.enums.UtilityType;

public class Main {
    public static void main(String[] args) {
        Building b = new Building(PointMarker.STAR, "Sydney Town Hall", UsageType.GOVERNMENT);
        UtilityLine u = new UtilityLine(LineMarker.DOTTED, "College St", UtilityType.FIBER_OPTIC);

        Mappable.printProperties (b);
        System.out.println();
        Mappable.printProperties (u);
    }
}
