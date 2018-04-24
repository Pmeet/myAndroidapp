package com.example.tictactoev2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 0 for blue 1 for red
    int playerTurn=0;
    // 2 means unused state
    int[] viewState={2,2,2,2,2,2,2,2,2};
    public void getToken(View view){

        TextView text = findViewById(R.id.displayTurn);
//        text.setText("Player 1, it's your turn");
        ImageView token = (ImageView) view;

        int clickedToken= Integer.parseInt(token.getTag().toString());
        if(viewState[clickedToken]==2) {
            token.setTranslationY(1000f);
            if (playerTurn == 0) {
                text.setText("Player 2, it's your turn");
                token.setImageResource(R.drawable.blue_coin);
                playerTurn = 1;
            } else {
                text.setText("Player 1, it's your turn");
                token.setImageResource(R.drawable.red_coin);
                playerTurn = 0;
            }
            token.animate().translationYBy(-1000f).rotation(3600).setDuration(1000);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
