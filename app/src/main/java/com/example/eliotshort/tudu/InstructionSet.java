package com.example.eliotshort.tudu;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eliotshort on 05/01/2018.
 */

@Entity(tableName = "instruction_sets")
public class InstructionSet implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "instruction_set_id")
    public int id;

    @ColumnInfo(name = "instruction_set_name")
    public String instructionSetName;

    @ColumnInfo(name = "instruction_set_list")
    public ArrayList<String> instructionList;


    public InstructionSet(int id, String instructionSetName, ArrayList instructionList){
        this.id = id;
        this.instructionSetName = instructionSetName;
        this.instructionList = instructionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructionSetName() {
        return instructionSetName;
    }

    public void setInstructionSetName(String instructionSetName) {
        this.instructionSetName = instructionSetName;
    }

    public ArrayList<String> getInstructionList() {
        return instructionList;
    }

    public void setInstructionList(ArrayList<String> instructionList) {
        this.instructionList = instructionList;
    }

    public void addInstructionToList(String instruction){
        this.instructionList.add(instruction);
    }

    public void removeInstructionFromList(){
        this.instructionList.remove(0);
    }

}
