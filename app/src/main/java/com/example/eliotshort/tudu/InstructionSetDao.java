package com.example.eliotshort.tudu;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import java.util.List;

/**
 * Created by eliotshort on 08/01/2018.
 */

@Dao
public interface InstructionSetDao {

    @Insert
    void insertAll(InstructionSet... instructionSets);


}
