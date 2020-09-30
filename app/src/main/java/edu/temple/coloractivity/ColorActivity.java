package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    ArrayList<String> colors; //{"Red", "Blue", "Black", "Green", "White", "Grey", "Brown", "Purple", "Yellow", "Cyan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        colors.add("White");
        colors.add("Grey");
        colors.add("Brown");
        colors.add("Magenta");
        colors.add("Yellow");
        colors.add("Cyan");

        final BaseAdapter colorAdapter = new CustomAdapter(this, colors);
    }
}