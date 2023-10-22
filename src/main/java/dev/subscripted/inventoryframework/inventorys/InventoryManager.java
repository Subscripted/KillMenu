/*
package dev.subscripted.inventoryframework.models;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryManager {
    private Inventory inventory;
    private Map<Integer, ItemStack> items;
    private int currentPage;
    private List<Inventory> pages;

    public InventoryManager(int size, String title) {
        this.inventory = Bukkit.createInventory(null, size, title);
        this.items = new HashMap<>();
        this.currentPage = 0;
        this.pages = Collections.singletonList(Bukkit.createInventory(null, size, title));
    }

    public InventoryManager setItem(int slot, ItemStack item) {
        items.put(slot, item);
        return this;
    }

    public InventoryManager setPages(List<List<ItemStack>> itemsPerPage) {
        for (List<ItemStack> items : itemsPerPage) {
            Inventory page = pages.get(pages.size() - 1);
            for (ItemStack item : items) {
                if (page.firstEmpty() == -1) {
                    page = Bukkit.createInventory(null, page.getSize(), page.getType().getDefaultTitle());
                    pages.add(page);
                }
                page.addItem(item);
            }
        }
        return this;
    }

    public Inventory getCurrentPage() {
        return pages.get(currentPage);
    }

    public void nextPage() {
        if (currentPage < pages.size() - 1) {
            currentPage++;
        }
    }

    public void previousPage() {
        if (currentPage > 0) {
            currentPage--;
        }
    }

    public Inventory build() {
        for (Map.Entry<Integer, ItemStack> entry : items.entrySet()) {
            inventory.setItem(entry.getKey(), entry.getValue());
        }
        return inventory;
    }
}

 */
