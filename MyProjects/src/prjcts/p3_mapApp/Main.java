package prjcts.p3_mapApp;

import prjcts.p3_mapApp.enums.LineMarker;
import prjcts.p3_mapApp.enums.PointMarker;
import prjcts.p3_mapApp.enums.UsageType;
import prjcts.p3_mapApp.enums.UtilityType;

public class Main {
    public static void main(String[] args) {
        Building b = new Building(PointMarker.STAR, "Sydney Town Hall", UsageType.GOVERNMENT);
        UtilityLine u = new UtilityLine(LineMarker.DOTTED, "College St", UtilityType.FIBER_OPTIC);

        Mappable.printProperties (b);
        System.out.println();
        Mappable.printProperties (u);
    }
}
