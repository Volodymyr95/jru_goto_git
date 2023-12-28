package ua.javarush.l20;

public enum Gender {
    MALE, FEMALE;

    private String description;

    Gender() {
    }

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
