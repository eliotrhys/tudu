package com.example.eliotshort.tudu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.eliotshort.tudu.TuduObjects.CompleteInstructionList;
import com.example.eliotshort.tudu.TuduObjects.InstructionListAdapter;
import com.example.eliotshort.tudu.TuduObjects.InstructionSet;
import com.example.eliotshort.tudu.R;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {

    CompleteInstructionList instructionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        CompleteInstructionList instructionList = new CompleteInstructionList();
        ArrayList<InstructionSet> list = instructionList.getInstructionList();

        ArrayList<String> recipe = new ArrayList<>();
        recipe.add("Go get flour.");
        recipe.add("Put in oven.");
        recipe.add("Wait some time.");
        recipe.add("Eat it.");

        ArrayList<String> morning = new ArrayList<>();
        morning.add("Wake up.");

        morning.add("Brush teeth.");
        morning.add("Get showered");
        morning.add("Leave house.");

        InstructionSet recipeSet = new InstructionSet("Recipe", recipe);
        InstructionSet morningSet = new InstructionSet("Morning Routine", morning);

        list.add(recipeSet);
        list.add(morningSet);

        InstructionListAdapter instructionListAdapter = new InstructionListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.mainMenuList);
        listView.setAdapter(instructionListAdapter);

    }

//    public void getInstructionSet(View listItem){
//        InstructionSet instructionSet = (InstructionSet) listItem.getTag();
//        Intent intent = new Intent(this, instructionSet.getClass());
//        Intent.putExtra("instructionSet", instructionSet);
//        startActivity(intent);
//    }

    public void onCreateListButtonClick(View view){
        Intent intent = new Intent(this, NameTheListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("value", instructionList);
        intent.putExtras(bundle);
        startActivity(intent);
    }





}
