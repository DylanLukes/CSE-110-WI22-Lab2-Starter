package edu.ucsd.cse110.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// Note: Utils is available automatically. This is a quirk of how Java
// works with static classes in the same package!

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // There is a bug in this function! One of your exercises is to find it!

        // Hello world this is a new commen!

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button equalsBtn = this.findViewById(R.id.equals_button);
        equalsBtn.setOnClickListener(view -> {
            EditText num1View = this.findViewById(R.id.number1);
            EditText num2View = this.findViewById(R.id.number2);

            String num1Text = num1View.getText().toString();
            String num2Text = num2View.getText().toString();

            int num1 = Utils.toIntNullsafe(num1Text);
            int num2 = Utils.toIntNullsafe(num2Text);

            int answer = num1 * num2;

            TextView resultView = this.findViewById(R.id.result);
            resultView.setText(String.valueOf(answer));
        });
    }

    public boolean hasResult() {
        TextView view = this.findViewById(R.id.result);
        return !Utils.isEmpty(view.getText().toString());
    }
}