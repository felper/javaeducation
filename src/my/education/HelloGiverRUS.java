package my.education;

import static my.education.TimeUtil.*;

public class HelloGiverRUS implements IHelloGiver {


    @Override
    public String sayHello() {
        switch  (getPeriod()) {
            case MORNING:
                return "Доброе утро!";
            case DAY:
                return "Добрый день!";
            case EVENING:
                return "Добрый вечер!";
            case NIGHT:
                return "Доброй ночи!";
            default:
                return "АЛОХА, я не знаю такого периода";
        }
    }
}
