package ru.netology.repository;

import ru.netology.domain.PurchaseItem;

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

    public PurchaseItem[] findById(int id){
        PurchaseItem[] result = new PurchaseItem[1];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() == id) {
                result[index] = item;
                index++;
            }
        }
        return result;
    }

    public void removeById(int id){
        int length = items.length - 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public void removeAll(){
        items = new PurchaseItem[0];
    }
}