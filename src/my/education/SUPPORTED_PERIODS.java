package my.education;

public enum SUPPORTED_PERIODS {
    MORNING("05:00:00", "10:59:59"),
    DAY("11:00:00", "17:59:59"),
    EVENING("18:00:00", "23:59:59"),
    NIGHT("00:00:00", "04:59:59");

    private String start;
    private String end;

    public String getStart(){
        return this.start;
    }

    public  String getEnd(){
        return this.end;
    }

    SUPPORTED_PERIODS(String start, String end) {
        this.start = start;
        this.end = end;
    }
}
