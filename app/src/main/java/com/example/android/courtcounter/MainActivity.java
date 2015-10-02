package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addOneForTeamB=(Button)findViewById(R.id.add_three_for_team_b);
        addOneForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB+=3;
                displayForTeamB(scoreTeamB);
            }
        });
    }

    /*
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */

    int scoreTeamA =0;

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when 'Free Throw' button is pressed.
     */
    public void addOneForTeamA(View view)
    {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This metod is called when '+2 Points' button is pressed.
     */
    public void addTwoForTeamA(View view)
    {
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when '+3 Points' button is pressed.
     */
    public void addThreeForTeamA(View view)
    {
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }

    int scoreTeamB=0;

    /**
     * Displays the given scoreTeamB for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when 'Free Throw' button is pressed.
     */
    public void addOneForTeamB(View view)
    {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This metod is called when '+2 Points' button is pressed.
     */
    public void addTwoForTeamB(View view)
    {
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when '+3 Points' button is pressed.
     */

    /**
     * This method is called when Reset button is clicked.
     */
    public void reset(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
