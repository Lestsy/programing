public class Backpack extends Item {

    private Item[] items = new Item[5];
    private int capacity = 5;
    private int occypancy = 0;

    public Backpack() {
        super("");
    }

    public Item getItem(){
        if(occypancy != 0){
            Item item = items[occypancy - 1];
            items[occypancy - 1] = null;
            occypancy--;
            return item;
        }
        else
            return null;
    }

    public Item[] getItems(int count){
        Item[] items = new Item[Math.min(count, occypancy)];
        for(int i = 0; i < Math.min(count, occypancy); i++){
            items[i] = this.getItem();
        }
        return items;
    }

    public void addItem(Item item){
        if(occypancy < capacity && occypancy >= 0){
            this.items[occypancy] = item;
            occypancy++;
        }else
            System.err.println("Больше нет места в рюкзаке!");
    }

    public void addItem(Item item, int count){
        for(int i = 0; i < Math.min(count, capacity - occypancy + 1); i++){
            this.addItem(item);
        }
    }
}
