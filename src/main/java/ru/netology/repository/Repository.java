package ru.netology.repository;
import ru.netology.domain.PurchaseItem;
import java.util.ArrayList;

public class Repository {

    private PurchaseItem[] items = new PurchaseItem[0];

    public PurchaseItem[] findAll(){
        return items;
    }

    public void save(PurchaseItem item){
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] findById(int id) {
        PurchaseItem[] result = new PurchaseItem[0];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() == id) {
                int length = result.length + 1;
                PurchaseItem[] tmp = new PurchaseItem[length];
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = items[index];
                result = tmp;
            }
            index++;
        }
        return result;
    }

    public void removeById(int id){
        ArrayList list = new ArrayList();
        System.arraycopy(items, 0 , list, 0, items.length);
        list.remove(id);
        PurchaseItem[] temp = new PurchaseItem[list.size()];
        items = temp;
    }

    public void removeAll(){
        items = new PurchaseItem[0];
    }
}