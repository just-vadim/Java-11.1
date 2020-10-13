package ru.netology.repository;
import ru.netology.domain.PurchaseItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void removeById(int id) {
        List<PurchaseItem> list = new ArrayList<>(Arrays.asList(items));
        PurchaseItem[] removingItem = findById(id);
        if (list.contains(removingItem[0])) {
            list.remove(removingItem[0]);
            PurchaseItem[] result = new PurchaseItem[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            items = result;
        }
    }

    public void removeAll(){
        items = new PurchaseItem[0];
    }
}