package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);
    }
    public void ShowDescription(View view) {
        int position = spinner.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        textView.setText(description);
    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.description_of_quotes);
        return descriptions[position];
    }
}