public abstract class People implements HasBackpackI, CanDoSomethingI {

    private boolean inFlight;
    private Backpack backpack = new Backpack();
    private String name;

    public void makeFly(boolean inFlight){this.inFlight = inFlight;}
    public boolean isFly(){return inFlight;}

    public abstract int hashCode();
    public abstract String toString();

    public void doSomething(Backpack backpack){
        Item item = backpack.getItem();
        if(!item.isReady())
            item.setReady(true);
        if(item.toString() == "ружье"){
            System.out.println("Раздался залп");
            if(this.isFly()){
                System.out.println("Не подозревая, что могут оказаться в состоянии невесомости, полицейские выстрелили, и реактивная сила понесла их назад");
                System.out.println("В результате они помчались по воздуху с такой страшной скоростью, что в одну секунду превратились в едва заметные точки и скрылись за горизонтом");
            }
        }
        if(item.toString() == "прибор невесомости"){
            this.doAction("ни секунды не медля, включил прибор невесомости");
        }
    }

    public void doAction(ActionType... actionType){
        this.doAction("", actionType);
    }

    public void doAction(String message, ActionType... actionType){
        System.out.print(this.getName() + " " + actionType[0].toString() + " ");
        for(int i = 1; i < actionType.length; i++)
            System.out.print("и " + actionType[i].toString() + " ");
        System.out.println(message);
    }

    public void doAction(String message){
        System.out.println(this.getName() + " " + message);
    }

    public Backpack getBackpack(){return backpack;}

    public String getName() {
        return name;
    }

    public void getReady(Backpack backpack){
        Item item = backpack.getItem();
        item.setReady(true);
        backpack.addItem(item);
    }

    public boolean equals(People object) {
        return object.hashCode() == this.hashCode() && object.toString().equals(this.toString());
    }
}
