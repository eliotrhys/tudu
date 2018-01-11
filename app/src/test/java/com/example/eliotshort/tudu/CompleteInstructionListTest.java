package com.example.eliotshort.tudu;

import com.example.eliotshort.tudu.TuduObjects.CompleteInstructionList;
import com.example.eliotshort.tudu.TuduObjects.InstructionSet;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by eliotshort on 07/01/2018.
 */

public class CompleteInstructionListTest {

    CompleteInstructionList testInstructionList;
    InstructionSet recipe;
    InstructionSet diy;

    @Before
    public void before(){
        testInstructionList = new CompleteInstructionList();
        recipe = new InstructionSet("Recipe", new ArrayList());
        recipe.addInstructionToList("Step 1 \n Buy flour.");
        recipe.addInstructionToList("Step 2 \n Bake a fucking cake.");
        recipe.addInstructionToList("Step 3 \n Eat");
        diy = new InstructionSet("DIY", new ArrayList());
        diy.addInstructionToList("Step 1 \n Buy some hammers.");
        diy.addInstructionToList("Step 2 \n Hit stuff.");
        diy.addInstructionToList("Step 3 \n Congrats on your shelves.");
    }

    @Test
    public void testListLength(){
        testInstructionList.addTudu(recipe);
        testInstructionList.addTudu(diy);
        assertEquals(testInstructionList.checkListLength(), 2);
    }

}
