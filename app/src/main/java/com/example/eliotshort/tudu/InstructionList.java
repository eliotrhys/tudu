package com.example.eliotshort.tudu;

import java.util.ArrayList;

/**
 * Created by eliotshort on 05/01/2018.
 */

public class InstructionList {

    ArrayList<InstructionSet> list;
    InstructionSet recipe;

    public InstructionList(){

        recipe = new InstructionSet("Recipe", new ArrayList());
        recipe.addInstructionToList("Step 1 \n Buy flour.");
        recipe.addInstructionToList("Step 2 \n Bake a fucking cake.");
        recipe.addInstructionToList("Step 3 \n Eat");
        list = new ArrayList<InstructionSet>();
        list.add(recipe);

    }

    public ArrayList<InstructionSet> getInstructionList() {

        return list;
    }
}
