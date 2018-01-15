package com.example.eliotshort.tudu.TuduObjects;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eliotshort on 05/01/2018.
 */

public class CompleteInstructionList {

    ArrayList<InstructionSet> list;

    public CompleteInstructionList(){
        this.list = new ArrayList<InstructionSet>();
    }

    public ArrayList<InstructionSet> getInstructionList() {
        return list;
    }

    public void addTudu(InstructionSet instructionSet){
        list.add(instructionSet);
    }

    public int checkListLength(){
        return list.size();
    }

}
