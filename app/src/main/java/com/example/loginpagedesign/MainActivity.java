package com.example.loginpagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private EditText username,password;
   private Button loginbutton;
   private TextView attempttext;

    private int counter = 3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        inOne();
    }

    public void inOne(){
        loginbutton = findViewById(R.id.loginbutton);
        username = findViewById(R.id.usernameid);
        password = findViewById(R.id.userpassword);
        attempttext = findViewById(R.id.attempttext);

        attempttext.setText("your left attempt : "+counter);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pass = password.getText().toString();

                if(name.equals("sabbu") && pass.equals("191304")){

                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);

                }else {
                    counter--;
                    attempttext.setText("you can log time : " + counter);

                    if(counter==0){
                        loginbutton.setEnabled(false);// this is how disable button power
                    }
                }


            }
        });


    }
}
