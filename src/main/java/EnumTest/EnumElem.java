package EnumTest;

public enum EnumElem {
    item1("strItem1"), item2("strItem2");

    private String label;

    public String label() {
        return label;
    }

    EnumElem(String label) {
        this.label = label;
    }
}
