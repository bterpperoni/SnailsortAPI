package com.snail.sort.SnailsortAPI.model;

// This class define template of valid array 
public class SnailArrays {
    
    // Tab's id 
    private int tabId;
    // Tab's content
    private int[] tabTort;

    // Constructor of Arrays object
    public SnailArrays(int tabId, int[] tabTort) {
        this.tabId = tabId;
        this.tabTort = tabTort;
    }

    // Getter & Setter for tab's id ------------------------------------
    public int getTabId() {
        return this.tabId;
    }

    public void setTabId(int tabId) {
        this.tabId = tabId;
    }
    // --------------------------------------------------------------------

    // Getter & Setter for tab's content-----------------------------------
    public int[] getTabTort() {
        return this.tabTort;
    }

    public void setTabTort(int[] tabTort) {
        this.tabTort = tabTort;
    }
    // --------------------------------------------------------------------
}

    
