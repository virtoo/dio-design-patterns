package dio.study;

public class Robot {
    // Robot atributes
    private String sound;
    private String color;
    private String intelligence;
    private RobotType type;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public RobotType getType() {
        return type;
    }

    public void setType(RobotType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "sound='" + sound + '\'' +
                ", color='" + color + '\'' +
                ", intelligence='" + intelligence + '\'' +
                ", type=" + type +
                '}';
    }
}
