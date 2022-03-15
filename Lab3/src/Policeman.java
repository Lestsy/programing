public class Policeman extends People{

    private int counter;
    private String name = "Полицейские";
    private Backpack backpack = new Backpack();

    public Policeman(int counter) {
        this.counter = counter;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void appear(){
        System.out.println("В тот же миг из-за холма выскочили " + counter + " полицейских");
    }

    @Override
    public int hashCode() {
        return counter;
    }

    @Override
    public String toString() {
        return String.valueOf(counter);
    }
}
