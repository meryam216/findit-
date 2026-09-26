package com.findit.controller;

import com.findit.entity.Item;
import com.findit.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAll() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
public Item getById(@PathVariable Long id) {
    return itemService.getItemById(id);
}

    @PostMapping
    public Item create(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    @GetMapping("/test")
public String test() {
    return "CONTROLLER OK";
 }

 @PutMapping("/{id}")
public Item update(@PathVariable Long id,
                   @RequestBody Item item) {
    return itemService.updateItem(id, item);
 } 
 @DeleteMapping("/{id}")
public void delete(@PathVariable Long id) {
    itemService.deleteItem(id);
}

}
