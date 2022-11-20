package com.snail.sort.SnailsortAPI.model;

// This class define template of valid array 
public class SnailArrays {
    
    // Tab's id 
    private int tabId;
    // Tab's content
    private int[] tabTort;
    private int[][] tortTab;

    // Constructor of SnailArrays Object
    public SnailArrays(int tabId, int[] tabTort) {
        this.tabId = tabId;
        this.tabTort = tabTort;
    }
    // Default Constructor
    public SnailArrays() {
        this.tortTab = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        this.tabTort = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        this.tabId = 0;
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
    public int[] getTabTort() { return this.tabTort; }

    public void setTabTort(int[] tabTort) {
        this.tabTort = tabTort;
    }
    // --------------------------------------------------------------------

    // Getter & Setter for 2d tab------------------------------------------
    public int[][] getTortTab() {   return tortTab; }
    public void setTortTab(int[][] tortTab) {   this.tortTab = tortTab; }
    // --------------------------------------------------------------------
}

    
