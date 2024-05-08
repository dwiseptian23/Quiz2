package com.example.quiz2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup btnps;
    private Button psn;
    private RadioButton ps3, ps4, ps5, psvr, mkn1, mkn2, mkn3;
    private RadioGroup btnmkn;
    private EditText wktumain;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mkn1 = findViewById(R.id.mkn1);
        mkn2 = findViewById(R.id.mkn2);
        mkn3 = findViewById(R.id.mkn3);
        ps3 = findViewById(R.id.ps3);
        ps4 = findViewById(R.id.ps4);
        ps5 = findViewById(R.id.ps5);
        psvr = findViewById(R.id.psvr);
        btnps = findViewById(R.id.btnps);
        btnmkn = findViewById(R.id.btnmkn);
        wktumain = findViewById(R.id.wktumain);
        psn = findViewById(R.id.psn);
        int ps3 = 5000;
        int ps4 = 8000;
        int ps5 = 10000;
        int psvr = 20000;
        int mkn1 = 7000;
        int mkn2 = 10000;
        int mkn3 = 5000;
    }
    psn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Get the selected PlayStation version
            String psVersion = getSelectedRadioButtonText(btnps);

            // Get the selected meal choice
            String mealChoice = getSelectedRadioButtonText(btnmkn);

            // Get the entered play time
            String playTime = wktumain.getText().toString().trim();

            // Constructing the message based on selections
            String message = "You selected:\n" +
                    "PlayStation Version: " + psVersion + "\n" +
                    "Meal Choice: " + mealChoice + "\n" +
                    "Play Time: " + playTime;

            // Displaying a Toast message with the selections
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
        }
    });
}

    // Helper method to get the selected RadioButton text
    private String getSelectedRadioButtonText(RadioGroup radioGroup) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton radioButton = findViewById(selectedId);
            return radioButton.getText().toString();
        }
        return "";
    }
}
}
