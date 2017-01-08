package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static afhs.tsa.softdev.interactivechemistry.R.layout.heliuminfo;
import static afhs.tsa.softdev.interactivechemistry.R.layout.hydrogeninfo;

public class ElementInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_information);

        Button backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ElementInformation.this, AtomBuilder.class));
            }
        });

        //This is for saving proton, neutron, and electron vals   -Srinath

        Bundle extras = getIntent().getExtras();

        int protons = (extras.getInt("PROTONS"));

        //This is for saving proton, neutron, and electron vals   -Srinath



        if (protons == 1) {
            setContentView(hydrogeninfo);
            Button elementButton = (Button) findViewById(R.id.elementback);
            elementButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(ElementInformation.this, AtomBuilder.class));
                }
            });

        }

        if (protons == 2) {
            setContentView(heliuminfo);
            Button elementButton = (Button) findViewById(R.id.elementback);
            elementButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(ElementInformation.this, AtomBuilder.class));
                }
            });

        }

    }
}

