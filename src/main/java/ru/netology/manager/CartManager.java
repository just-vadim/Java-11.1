package ru.netology.manager;

import ru.netology.domain.PurchaseItem;
import ru.netology.repository.Repository;

public class CartManager {
  private Repository repository;

  public CartManager(Repository repository) {
    this.repository = repository;
  }

  public void add(PurchaseItem item) {
    repository.save(item);
  }

  public PurchaseItem[] getAll() {
    PurchaseItem[] items = repository.findAll();
    PurchaseItem[] result = new PurchaseItem[items.length];
    for (int i = 0; i < result.length; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
    }
    return result;
  }

  public PurchaseItem[] findById(int id) {
    return repository.findById(id);
  }

  public void removeById(int id) {
    repository.removeById(id);
  }
}