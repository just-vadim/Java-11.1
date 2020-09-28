package ru.netology.manager;

import ru.netology.domain.PurchaseItem;

public class CartManager {
  private int returnCount = 10;
  private PurchaseItem[] items = new PurchaseItem[0];

  public void add(PurchaseItem item) {
    int length = items.length + 1;
    PurchaseItem[] tmp = new PurchaseItem[length];
    System.arraycopy(items, 0, tmp, 0, items.length);
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

  public PurchaseItem[] getLast() {
    PurchaseItem[] result = new PurchaseItem[items.length];
    if (items.length > returnCount) {
      PurchaseItem[] result1 = new PurchaseItem[returnCount];
      for (int i = 0; i < returnCount; i++) {
        int index = items.length - i - 1;
        result1[i] = items[index];
      }
      return result1;
    }
    else {
      for (int i = 0; i < result.length; i++) {
        int index = items.length - i - 1;
        result[i] = items[index];
      }
    }
    return result;
  }

  public CartManager() {
  }

  public CartManager(int returnCount) {
    this.returnCount = returnCount;
  }
}