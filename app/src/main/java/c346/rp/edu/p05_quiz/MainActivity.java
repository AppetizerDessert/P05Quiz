package c346.rp.edu.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbOneWay;
    CheckBox cbRoundTrip;
    Button btnMinus;
    Button btnPlus;
    Button btnSubmit;
    TextView tvPaxAmt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbOneWay = findViewById(R.id.OneWay);
        cbRoundTrip = findViewById(R.id.RoundTrip);
        btnMinus = findViewById(R.id.minus);
        btnPlus = findViewById(R.id.plus);
        btnSubmit = findViewById(R.id.button3);
        tvPaxAmt = findViewById(R.id.PaxAmt);


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt = 0;
                tvPaxAmt.setText(amt - 1);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt = 0;
                tvPaxAmt.setText(amt + 1);
            }
        });

        if (cbOneWay.isChecked() == true && cbRoundTrip.isChecked() == false){
            String option1 = "One Way Trip";
        } else if (cbRoundTrip.isChecked() == true && cbOneWay.isChecked() == false){
            String option1 = "Round Trip";
        }

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("trip", option1);
                intent.putExtra("cost", amount);
                startActivity(intent);
            }
        });
    }
}
