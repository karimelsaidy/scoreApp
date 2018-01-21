package com.example.android.scoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scoreapp.R;

public class MainActivity extends AppCompatActivity {

    int goalRl = 0;
    int offsideRl = 0;
    int shotRL = 0;
    int cardRl = 0;
    int goalPsg = 0;
    int offsidePsg = 0;
    int shotPsg = 0;
    int cardPsg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *four methods to calculate the goals,shots,offsides,cards for real madrid
     */
    public void addGoalRl(View v) {

        goalRl = goalRl + 1;
        displayGoalRl(goalRl);
    }

    public void addShotRl(View v) {

        shotRL = shotRL + 1;
        displayShotRl(shotRL);
    }

    public void addOffsideRl(View v) {
        offsideRl = offsideRl + 1;
        displayOffsideRl(offsideRl);
    }

    public void addCardRl(View v) {
        cardRl = cardRl + 1;
        displayCardRl(cardRl);
    }

    /**
     *four method to display the goals,shots,offsides,cards for real madrid
     */

    public void displayGoalRl(int goal) {
        TextView scoreView = (TextView) findViewById(R.id.goalRl);
        scoreView.setText(String.valueOf(goal));
    }

    public void displayShotRl(int shot) {
        TextView scoreView = (TextView) findViewById(R.id.shotRl);
        scoreView.setText(String.valueOf(shot));
    }

    public void displayOffsideRl(int offside) {
        TextView scoreView = (TextView) findViewById(R.id.offsideRl);
        scoreView.setText(String.valueOf(offside));
    }

    public void displayCardRl(int card) {
        TextView scoreView = (TextView) findViewById(R.id.cardRl);
        scoreView.setText(String.valueOf(card));
    }

    /**
     *four method to calculate the goals,shots,offsides,cards for psg
     */
    public void addGoalPsg(View v) {

        goalPsg = goalPsg + 1;
        displayGoalPsg(goalPsg);
    }

    public void addShotPsg(View v) {

        shotPsg = shotPsg + 1;
        displayShotPsg(shotPsg);
    }

    public void addOffsidePsg(View v) {
        offsidePsg = offsidePsg + 1;
        displayOffsidePsg(offsidePsg);
    }

    public void addCardPsg(View v) {
        cardPsg = cardPsg + 1;
        displayCardPsg(cardPsg);
    }


    /**
     *four method to display the goals,shots,offsides,cards for real madrid
     */

    public void displayGoalPsg(int goal) {
        TextView scoreView = (TextView) findViewById(R.id.goalPsg);
        scoreView.setText(String.valueOf(goal));
    }

    public void displayShotPsg(int shot) {
        TextView scoreView = (TextView) findViewById(R.id.shotPsg);
        scoreView.setText(String.valueOf(shot));
    }

    public void displayOffsidePsg(int offside) {
        TextView scoreView = (TextView) findViewById(R.id.offsidePsg);
        scoreView.setText(String.valueOf(offside));
    }

    public void displayCardPsg(int card) {
        TextView scoreView = (TextView) findViewById(R.id.cardPsg);
        scoreView.setText(String.valueOf(card));
    }

    /**
     * method reset all to zero
     */

    public void reset(View v) {
        goalRl = 0;
        offsideRl = 0;
        shotRL = 0;
        cardRl = 0;
        goalPsg = 0;
        offsidePsg = 0;
        shotPsg = 0;
        cardPsg = 0;
        displayGoalRl(goalRl);
        displayShotRl(shotRL);
        displayOffsideRl(offsideRl);
        displayCardRl(cardRl);
        displayGoalPsg(goalPsg);
        displayShotPsg(shotPsg);
        displayOffsidePsg(offsidePsg);
        displayCardPsg(shotPsg);

    }
}
