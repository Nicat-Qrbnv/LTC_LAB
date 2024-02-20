package prjcts.p3_mapApp.enums;

public enum LineMarker {
    DASHED ("¦"),
    DOTTED ("⁝"),
    SOLID ("|");

    private final String icon;

    LineMarker(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return icon;
    }
}
