package com.example.cuamatzi.promedio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.ET1);
        et2 = (EditText)findViewById(R.id.ET2);
        et3 = (EditText)findViewById(R.id.ET3);
        tv1 = (TextView)findViewById(R.id.TextStatus);

    }

    public  void estatus (View view){
        String S1 = et1.getText().toString();
        String S2 = et2.getText().toString();
        String S3 = et3.getText().toString();

        int V1 = Integer.parseInt(S1);
        int V2 = Integer.parseInt(S2);
        int V3 = Integer.parseInt(S3);

        int promedio = ( V1 + V2 + V3  )/3;

        if (promedio >= 6){
            tv1.setText("Estas aprovado con "+ promedio);

        }else {
            tv1.setText("Estas Reprobado con "+ promedio);

        }
    }
}
