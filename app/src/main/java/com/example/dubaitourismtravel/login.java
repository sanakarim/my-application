package com.example.dubaitourismtravel;


import coding.insight.login2.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    /* Define the UI elements */
    private EditText eName;
    private EditText ePassword;
    private TextView eAttemptsInfo;
    private TextView argo;
    private int counter = 5;

    String userName = "";
    String userPassword = "";

    /* Class to hold credentials */
    class Credentials
    {
        String name = "Admin";
        String password = "123456";

    }

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        /* Bind the XML views to Java Code Elements */
        eName = findViewById(R.id.username_input);
        ePassword = findViewById(R.id.pass);

         argo=(TextView)findViewById(R.id.elogin);

        /* Describe the logic when the login button is clicked */
        argo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Obtain user inputs */
                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();

                /* Check if the user inputs are empty */
                if(userName.isEmpty() || userPassword.isEmpty())
                {
                    /* Display a message toast to user to enter the details */
                    Toast.makeText(login.this, "Please enter name and password!", Toast.LENGTH_LONG).show();

                }else {

                    /* Validate the user inputs */
                    isValid = validate(userName, userPassword);

                    /* Validate the user inputs */

                    /* If not valid */
                    if (!isValid) {

                        /* Decrement the counter */
                        counter--;

                        /* Show the attempts remaining */
//                        eAttemptsInfo.setText("Attempts Remaining: " + String.valueOf(counter));


                        /* Disable the login button if there are no attempts left */
                        if (counter == 0) {
                            argo.setEnabled(false);
                            Toast.makeText(login.this, "You have used all your attempts try again later!", Toast.LENGTH_LONG).show();
                        }
                        /* Display error message */
                        else {
                            Toast.makeText(login.this, "Incorrect credentials, please try again!", Toast.LENGTH_LONG).show();
                        }
                    }
                    /* If valid */
                    else {
                        System.out.println("logged in");
                        /* Allow the user in to your app by going into the next activity */
                        startActivity(new Intent(login.this,MainActivity.class));
                    }

                }
            }
        });
    }

    /* Validate the credentials */
    private boolean validate(String userName, String userPassword)
    {
        /* Get the object of Credentials class */
        Credentials credentials = new Credentials();

        /* Check the credentials */
        if(userName.equals(credentials.name) && userPassword.equals(credentials.password))
        {
            return true;
        }

        return false;
    }
}