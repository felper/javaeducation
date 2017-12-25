package ru.sbt.education;

public class HelloGiverENG implements IHelloGiver {


    @Override
    public String sayHello() {
        switch  (TimeUtil.getPeriod()) {
            case MORNING:
                return "Good morning!";
            case DAY:
                return "Good day!";
            case EVENING:
                return "Good evening";
            case NIGHT:
                return "Good night";
            default:
                return "ALOHA, I don't know this period";
        }
    }
}
