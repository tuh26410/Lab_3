package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    final String[] colors = {"Red", "Blue", "Black", "Green", "White", "Grey", "Brown", "Purple", "Yellow", "Cyan"};

    //CustomAdapter spinner = new CustomAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);



    }
}