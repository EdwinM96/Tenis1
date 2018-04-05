package com.example.edwin.tenis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button butJug1;
    Button butJug2;
    Button reset;
    TextView textView1_1;
    TextView textView1_2;
    TextView textView2_1;
    TextView textView2_2;
    int puntajeInt;
    String puntajeString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butJug1 = findViewById(R.id.button);
        textView1_1 = findViewById(R.id.TextViewTeam1);
        textView1_2 = findViewById(R.id.TextVie2Team1);

        butJug2 = findViewById(R.id.button2);
        textView2_1 = findViewById(R.id.TextViewTeam2);
        textView2_2 = findViewById(R.id.TextView2Team2);

        puntajeInt=0;
        puntajeString="";

        butJug1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            puntajeString = textView1_2.getText().toString();
            if(puntajeString == "---"){
                textView1_2.setText("even");
                textView2_2.setText("even");
            }
            else if(puntajeString == "up"){
                textView1_1.setText(Integer.parseInt(textView1_1.getText().toString())+1);
                if(Integer.parseInt(textView1_1.getText().toString()) == 6){
                    textView1_1.setText("You Win");
                    textView1_2.setText("Click Reset");
                }
                else if(textView2_2.getText().toString() == "45"){
                    textView1_2.setText("up");
                    textView2_2.setText("---");
                }
                else{
                    textView1_2.setText(0);
                    textView2_2.setText(0);
                }
            }
            else if(puntajeString == "45"){
                if(textView2_2.getText().toString() == "45"){
                    textView2_2.setText("---");
                    textView1_2.setText("up");
                }
                else {
                    textView1_1.setText(Integer.parseInt(textView1_1.getText().toString())+1);
                    if(Integer.parseInt(textView1_1.getText().toString() )==6){
                        textView1_1.setText("You Win");
                        textView1_2.setText("Click Reset");
                    }
                    else {
                        textView1_2.setText(0);
                        textView2_2.setText(0);
                    }
                }
            }
            else if(puntajeString == "even"){
                textView1_2.setText("up");
                textView2_2.setText("---");
            }
            else{
                puntajeInt = Integer.parseInt(puntajeString);
                puntajeInt +=15;
                textView1_2.setText(puntajeInt);
            }
            }
        });

        butJug2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                puntajeString= textView2_2.getText().toString();

                if(puntajeString == "---"){
                    textView2_2.setText("even");
                    textView1_2.setText("even");
                }
                else if(puntajeString == "up"){
                    textView2_1.setText(Integer.parseInt(textView2_1.getText().toString())+1);
                    if(Integer.parseInt(textView1_1.getText().toString()) == 6){
                        textView2_1.setText("You Win");
                        textView2_2.setText("Click Reset");
                    }
                    else{
                        textView2_2.setText(0);
                        textView1_2.setText(0);
                    }
                }
                else if(puntajeString == "45") {
                    if (textView1_2.getText().toString() == "45") {
                        textView1_2.setText("---");
                        textView2_2.setText("up");
                    } else {
                        textView2_1.setText(Integer.parseInt(textView1_1.getText().toString()) + 1);
                        if (Integer.parseInt(textView1_1.getText().toString()) == 6) {
                            textView2_1.setText("You Win");
                            textView2_2.setText("Click Reset");
                        } else {
                            textView1_2.setText(0);
                            textView2_2.setText(0);
                        }
                    }
                }
                else if(puntajeString == "even"){
                    textView2_2.setText("up");
                    textView1_2.setText("---");
                }
                else{
                    puntajeInt = Integer.parseInt(puntajeString);
                    puntajeInt +=15;
                    textView2_2.setText(puntajeInt);
                }
            }
        });
    }
}
