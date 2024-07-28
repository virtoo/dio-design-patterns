package dio.study;

public class RobotFactory {
    public static Robot getInstance(Robot prototype){
        Robot robotClone = new Robot();
        robotClone.setColor(prototype.getColor());
        robotClone.setSound(prototype.getSound());
        robotClone.setIntelligence(prototype.getIntelligence());
        robotClone.setType(prototype.getType());

        return robotClone;
    }
}
