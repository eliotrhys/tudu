package com.example.eliotshort.tudu;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eliotshort on 05/01/2018.
 */

public class InstructionSet implements Serializable {

    String instructionSetName;
    ArrayList<String> instructionList;

    public InstructionSet(String instructionSetName, ArrayList instructionList){
        this.instructionSetName = instructionSetName;
        this.instructionList = instructionList;
    }

    public String getInstructionSetName() {
        return instructionSetName;
    }

    public ArrayList<String> getInstructionList() {
        return instructionList;
    }

    public void setInstructionSetName(String instructionSetName) {
        this.instructionSetName = instructionSetName;
    }

    public void addInstructionToList(String instruction){
        this.instructionList.add(instruction);
    }

    public void removeInstructionFromList(){
        this.instructionList.remove(0);
    }

}
