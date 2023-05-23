package sg.edu.rp.c346.id22036150.demoriddlechallenges;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();

        String question = intentReceived.getStringExtra("Question");

        if(question.equals("Q1")){
            tvAnswer.setText(question + " answer is: Queue");
        } else if(question.equals("Q2")){
            tvAnswer.setText(question + " answer is: Gone");
        }
    }
}