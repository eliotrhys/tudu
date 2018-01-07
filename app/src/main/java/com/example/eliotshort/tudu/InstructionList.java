package com.example.eliotshort.tudu;

import java.util.ArrayList;

/**
 * Created by eliotshort on 05/01/2018.
 */

public class InstructionList {

    ArrayList<InstructionSet> instructionList;

    public InstructionList(ArrayList instructionList){
        this.instructionList = instructionList;
    }

    public ArrayList<InstructionSet> getInstructionList() {
        return instructionList;
    }

    public void setInstructionList(ArrayList<InstructionSet> instructionList) {
        this.instructionList = instructionList;
    }
}
