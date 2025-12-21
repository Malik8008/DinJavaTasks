package functionalInterface.trafficEnum;

public class AboutTrafficLight {
    public static void about(TrafficLight trafficLight){
        switch (trafficLight){
            case RED -> System.out.println("STOP");
            case YELLOW -> System.out.println("READY");
            case GREEN -> System.out.println("GO");
        }
    }
}
