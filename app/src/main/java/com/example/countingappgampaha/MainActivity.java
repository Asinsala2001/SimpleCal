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


    public void Calculate(View v){

          String tag = v.getTag().toString();
          lblAns.setText(tag);

       String Value1 = txtValue1.getText().toString();
       String Value2 = txtValue2.getText().toString();

       Double v1 = Double.parseDouble(Value1);
       Double v2 = Double.parseDouble(Value2);

       double answer = 0;
//       if (tag.equals("Sum")) {
//           answer = (v1 + v2);
//       }
//
//        if (tag.equals("sub")) {
//            answer = (v1 - v2);
//        }
//
//        if (tag.equals("Mul")) {
//            answer = (v1 * v2);
//        }
//
//        if (tag.equals("Div")) {
//            answer = (v1 / v2);
//        }

        switch (tag){
            case "Sum": answer = v1+v2; break;
            case "sub": answer = v1-v2; break;
            case "Mul": answer = v1*v2; break;
            case "Div": answer = v1/v2; break;

        }
       lblAns.setText("" + answer);


    }



}
