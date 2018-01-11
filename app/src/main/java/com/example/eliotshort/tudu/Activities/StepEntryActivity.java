package com.example.eliotshort.tudu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.eliotshort.tudu.R;
import com.example.eliotshort.tudu.TuduObjects.CompleteInstructionList;
import com.example.eliotshort.tudu.TuduObjects.InstructionSet;

public class StepEntryActivity extends AppCompatActivity {

    EditText stepEntry;
    Button addStepButton;
    InstructionSet instructionSet;
    CompleteInstructionList instructionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_entry);

        stepEntry = findViewById(R.id.stepEntry);
        addStepButton = findViewById(R.id.createNewTuduButton);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        CompleteInstructionList instructionList = (CompleteInstructionList) bundle.getSerializable("value");
        InstructionSet instructionSet = (InstructionSet) getIntent().getSerializableExtra("serialize_data");

    }

    public void onClickAddStepButton(View view){
        String result = stepEntry.getText().toString();
        instructionSet.addInstructionToList(result);
        instructionList.addTudu(instructionSet);
        Intent intent = new Intent(this, MainMenuActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("value", instructionList);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
