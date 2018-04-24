package com.example.meet_awesome.testnumberapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

import com.example.meet_awesome.testnumberapp.R;

public class MainActivity extends AppCompatActivity{
  // Logic for app which checks whether the input number is a square number or triangular number or neither or both of them
    class Check {
      int num;

      public boolean isT() {
          int x = 1, tnum = 1;
          while (tnum < num) {
              x++;
              tnum = tnum + x;

          }
          if (tnum == num) return true;
          else return false;
      }

      public boolean isS() {

          int number = (int) Math.sqrt(num);
          if (number * number == num) return true;
          else return false;
      }
    }

//

    public void CheckN(View view) {

        EditText Enum = (EditText) findViewById(R.id.editText);

        if (Enum.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter number", Toast.LENGTH_LONG).show();
        } else {
            Log.i("Enum", Enum.getText().toString());
            String msg = "";
            Check n1 = new Check();
            n1.num = Integer.parseInt(Enum.getText().toString());

            if (n1.isT() && n1.isS()) {

                msg = n1.num + " is both";

            } else if (n1.isT()) {

                msg = n1.num + " is Triangular";
            } else if (n1.isS()) {

                msg = n1.num + " is Square";
            } else {
                msg = n1.num + " is neither Triangular nor Square number";
            }

            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
