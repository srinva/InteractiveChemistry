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

        Bundle extras = getIntent().getExtras(); //This is for saving proton, neutron, and electron vals
        int protons = (extras.getInt("PROTONS")); //This is for saving proton, neutron, and electron vals

        TextView elementInfoTop, elementInfoBottom, elementName; //This defines all the TextViews
        ImageView elementPicture;                                //This defines all the ImageViews

        elementInfoTop = (TextView) findViewById(R.id.elementInfoTop);      //Finds each TextView in the xml file
        elementInfoBottom = (TextView) findViewById(R.id.elementInfoBottom);
        elementName = (TextView) findViewById(R.id.elementName);
        elementPicture = (ImageView) findViewById(R.id.elementPicture);


        if (protons == 1) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");           //This is the information for each element
            elementInfoBottom.setText("Blah Blah Blah");            //Each element has different information which is why there is a if statement for each one
            elementName.setText("Hydrogen");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 2) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Helium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 3) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Lithium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 4) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Beryllium");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 5) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Boron");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 6) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Carbon");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 7) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Nitrogen");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 8) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Oxygen");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 9) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Fluorine");
            elementPicture.setImageResource(R.drawable.homebutton);
        }else if (protons == 10) {
            elementInfoTop.setText("jhdgj;kahs;gjhasfd");
            elementInfoBottom.setText("Blah Blah Blah");
            elementName.setText("Neon");
            elementPicture.setImageResource(R.drawable.homebutton);
        } else { 
            elementInfoTop.setText("I don't recognize this element");
            elementInfoBottom.setText("Try a different number of Protons!");
            elementName.setText("???");
            elementPicture.setImageResource(R.drawable.homebutton);

    }
}

