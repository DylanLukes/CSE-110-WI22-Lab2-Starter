package edu.ucsd.cse110.calculator;

import static edu.ucsd.cse110.calculator.Utils.toIntNullsafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button equalsBtn = findViewById(R.id.equals_button);
        equalsBtn.setOnClickListener(view -> {
            EditText num1View = findViewById(R.id.number1);
            EditText num2View = findViewById(R.id.number2);

            String num1Text = num1View.getText().toString();
            String num2Text = num2View.getText().toString();

            int num1 = toIntNullsafe(num1Text);
            int num2 = toIntNullsafe(num2Text);

            int answer = num1 * num2;

            TextView resultView = findViewById(R.id.result);
            resultView.setText(String.valueOf(answer));
        });
    }
}