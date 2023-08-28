package com.example.xandogame;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button  button1 , button2 , button3 , button4 , button5 ,
            button6 , button7 , button8 , button9;

    boolean playerX = true ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setClicks();

    }
void setClicks(){

  button1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v){
          actionButton(button1);
      }
  });


    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button2);
        }
    });

    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button3);
        }
    });

    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button4);
        }
    });


    button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button5);
        }
    });

    button6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button6);
        }
    });

    button7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button7);
        }
    });


    button8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button8);
        }
    });


    button9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            actionButton(button9);
        }
    });







}

void actionButton(Button but) {
    if (but.getText().equals("")) {

        if (playerX) {
            but.setText("x");
        } else {

            but.setText("o");
        }


    playerX = !playerX;
    checkEndGame();

}else {

    Toast.makeText(getApplicationContext(), "exist before" , Toast.LENGTH_SHORT).show();
    }
}


void  checkEndGame(){

       if(
               (button1.getText().equals("x")&&button5.getText().equals("x")&&button9.getText().equals("x"))
           || (button1.getText().equals("x")&&button2.getText().equals("x")&&button3.getText().equals("x"))
           || (button1.getText().equals("x")&&button4.getText().equals("x")&&button7.getText().equals("x"))
           || (button4.getText().equals("x")&&button5.getText().equals("x")&&button6.getText().equals("x"))
           || (button7.getText().equals("x")&&button8.getText().equals("x")&&button9.getText().equals("x"))
           || (button3.getText().equals("x")&&button5.getText().equals("x")&&button7.getText().equals("x"))
           ||(button3.getText().equals("x")&&button6.getText().equals("x")&&button9.getText().equals("x"))
           ||(button2.getText().equals("x")&&button5.getText().equals("x")&&button8.getText().equals("x"))

       ){

          Toast.makeText(getApplicationContext() , "The player X is Win " , Toast.LENGTH_SHORT).show();
       } else if(

               (button1.getText().equals("o")&&button5.getText().equals("o")&&button9.getText().equals("o") )
                       || (button1.getText().equals("o")&&button2.getText().equals("o")&&button3.getText().equals("o"))
                       || (button1.getText().equals("o")&&button4.getText().equals("o")&&button7.getText().equals("o"))
                       || (button4.getText().equals("o")&&button5.getText().equals("o")&&button6.getText().equals("o"))
                       || (button7.getText().equals("o")&&button8.getText().equals("o")&&button9.getText().equals("o"))
                       || (button3.getText().equals("o")&&button5.getText().equals("o")&&button7.getText().equals("o"))
                       ||(button3.getText().equals("o")&&button6.getText().equals("o")&&button9.getText().equals("o"))
                       ||(button2.getText().equals("o")&&button5.getText().equals("o")&&button8.getText().equals("o"))




                )
       {
           Toast.makeText(getApplicationContext() , "The player O is Win" , Toast.LENGTH_SHORT).show();

       }
}


void initViews(){

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
     }









}