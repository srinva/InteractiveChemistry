package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElementIndexActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementindex);

        Button hydrogen = (Button) findViewById(R.id.hydrogendiction);
        hydrogen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                dictionaryValues.putExtra("protons", 1);
                startActivity(dictionaryValues);

            }
        });

        Button helium = (Button) findViewById(R.id.heliumdiction);
        helium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                dictionaryValues.putExtra("protons", 2);
                startActivity(dictionaryValues);

            }
        });

        Button lithium = (Button) findViewById(R.id.lithiumdiction);
        lithium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                dictionaryValues.putExtra("protons", 3);
                startActivity(dictionaryValues);

            }
        });

        Button beryllium = (Button) findViewById(R.id.berylliumdiction);
        beryllium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                dictionaryValues.putExtra("protons", 4);
                startActivity(dictionaryValues);

            }
        });

        Button boron = (Button) findViewById(R.id.borondiction);
        boron.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                dictionaryValues.putExtra("protons", 5);
                startActivity(dictionaryValues);

            }
        });




    }
}
