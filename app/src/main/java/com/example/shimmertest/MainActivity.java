package com.example.shimmertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class MainActivity extends AppCompatActivity {
    private Shimmer shimmer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shimmer1 = new Shimmer();
        ShimmerTextView shimmer_tv = findViewById(R.id.shimmer_tv);
        shimmer1.start(shimmer_tv);
    }
}