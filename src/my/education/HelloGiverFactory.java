package my.education;

public class HelloGiverFactory {
    public static IHelloGiver createHelloGiverInstace (SUPPORTED_LANGUAGES lang) {

        switch (lang) {
            case ENG: return new HelloGiverENG();
            case RU: return new HelloGiverRUS();
            default: return new HelloGiverRUS();
        }
    }


}
