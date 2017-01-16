package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                Button elementIndex = (Button) findViewById(R.id.elementIndex); //This button goes to the Dictionary

                elementIndex.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, ElementIndexActivity.class));
                    }
                });

                Button interchemmain = (Button) findViewById(R.id.interChemMain); //This button goes to the Atom Builder

                interchemmain.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, AtomBuilder.class));
                    }
                });

                Button dictionary = (Button) findViewById(R.id.dictionary);

                dictionary.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, Dictionary.class));
                    }
                });
            }
        }

