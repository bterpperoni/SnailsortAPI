package com.snail.sort.SnailsortAPI.model;

// This class define template of valid array
public class SnailArrays {

    // Tab's id
    private String id;

    // Tab's content
    private int[] tabTort;
    private int[][] tortTab;

    // Constructor of SnailArrays Object
    public SnailArrays(String id, int[] tabTort, int[][] tortTab) {
        this.id = id;
        this.tabTort = tabTort;
        this.tortTab = tortTab;
    }
    // Default Constructor
    public SnailArrays() {

        this.tortTab = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        this.tabTort = new int[]{1,2,3,4,5,6,7,8,9};
        this.id = "2" ;
    }

    // Getter & Setter for tab's id ------------------------------------
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    // --------------------------------------------------------------------

    // Getter & Setter for tab's content-----------------------------------
    public int[] getTabTort() { return this.tabTort; }

    public void setTabTort(int[] tabTort) {
        this.tabTort = tabTort;
    }
    // --------------------------------------------------------------------

    // Getter & Setter for 2d tab------------------------------------------
    public int[][] getTortTab() {  return tortTab; }
    public void setTortTab(int[][] tortTab) {   this.tortTab = tortTab; }
}

    
