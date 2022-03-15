public interface CanDoSomethingI {
    public void doSomething(Backpack backpack);
    public void doAction(ActionType... actionType);
    public void doAction(String message, ActionType... actionType);
    public void doAction(String message);
}
