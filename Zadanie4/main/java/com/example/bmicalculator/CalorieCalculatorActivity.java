package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class CalorieCalculatorActivity extends AppCompatActivity {

    EditText ageInput, weightInput, heightInput;
    RadioGroup genderGroup;
    Spinner activitySpinner;
    Button calculateCaloriesButton;
    TextView calorieResultText;
    Button openRecipesButton;
    Button openShoppingListButton;

    String[] activityLevels = {
            "Brak aktywności (1.2)",
            "Lekka aktywność (1.375)",
            "Umiarkowana aktywność (1.55)",
            "Duża aktywność (1.725)",
            "Bardzo duża aktywność (1.9)"
    };

    double[] activityMultipliers = {1.2, 1.375, 1.55, 1.725, 1.9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calculator);

        // Powiązanie z UI
        ageInput = findViewById(R.id.ageInput);
        weightInput = findViewById(R.id.weightInput);
        heightInput = findViewById(R.id.heightInput);
        genderGroup = findViewById(R.id.genderGroup);
        activitySpinner = findViewById(R.id.activitySpinner);
        calculateCaloriesButton = findViewById(R.id.calculateCaloriesButton);
        calorieResultText = findViewById(R.id.calorieResultText);
        openShoppingListButton = findViewById(R.id.openShoppingListButton);

        // Spinner z poziomami aktywności
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, activityLevels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activitySpinner.setAdapter(adapter);


        // Oczekiwanie na otwarcie listy zakupów
        openShoppingListButton.setOnClickListener(v -> {
            startActivity(new Intent(CalorieCalculatorActivity.this,
                    ShoppingListActivity.class));
        });

        // Logika po kliknięciu przycisku
        calculateCaloriesButton.setOnClickListener(view -> {
            String ageStr = ageInput.getText().toString();
            String weightStr = weightInput.getText().toString();
            String heightStr = heightInput.getText().toString();

            if (ageStr.isEmpty() || weightStr.isEmpty() || heightStr.isEmpty()) {
                calorieResultText.setText("Uzupełnij wszystkie dane.");
                return;
            }

            int age = Integer.parseInt(ageStr);
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr);

            boolean isMale = (genderGroup.getCheckedRadioButtonId() == R.id.maleRadio);

            double bmr;
            if (isMale) {
                bmr = 66.5 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
            } else {
                bmr = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
            }

            int activityIndex = activitySpinner.getSelectedItemPosition();
            double multiplier = activityMultipliers[activityIndex];

            double calories = bmr * multiplier;

            String result = String.format("Twoje dzienne zapotrzebowanie kaloryczne:\n%.0f kcal", calories);
            calorieResultText.setText(result);

            new Handler().postDelayed(() -> {
                Intent intent = new Intent(CalorieCalculatorActivity.this, RecipiesActivity.class);
                intent.putExtra("calories", calories);
                startActivity(intent);
            }, 3000);
        });
    }
}