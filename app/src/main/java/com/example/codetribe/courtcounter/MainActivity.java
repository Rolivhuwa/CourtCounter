package com.example.codetribe.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for Team A
    int scoreTeamA = 0;
    //Tracks the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Increase the score for Team A by 3 points
     * @param view
     */

    public void addThreePointsForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 2 points
     * @param view
     */
    public void addTwoPointsForTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 1 points
     * @param view
     */
    public void addOnePointsForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 3 points
     * @param view
     */
    public void addThreePointsForTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points
     * @param view
     */
    public void addTwoPointsForTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 1 points
     * @param view
     */
    public void addOnePointsForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score for both teams back to 0
     * @param view
     */
    public void clickToResetScore (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B
     */
    public void displayForTeamA(int score){
        TextView ScoreView = (TextView) findViewById(R.id.team_a_score);
        ScoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B
     */
    public void displayForTeamB(int score){
        TextView ScoreView = (TextView) findViewById(R.id.team_b_score);
        ScoreView.setText(String.valueOf(score));
    }


}
