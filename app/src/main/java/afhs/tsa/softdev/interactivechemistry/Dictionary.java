package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;


public class Dictionary extends AppCompatActivity {

    ListView dictionaryList;
    SearchView dictionarySearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        dictionaryList = (ListView) findViewById(R.id.dictionaryList);
        dictionarySearch = (SearchView) findViewById(R.id.dictionarySearch);

        String[] listValues = new String[] {
                "Protons",
                "Neutrons",
                "Electrons",
                "Isotope",
                "Atom",
        };

        final ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, listValues);
        dictionaryList.setAdapter(adapter);

        dictionarySearch.setOnQueryTextListener(new OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                adapter.getFilter().filter(text);
                return false;
            }
        });

        dictionaryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemposition = position;
                String value  = (String) dictionaryList.getItemAtPosition(position);
                Toast.makeText(Dictionary.this, ""+value, Toast.LENGTH_SHORT).show();

                if (value == "Protons") {
                    Intent dictionaryValues = new Intent(Dictionary.this, ElementInformation.class);
                    dictionaryValues.putExtra("dictionaryValue", 1);
                    startActivity(dictionaryValues);
                }

                else if (value == "Neutrons") {
                    Intent dictionaryValues = new Intent(Dictionary.this, ElementInformation.class);
                    dictionaryValues.putExtra("dictionaryValue", 2);
                    startActivity(dictionaryValues);
                }

                else if (value == "Electrons") {
                    Intent dictionaryValues = new Intent(Dictionary.this, ElementInformation.class);
                    dictionaryValues.putExtra("dictionaryValue", 3);
                    startActivity(dictionaryValues);
                }

                else if (value == "Isotope") {
                    Intent dictionaryValues = new Intent(Dictionary.this, ElementInformation.class);
                    dictionaryValues.putExtra("dictionaryValue", 4);
                    startActivity(dictionaryValues);
                }

                else if (value == "Atom") {
                    Intent dictionaryValues = new Intent(Dictionary.this, ElementInformation.class);
                    dictionaryValues.putExtra("dictionaryValue", 5);
                    startActivity(dictionaryValues);
                }
            }
        });
    }
}

