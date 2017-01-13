package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DictionaryActivity extends AppCompatActivity {
    int protons = 0;
    private Intent gotoElement; 
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        
        Intent = new Intent (this, ElementInformation.class);
        Button hydrogen = (Button) findViewById(R.id.hydrogendiction);

        hydrogen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DictionaryActivity.this, AtomBuilder.class));
                view.getContext().startActivity(gotoElement);
                protons = "protons " + 1;
                finish();
            }
        });
    }
}
