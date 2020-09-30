package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    ArrayList<String> colorName; //{"Red", "Blue", "Black", "Green", "White", "Grey", "Brown", "Purple", "Yellow", "Cyan"};
    ArrayList<Integer> colorVal;

    Spinner colorSpinner;
    TextView background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorSpinner = findViewById(R.id.colorSpinner);
        background = findViewById(R.id.textView);

        //background.setBackgroundColor(Color.RED);

        colorName = new ArrayList<>();
        colorVal = new ArrayList<>();

        colorName.add("Red");
        colorName.add("Blue");
        colorName.add("Black");
        colorName.add("Green");
        colorName.add("White");
        colorName.add("Light Grey");
        colorName.add("Dark Grey");
        colorName.add("Magenta");
        colorName.add("Yellow");
        colorName.add("Cyan");

        colorVal.add(Color.RED);
        colorVal.add(Color.BLUE);
        colorVal.add(Color.BLACK);
        colorVal.add(Color.GREEN);
        colorVal.add(Color.WHITE);
        colorVal.add(Color.LTGRAY);
        colorVal.add(Color.DKGRAY);
        colorVal.add(Color.MAGENTA);
        colorVal.add(Color.YELLOW);
        colorVal.add(Color.CYAN);

        final BaseAdapter colorAdapter = new CustomAdapter(this, colorVal);
        colorSpinner.setAdapter(colorAdapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                 int BC = (int) colorSpinner.getItemAtPosition(i);
                 //Log.d("the color selected is: ", BC);
                 if(BC == Color.RED){
                     background.setBackgroundColor(colorVal.get(0));
                 }else
                 if(BC == Color.BLUE){
                     background.setBackgroundColor(colorVal.get(1));
                 }else
                 if(BC == Color.BLACK){
                     background.setBackgroundColor(colorVal.get(2));
                 }else
                 if(BC == Color.GREEN){
                     background.setBackgroundColor(colorVal.get(3));
                 }else
                 if(BC == Color.WHITE){
                     background.setBackgroundColor(colorVal.get(4));
                 }else
                 if(BC == Color.LTGRAY){
                     background.setBackgroundColor(colorVal.get(5));
                 }else
                 if(BC == Color.DKGRAY){
                     background.setBackgroundColor(colorVal.get(6));
                 }else
                 if(BC == Color.MAGENTA){
                     background.setBackgroundColor(colorVal.get(7));
                 }else
                 if(BC == Color.YELLOW){
                     background.setBackgroundColor(colorVal.get(8));
                 }else
                 if(BC == Color.CYAN){
                     background.setBackgroundColor(colorVal.get(9));
                 }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}