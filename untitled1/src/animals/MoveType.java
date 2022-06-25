package animals;

public enum MoveType {
    FLY("летает"), WALK("ходит"), SWIM("плавает");
    private String value;

    MoveType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  value ;
    }
}
