package com.example.mesy.rickmorty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that holds the start button
        Button startQuizButton = findViewById(R.id.begin);

        // Set a click listener on that View
        startQuizButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the start Button View is clicked on.
            @Override
            public void onClick(View view) {
                // create a new intent to open the {@link QuizActivity}
                Intent quizIntent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(quizIntent);

                Toast.makeText(view.getContext(),"School is not a place for smart people", Toast.LENGTH_LONG).show();
            }
        });
    }
}
