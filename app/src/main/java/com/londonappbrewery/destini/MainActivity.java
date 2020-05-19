package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButton;
    Button bottomButton;
    TextView storyText;
    int storyIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);
        storyText = findViewById(R.id.storyTextView);
        storyIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(true);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(false);
            }
        });

    }

    private void changeText(boolean answer) {
        if (storyIndex == 1 && answer) {
            storyIndex = 3;
            storyText.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            bottomButton.setText(R.string.T3_Ans2);
            return;
        }
        if (storyIndex == 1) {
            storyIndex = 2;
            storyText.setText(R.string.T2_Story);
            topButton.setText(R.string.T2_Ans1);
            bottomButton.setText(R.string.T2_Ans2);
            return;
        }
        if (storyIndex == 2 && answer) {
            storyIndex = 3;
            storyText.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            bottomButton.setText(R.string.T3_Ans2);
            return;
        }
        if (storyIndex == 2) {
            storyIndex = 4;
            storyText.setText(R.string.T4_End);
            end();
            return;
        }
        if (storyIndex == 3 && answer){
            storyIndex = 6;
            storyText.setText(R.string.T6_End);
            end();
            return;
        }
        if (storyIndex == 3) {
            storyIndex = 5;
            storyText.setText(R.string.T5_End);
            end();
        }
    }

    private void end() {
        topButton.setText(R.string.Top_end);
        bottomButton.setText(R.string.Bottom_end);
    }
}
