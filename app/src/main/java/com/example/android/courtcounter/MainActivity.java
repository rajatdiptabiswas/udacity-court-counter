package com.example.android.courtcounter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Button declarations and setOnClickListeners.
         */
        Button plus3TeamA = (Button) findViewById(R.id.teamA_plus_3);
        plus3TeamA.setOnClickListener((View.OnClickListener)this);

        Button plus2TeamA = (Button) findViewById(R.id.teamA_plus_2);
        plus2TeamA.setOnClickListener((View.OnClickListener)this);

        Button plus1TeamA = (Button) findViewById(R.id.teamA_plus_1);
        plus1TeamA.setOnClickListener((View.OnClickListener)this);

        Button plus3TeamB = (Button) findViewById(R.id.teamB_plus_3);
        plus3TeamB.setOnClickListener((View.OnClickListener)this);

        Button plus2TeamB = (Button) findViewById(R.id.teamB_plus_2);
        plus2TeamB.setOnClickListener((View.OnClickListener)this);

        Button plus1TeamB = (Button) findViewById(R.id.teamB_plus_1);
        plus1TeamB.setOnClickListener((View.OnClickListener)this);

        Button reset = (Button) findViewById(R.id.reset_button);
        reset.setOnClickListener((View.OnClickListener)this);
    }

    //Universal function to increment.
    private void incrementTeamXByY(char x, int y) {
        if (x == 'A') {
            teamAScore += y;
        }
        if (x == 'B') {
            teamBScore += y;
        }
    }

//    /**
//     * Updating Team A scores.
//     */
//    public void threeForTeamA(View view) {
//        teamAScore += 3;
//        displayForTeamA(teamAScore);
//    }
//
//    public void twoForTeamA(View view) {
//        teamAScore += 2;
//        displayForTeamA(teamAScore);
//    }
//
//    public void oneForTeamA(View view) {
//        teamAScore += 1;
//        displayForTeamA(teamAScore);
//    }
//
//    /**
//     * Updating Team B scores.
//     */
//    public void threeForTeamB(View view) {
//        teamBScore += 3;
//        displayForTeamB(teamBScore);
//    }
//
//    public void twoForTeamB(View view) {
//        teamBScore += 2;
//        displayForTeamB(teamBScore);
//    }
//
//    public void oneForTeamB(View view) {
//        teamBScore += 1;
//        displayForTeamB(teamBScore);
//    }

    /**
     * Reset scores for both the teams.
     */
    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;

        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.teamA_plus_3:
                incrementTeamXByY('A', 3);
                displayForTeamA(teamAScore);
                break;

            case R.id.teamA_plus_2:
                incrementTeamXByY('A', 2);
                displayForTeamA(teamAScore);
                break;

            case R.id.teamA_plus_1:
                incrementTeamXByY('A', 1);
                displayForTeamA(teamAScore);
                break;

            case R.id.teamB_plus_3:
                incrementTeamXByY('B', 3);
                displayForTeamB(teamBScore);
                break;

            case R.id.teamB_plus_2:
                incrementTeamXByY('B', 2);
                displayForTeamB(teamBScore);
                break;

            case R.id.teamB_plus_1:
                incrementTeamXByY('B', 1);
                displayForTeamB(teamBScore);
                break;

            case R.id.reset_button:
                reset(v);
                break;

        }

    }

}
