public class WeightlessDevice extends Item {

    public WeightlessDevice(String name) {
        super(name);
    }

    public void getActive(boolean isActive, People people){
        people.makeFly(isActive);
    }

}
