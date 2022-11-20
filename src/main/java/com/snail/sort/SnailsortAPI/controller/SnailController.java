package com.snail.sort.SnailsortAPI.controller;

import com.snail.sort.SnailsortAPI.model.SnailArrays;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.snail.sort.SnailsortAPI.service.SnailService.*;

@RestController
@RequestMapping("/api/v0.4.0")
public class SnailController {

    // Constructor
    public SnailController(List<SnailArrays> list, List<int[][]> listTab) {
        this.list = list;
        this.listTab = listTab;
    }

    // List of SnailArrays Object
    final List<SnailArrays> list;
    final List<int[][]> listTab;
    private SnailArrays snailArrays;

    //---------------------------------------------------------------------------------------------------------------
    // Methods to juste POST a tab </>
    @PostMapping("/post-to-sort")
    public void pointToSort(@RequestBody int[][] testPost){
        testPost = new int[][]{{}};
        listTab.add(testPost);
    }

    // Method to just Sort and GET final tab </>
    @RequestMapping(method = RequestMethod.GET)
    public List<int[]> getSort(){
        for(SnailArrays s:list){
            s.getTortTab();
            int[]tempTab = Sort(s);
            s.setTabTort(tempTab);
            final List<int[]> liss= new ArrayList<int[]>();
            liss.add(tempTab);
            return liss;
        }
        return null;
    }
//-----------------------------------------------------------------------
    // Get body sample
    @GetMapping("/get-sample")
    public SnailArrays example(){
        SnailArrays ex = getSnailArray();
        list.add(ex);
        listTab.add(ex.getTortTab());
        return ex;
    }

//----------------------------------------------------------------------------

    // Method to post values with passing JSON parameters to body </>
    // Data structure -> ex. { "id" : "1", "tabTort" : "[1,2,3,4,5,6,7,8,9]", "tortTab" : "[[1,2,3],[4,5,6],[7,8,9]]" }
    @PostMapping("/createObject")
    public String postValues(@RequestBody SnailArrays snailArrays){
        this.snailArrays = snailArrays;

        if(list.add(snailArrays)){

            return "Request sucess : Array sent to API ";
        }
        return list.toString();
    }

    // Endpoint to sort array and make 2d array by providing an id </>
    @GetMapping("/array/{id}")
    public List<SnailArrays> getArrayById(@PathVariable("id") String id){
        // Searching on list
        for(SnailArrays snailArrays: list){
            // If search provide a valid object, then we sort " object " ( by definition of the method)
            if(snailArrays.getId() == id){
                int[] array = Sort(snailArrays);
                // And we complete object by the setter
                snailArrays.setTabTort(array);
                list.add(snailArrays);
            }
        }
        return list;
    }
//-------------------------------------------------------------------------------------------------------------------
    // Method to provide all arrays in the list
    @GetMapping("/arrays")
    public List<SnailArrays> theList(){
        // Provide a template of body request
        // First endpoint to GET all arrays
        return list;
    }
}
