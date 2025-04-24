package com.example.bmicalculator;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class RecipiesActivity extends AppCompatActivity {

    TextView recipeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipies);

        recipeText = findViewById(R.id.recipe1);

        double calories = getIntent().getDoubleExtra("calories", 0);

        if (calories <= 1800) {
            recipeText.setText("Dieta niskokaloryczna (poniżej 1800 kcal)\n\nZupa krem z brokółów\n\nSkładniki:\n- 200g filet z indyka\n- 50g ryż brązowy\n- 1x surówka z marchii z chrzanem i nasionami słonecznika\n\nSposób przygotowania:\nFilet z indyka ugotój na parze, przygotuj ryż i surówkę.");
        } else if (calories <= 2400) {
            recipeText.setText("Dieta zbilansowana (1801–2400 kcal)\n\nIndyk pieczony z ziemniakami i brokułami\n\nSkładniki:\n- 300g filet z indyka\n- 200g ziemniaków\n- 100g brokółów\n\nSposób przygotowania:\nFilet z indyka ugotój na parze, ugotuj brokuły i przygotuj ziemniaki.");
        } else {
            recipeText.setText("Dieta wysokobiałkowa (powyżej 2400 kcal)\n\nKurczak z warzywami na parze\n\nSkładniki:\n- 400g fileta z kurczaka\n- 100g brokułów\n- 100g marchewki\n\nSposób przygotowania:\nUgotuj brokuły i marchewkę. Usmaż lub ugotuj kurczaka.");
        }
    }
}