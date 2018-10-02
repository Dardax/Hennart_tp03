package fr.utt.if26.hennart_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView)findViewById(R.id.textView);
        tx.setText("Message Modifié dans le code java");
        tx.setText(R.string.Bonjour);

        Button bt= (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            }
        });
    }
}
