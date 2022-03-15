public class Main {

    public static void main(String[] args){

        /* Z */

        Shorty pilulkin = new Shorty(Names.PILULKIN);
        Shorty znayka = new Shorty(Names.ZNAYKA);
        Shorty shorties = new Shorty(Names.KOROTYSKY);
        Shorty kolosok = new Shorty(Names.KOLOSOK);
        Policeman policeman = new Policeman(5);
        policeman.getBackpack().addItem(new Item("ружье"));
        WeightlessDevice weightlessDevice = new WeightlessDevice("прибор невесомости");
        znayka.getBackpack().addItem(weightlessDevice);
        pilulkin.doAction("неожиданно в стороне послышались выстрелы", ActionType.SAY);
        shorties.doAction("Колоска", ActionType.TURN_AROUND, ActionType.SEE);
        kolosok.doAction(ActionType.COME_BACK);
        policeman.appear();
        policeman.doAction(ActionType.DOWN, ActionType.STOP);
        policeman.getReady(policeman.getBackpack());
        znayka.doAction(ActionType.SEE_THAT);
        znayka.doSomething(znayka.getBackpack());
        weightlessDevice.getActive(true, policeman);
        policeman.doSomething(policeman.getBackpack());
    }

}
