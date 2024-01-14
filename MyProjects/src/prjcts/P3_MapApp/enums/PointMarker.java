package prjcts.P3_MapApp.enums;

public enum PointMarker {
    CIRCLE ("⏺️"),
    PUSH_PIN ("📌"),
    TRIANGLE ("🔼"),
    SQUARE ("⏹️"),
    STAR ("⭐");

    private final String icon;

    PointMarker(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return icon;
    }
}
