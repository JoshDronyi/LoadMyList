package com.example.loadmylist.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.loadmylist.R;
import com.example.loadmylist.Utils;
import com.example.loadmylist.adapters.AnimalAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimals = findViewById(R.id.rv_animals);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvAnimals.setLayoutManager(manager);
        rvAnimals.setHasFixedSize(true);

        DividerItemDecoration separator = new DividerItemDecoration(this,manager.getOrientation());
        rvAnimals.addItemDecoration(separator);

        AnimalAdapter adapter = new AnimalAdapter(Utils.getAnimalsList());
        rvAnimals.setAdapter(adapter);




    }

    // TODO: Step 1 -> Create "AnimalAdapter" in adapter folder, it will take a list of Animals [List<Animal>]
    // TODO: Step 2 -> Setup RecyclerView in MainActivity
    // TODO: Step 3 -> In Utils Class add information to each Animal in the method getAnimalsList()
    // TODO: Step 4 -> Load list into RecyclerView and Run Application
}
