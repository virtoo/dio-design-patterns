package dio.study;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Application {
    public static void main(String[] args){

        String key1 = "CLEANING_ROBOT";
        Robot cleaningRobot = new Robot();
        cleaningRobot.setColor("white");
        cleaningRobot.setSound("no sound");
        cleaningRobot.setIntelligence("cleaning");
        cleaningRobot.setType(RobotType.SEMI_AUT);
        RobotRegistry.addRobot(key1,cleaningRobot);

        String key2 = "HUMAN_ROBOT";
        Robot humanRobot = new Robot();
        humanRobot.setColor("skin tone");
        humanRobot.setSound("human voice");
        humanRobot.setIntelligence("human like");
        humanRobot.setType(RobotType.AUTONOMUS);
        RobotRegistry.addRobot(key2,humanRobot);

        Robot cRobotClone = RobotRegistry.getRobot("CLEANING_ROBOT");
        Robot hRobotClone = RobotRegistry.getRobot("HUMAN_ROBOT");

        System.out.println(cRobotClone);
        System.out.println(hRobotClone);

    }
}
