public enum Names {
    PILULKIN("Пилюлькин"),
    ZNAYKA("Знайка"),
    KOLOSOK("Колосок"),
    KOROTYSKY("Коротышки");

    private final String name;

    Names(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
