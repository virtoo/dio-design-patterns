package dio.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RobotRegistry {
    private static RobotRegistry robotRegistry;
    //Registry robots in a Hash Map
    private static Map<String, Robot> REGISTRY = new HashMap<>();

    // creates an instance
    public static RobotRegistry getInstance(){
        if (Objects.isNull(robotRegistry)){
            robotRegistry = new RobotRegistry();
            return robotRegistry;
        }
        return robotRegistry;
    }

    // gets thes
    public static Robot getRobot(String key){
        return RobotFactory.getInstance(REGISTRY.get(key));
    }
    public static void addRobot(String key, Robot robot){
        REGISTRY.put(key, robot);
    }
}
