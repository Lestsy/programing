public class Item {

    protected boolean isReady = false;
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
        if(this.getName() == "ружье"){
            System.out.println("Полицейские приложились к ружьям, готовясь выстрелить");
        }

    }

    public boolean equals(Item item) {
        if (this == item) return true;
        if (item == null || getClass() != item.getClass()) return false;
        return isReady == item.isReady && name.equals(item.name);
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
        return name;
    }
}
