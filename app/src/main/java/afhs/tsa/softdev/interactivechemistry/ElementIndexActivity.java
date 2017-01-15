package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ElementIndexActivity extends AppCompatActivity {


    ListView elementindexlist;
    SearchView searchElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementindex);
        elementindexlist = (ListView) findViewById(R.id.elementindexlist);
        searchElement = (SearchView) findViewById(R.id.searchElements);

        String[] values = new String[] {
                "Hydrogen",
                "Helium",
                "Lithium"
        };


        final ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        elementindexlist.setAdapter(adapter);

        searchElement.setOnQueryTextListener(new OnQueryTextListener() {
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



        elementindexlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemposition = position;
                String value  = (String) elementindexlist.getItemAtPosition(position);
                Toast.makeText(ElementIndexActivity.this, ""+value, Toast.LENGTH_SHORT).show();

                if (value == "Hydrogen") {
                    Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                    dictionaryValues.putExtra("protons", 1);
                    startActivity(dictionaryValues);

                }

                if (value == "Helium") {
                    Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                    dictionaryValues.putExtra("protons", 2);
                    startActivity(dictionaryValues);

                }

                if (value == "Lithium") {
                    Intent dictionaryValues = new Intent(ElementIndexActivity.this, ElementInformation.class);
                    dictionaryValues.putExtra("protons", 3);
                    startActivity(dictionaryValues);

                }
            }
        });


    }
}

