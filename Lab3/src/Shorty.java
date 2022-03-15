public class Shorty extends People{

    private String name;
    private Backpack backpack;
    private Names nameType;

    public Shorty(Names name) {
        this.name = name.toString();
        this.backpack = new Backpack();
        this.nameType = name;
    }

    @Override
    public String getName() {
        return this.nameType.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        if(name == null)
            return 0;
        int code = 0;
        for(int i = 0; i < name.length(); ++i)
        {
            code += name.charAt(i);
            code %= 10000;
        }
        return code;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
