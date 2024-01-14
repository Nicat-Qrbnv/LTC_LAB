package prjcts.P3_MapApp.enums;

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
