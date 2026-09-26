package com.findit.service;

import com.findit.entity.Item;
import com.findit.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }
    public Item getItemById(Long id) {
    return itemRepository.findById(id).orElse(null);
} 

public Item updateItem(Long id, Item updatedItem) {

    Item item = itemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item not found"));

    item.setName(updatedItem.getName());
    item.setDescription(updatedItem.getDescription());
    item.setLocation(updatedItem.getLocation());
    item.setFound(updatedItem.isFound());

    return itemRepository.save(item);
 }
 public void deleteItem(Long id) {
    itemRepository.deleteById(id);
}

}