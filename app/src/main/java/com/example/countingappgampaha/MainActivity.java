package com.example.countingappgampaha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtValue1;
    EditText txtValue2;
    TextView lblAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtValue1 = findViewById(R.id.txtValue1);
         txtValue2 = findViewById(R.id.txtValue2);
         lblAns = findViewById(R.id.lblAns);

    }
    int value1 = 0;
    int value2 = 0;
    int answer = 0;

    public void Addition(View v){


       String Value1 = txtValue1.getText().toString();
       String Value2 = txtValue2.getText().toString();

       Double v1 = Double.parseDouble(Value1);
       Double v2 = Double.parseDouble(Value2);

       Double answer = (v1 + v2);


       lblAns.setText("" + answer);
    }

    public void Substract (View v){



        String Value1 = txtValue1.getText().toString();
        String Value2 = txtValue2.getText().toString();

        Double v1 = Double.parseDouble(Value1);
        Double v2 = Double.parseDouble(Value2);

    Double answer = (v1 - v2);


       lblAns.setText("" + answer);
}

    public void Multiplication(View v){



        String Value1 = txtValue1.getText().toString();
        String Value2 = txtValue2.getText().toString();

        Double v1 = Double.parseDouble(Value1);
        Double v2 = Double.parseDouble(Value2);

        Double answer = (v1 * v2);


        lblAns.setText("" + answer);
    }

    public void Division(View v){



        String Value1 = txtValue1.getText().toString();
        String Value2 = txtValue2.getText().toString();

        Double v1 = Double.parseDouble(Value1);
        Double v2 = Double.parseDouble(Value2);

        Double answer = (v1 / v2);


        lblAns.setText("" + answer);
    }

    public void Clear(View v){

        answer = 0;


        lblAns.setText("" + answer);
        txtValue1.setText("");
        txtValue2.setText("");

    }
}
