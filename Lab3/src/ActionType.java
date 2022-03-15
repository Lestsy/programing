public enum ActionType {

    TURN_AROUND("обернулись"),
    DOWN("быстро спустились вниз"),
    STOP("остановились"),
    COME_BACK("бегом возвращался назад"),
    SAY("сказал, что"),
    SEE_THAT("увидел это"),
    SEE("увидели");

    private final String name;

    ActionType(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
