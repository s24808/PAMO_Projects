// Autorzy: Filip Labuda
// Instrukcja użycia: Aplikację należy uruchomić przy użyciu AndroidStudio
// Biblioteki wystarczą domyślne
// Opis: Stworzenie aplikacji pozwalającej na obliczenia wartości BMI przy użyciu prostego
// kalkulatora i sprawdzenie odpowiedniego statusu
// Zrzuty ekraniu są załączone w repozytorium.

package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weightInput, heightInput;
    Button calculateButton;
    TextView resultText;
    Button openRecipesButton;
    Button openCalorieCalculatorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightInput = findViewById(R.id.weightInput);
        heightInput = findViewById(R.id.heightInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);
        openCalorieCalculatorButton = findViewById(R.id.openCalorieCalculatorButton);
        openRecipesButton = findViewById(R.id.openRecipesButton);

        calculateButton.setOnClickListener(v -> {
            String weightStr = weightInput.getText().toString();
            String heightStr = heightInput.getText().toString();

            if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                double weight = Double.parseDouble(weightStr);
                double heightCm = Double.parseDouble(heightStr);
                double heightM = heightCm / 100.0;

                double bmi = weight / (heightM * heightM);
                String category;

                if (bmi < 18.5) {
                    category = "Niedowaga";
                } else if (bmi < 25) {
                    category = "Optimum";
                } else if (bmi < 30) {
                    category = "Nadwaga";
                } else {
                    category = "Otyłość";
                }

                String result = String.format("Twój wynik BMI: %.2f\n\nStatus: %s", bmi, category);
                resultText.setText(result);
            } else {
                resultText.setText("Proszę podać wagę i wzrost");
            }
        });

        openCalorieCalculatorButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalorieCalculatorActivity.class);
            startActivity(intent);
        });

        openRecipesButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AllRecipiesActivity.class);
            startActivity(intent);
        });
    }
}
