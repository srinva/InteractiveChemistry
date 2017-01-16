package afhs.tsa.softdev.interactivechemistry;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import org.w3c.dom.Text;


public class ElementInformation extends AppCompatActivity {



    View.OnClickListener finishActivityListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            finish();
        }
    };



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_information);

        Button backElementInfo = (Button)findViewById(R.id.backElementInfo);

        backElementInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        Bundle extras = getIntent().getExtras(); //This is for saving proton, neutron, and electron vals
        int protons = (extras.getInt("PROTONS")); //This is for saving proton, neutron, and electron vals

        Intent mIntent = getIntent();   //Saves proton value from ElementIndex
        int protons2 = mIntent.getIntExtra("protons", 0); //Saves proton value from ElementIndex

        Intent dictionaryIntent = getIntent();  //Saves dictionaryValue from Dictionary
        int dictionaryValues = dictionaryIntent.getIntExtra("dictionaryValue", 0); //Saves dictionaryValue from Dictionary

        TextView elementInfoTop, elementInfoBottom, elementName; //This defines all the TextViews
        ImageView elementPicture;                                //This defines all the ImageViews

        elementInfoTop = (TextView) findViewById(R.id.elementInfoTop);      //Finds each TextView in the xml file
        elementInfoBottom = (TextView) findViewById(R.id.elementInfoBottom);
        elementName = (TextView) findViewById(R.id.elementName);
        elementPicture = (ImageView) findViewById(R.id.elementPicture);

        if (dictionaryValues == 1) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Something about a protons lol");
            elementName.setText("Protons");
            elementPicture.setImageResource(R.drawable.finalproton);
        }

        else if (dictionaryValues == 2) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Something about a protons lol");
            elementName.setText("Neutrons");
            elementPicture.setImageResource(R.drawable.finalneutron);
        }

        if (protons == 1 || protons2 == 1) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");           //This is the information for each element
            elementInfoBottom.setText("Blah Blah Blah");            //Each element has different information which is why there is a if statement for each one
            elementName.setText("Hydrogen");
            elementPicture.setImageResource(R.drawable.hydrogen);
        }

        else if (protons == 2 || protons2 == 2) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Helium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 3 || protons2 == 3) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Lithium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 4 || protons2 == 4) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Beryllium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 5 || protons2 == 5) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Boron");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 6 || protons2 == 6) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Carbon");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 7 || protons2 == 7) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Nitrogen");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 8 || protons2 == 8) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Oxygen");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 9 || protons2 == 9) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Fluorine");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 10 || protons2 == 10) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Neon");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 11 || protons2 == 11) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Sodium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 12 || protons2 == 12) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Magnesium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 13 || protons2 == 13) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Aluminium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 14 || protons2 == 14) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Silicon");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 15 || protons2 == 15) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Phosphorus");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 16 || protons2 == 16) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Sulfur");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 17 || protons2 == 17) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Chlorine");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 18 || protons2 == 18) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Argon");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 19 || protons2 == 19) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Potassium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 20 || protons2 == 20) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Calcium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 21 || protons2 == 21) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Scandium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 22 || protons2 == 22) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Titanium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 23 || protons2 == 23) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Vanadium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 24 || protons2 == 24) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Chromium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 25 || protons2 == 25) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Manganese");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 26 || protons2 == 26) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Iron");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 27 || protons2 == 27) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Cobalt");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 28 || protons2 == 28) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Nickel");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 29 || protons2 == 29) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Copper");
            elementPicture.setImageResource(R.drawable.homebutton);
        }

        else if (protons == 30 || protons2 == 30) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Zinc");
            elementPicture.setImageResource(R.drawable.homebutton);
        }


    }
}

