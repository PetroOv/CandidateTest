package ui.tests;

public enum TestData {
    LOGIN("petroov@gmail.com"),
    PASSWORD("qwerty123"),
    TESTBOARD("testBoard");
    private final String value;

    TestData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
