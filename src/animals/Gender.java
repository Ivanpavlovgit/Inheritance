package animals;

public enum Gender {
    MALE ("Male"),
    FEMALE ("Female");
    private String asString;

    Gender (String asString) {
        this.asString = asString;
    }

    public String getAsString () {
        return this.asString;
    }
}
