package com.example.beebuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bee_buzz_winter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bee_buzz_winter);
    }

    public void changeSeason(View view) {
        Intent spring = new Intent(this, bee_buzz_spring.class);
        startActivity(spring);
    }
}
