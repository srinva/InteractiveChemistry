package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        /*This is for saving proton, neutron, and electron vals   -Srinath
        Intent intent = getIntent();
        int protons = intent.getIntExtra("PROTONS", 0);

        TextView testing = (TextView) findViewById(R.id.testing);

        if (protons == 1){
            testing.setText(""+protons);
        }
        //This is for saving proton, neutron, and electron vals   -Srinath*/

    }
}
