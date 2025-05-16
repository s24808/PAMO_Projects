package com.example.bmicalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class ShoppingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        // 1. Dane: składniki do kurczaka z warzywami
        List<ShoppingItem> ingredients = Arrays.asList(
                new ShoppingItem("150g fileta z kurczaka"),
                new ShoppingItem("Brokuły"),
                new ShoppingItem("Marchewka"),
                new ShoppingItem("Cukinia"),
                new ShoppingItem("Przyprawy do smaku")
        );

        // 2. RecyclerView
        RecyclerView recycler = findViewById(R.id.shoppingRecycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new ShoppingListAdapter(ingredients));
    }
}