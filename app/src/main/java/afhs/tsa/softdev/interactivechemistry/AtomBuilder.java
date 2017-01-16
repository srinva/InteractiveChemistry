package afhs.tsa.softdev.interactivechemistry;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AtomBuilder extends AppCompatActivity {

    private Intent save;
    int protons = 0;
    int electrons = 0;
    int neutrons = 0;
    String element; //String value of element name, will be displayed on button
    TextView drop, state, estate, nstate, atomstatus, charge;
    ImageView pro, neu, ele;
    Button elementbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_atom_builder);

        save = new Intent(this, ElementInformation.class);

        Button atomBuilderBack = (Button) findViewById(R.id.atombuilderback);

        atomBuilderBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AtomBuilder.this, MainActivity.class));
                finish();
            }
        });

        drop = (TextView) findViewById(R.id.drop);
        estate = (TextView) findViewById(R.id.estate);
        state = (TextView) findViewById(R.id.atomstatus);
        nstate = (TextView) findViewById(R.id.nstate);
        atomstatus = (TextView)findViewById(R.id.atomstate);
        charge = (TextView)findViewById(R.id.charge);
        ele = (ImageView) findViewById(R.id.imageView);
        pro = (ImageView) findViewById(R.id.imageView2);
        neu = (ImageView) findViewById(R.id.imageView3);
        elementbutton = (Button)findViewById(R.id.elementbutton);


        ele.setOnLongClickListener(longClickListener);
        pro.setOnLongClickListener(longClickListener);
        neu.setOnLongClickListener(longClickListener);
        drop.setOnDragListener(dragListener);

    }



    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
                v.startDrag(data, myShadowBuilder, v, 0);
                return true;
            }
        };

        View.OnDragListener dragListener = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                int dragEvent = event.getAction();
                switch (dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();

                        if (view.getId() == R.id.imageView) {
                            drop.setBackgroundResource(R.color.colorPrimary);
                            drop.getBackground().setAlpha(50);
                            estate.setText("Electrons: " + electrons);
                        }

                        if (view.getId() == R.id.imageView2) {
                            drop.setBackgroundResource(R.color.colorPrimary);
                            drop.getBackground().setAlpha(50);
                            state.setText("Protons: " + protons);
                        }

                        if (view.getId() == R.id.imageView3) {
                            drop.setBackgroundResource(R.color.colorPrimary);
                            drop.getBackground().setAlpha(50);
                            nstate.setText("Neutrons: " + neutrons);
                        }
                        break;

                    case DragEvent.ACTION_DRAG_ENDED:
                        final View view4 = (View) event.getLocalState();

                        if (view4.getId() == R.id.imageView) {
                            drop.getBackground().setAlpha(00);
                            estate.setText("Electrons: " + electrons);
                        }

                        if (view4.getId() == R.id.imageView2) {
                            drop.getBackground().setAlpha(00);
                            state.setText("Protons: " + protons);
                        }

                        if (view4.getId() == R.id.imageView3) {
                            drop.getBackground().setAlpha(00);
                            nstate.setText("Neutrons: " + neutrons);
                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:

                        final View view2 = (View) event.getLocalState();

                        if (view2.getId() == R.id.imageView) {
                            state.setText("");
                            drop.getBackground().setAlpha(00);
                            estate.setText("Electrons: " + electrons);
                            state.setText("Protons: " + protons);
                        }

                        if (view2.getId() == R.id.imageView2) {
                            state.setText("");
                            drop.getBackground().setAlpha(00);
                            state.setText("Protons: " + protons);
                        }

                        if (view2.getId() == R.id.imageView3) {
                            state.setText("");
                            drop.getBackground().setAlpha(00);
                            nstate.setText("Neutrons: " + neutrons);
                            state.setText("Protons: " + protons);
                        }
                        break;
                    case DragEvent.ACTION_DROP:

                        final View view3 = (View) event.getLocalState();

                        if (view3.getId() == R.id.imageView3) {

                            neutrons++;

                            nstate.setText("Neutrons: " + neutrons);

                            if (protons == 1) {
                                atomstatus.setText("Stable");
                                atomstatus.setTextColor(Color.GREEN);
                            }

                            if (protons == 2) {
                                int heliume = 2;
                                if (neutrons == heliume) {
                                    atomstatus.setText("Stable");
                                    atomstatus.setTextColor(Color.GREEN);
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                    atomstatus.setTextColor(Color.RED);
                                }
                            }

                            if (protons == 3) {
                                int lithiume1 = 3;
                                int lithiume2 = 4;
                                if (neutrons == lithiume1 || neutrons == lithiume2) {
                                    atomstatus.setText("Stable");
                                    atomstatus.setTextColor(Color.GREEN);
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                    atomstatus.setTextColor(Color.RED);
                                }
                            }

                            if (protons == 4) {
                                int berylliumn = 5;
                                if (neutrons == berylliumn){
                                    atomstatus.setText("Stable");
                                    atomstatus.setTextColor(Color.GREEN);
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                    atomstatus.setTextColor(Color.RED);
                                }
                            }

                            if (protons == 5) {
                                int boronn1 = 5;
                                int boronn2 = 6;
                                if (neutrons == boronn1 || neutrons == boronn2){
                                    atomstatus.setText("Stable");
                                    atomstatus.setTextColor(Color.GREEN);
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 6) {
                                int carbonn1 = 6;
                                int carbonn2 = 7;
                                if (neutrons == carbonn1 || neutrons == carbonn2){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 7) {
                                int nitrogenn1 = 7;
                                int nitrogenn2 = 8;
                                if (neutrons == nitrogenn1 || neutrons == nitrogenn2){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 8) {
                                int oxygenn1 = 8;
                                int oxygenn2 = 9;
                                int oxygenn3 = 10;
                                if (neutrons == oxygenn1 || neutrons == oxygenn2 || neutrons == oxygenn3){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 9) {
                                int fluorine = 10;
                                if (neutrons == fluorine){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 10) {
                                int neonn1 = 10;
                                int neonn2 = 11;
                                int neonn3 = 12;
                                if (neutrons == neonn1 || neutrons == neonn2 || neutrons == neonn3){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 11) {
                                int sodiumn = 12;
                                if (neutrons == sodiumn ){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 12) {
                                int magnesiumn1 = 12;
                                int magnesiumn2 = 13;
                                int magnesiumn3 = 14;
                                if (neutrons == magnesiumn1 || neutrons == magnesiumn2 || neutrons == magnesiumn3){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 13) {
                                int aluminiumn = 14;
                                if (neutrons == aluminiumn){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 14) {
                                int siliconn1 = 14;
                                int siliconn2 = 15;
                                int siliconn3 = 16;
                                if (neutrons == siliconn1 || neutrons == siliconn2 || neutrons == siliconn3){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 15) {
                                int phosphorusn = 16;
                                if (neutrons == phosphorusn){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 16) {
                                int sulfurn1 = 16;
                                int sulfurn2 = 17;
                                int sulfurn3 = 18;
                                if (neutrons == sulfurn1 || neutrons == sulfurn2 || neutrons == sulfurn3){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 17) {
                                int chlorinen = 18;
                                if (neutrons == chlorinen){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 18) {
                                int argonn1 = 18;
                                int argonn2 = 20;
                                int argonn3 = 22;
                                if (neutrons == argonn1 || neutrons == argonn2 || neutrons == argonn3){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 19) {
                                int potassiumn1 = 20;
                                int potassiumn2 = 22;
                                if (neutrons == potassiumn1 || neutrons == potassiumn2){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 20) {
                                int calciumn1 = 20;
                                int calciumn2 = 22;
                                int calciumn3 = 23;
                                int calciumn4 = 24;
                                int calciumn5 = 26;
                                if (neutrons == calciumn1 || neutrons == calciumn2 || neutrons == calciumn3 || neutrons == calciumn4 || neutrons == calciumn5){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }

                            if (protons == 21) {
                                int scandiumn = 24;
                                if (neutrons == scandiumn){
                                    atomstatus.setText("Stable");
                                }
                                else{
                                    atomstatus.setText("Unstable");
                                }
                            }


                        }

                        if (view3.getId() == R.id.imageView) {

                            electrons++;
                            estate.setText("Electrons: " + electrons);

                            if (electrons == protons){
                                charge.setText("Your atom is neutrally charged");
                            }else if (electrons > protons){
                                charge.setText("Your atom is negatively charged");
                            }else {
                                charge.setText("Your atom is positively charged");
                            }

                        }

                            if (view3.getId() == R.id.imageView2) {

                                protons++;
                                if (electrons == protons) {
                                    charge.setText("Your atom is neutrally charged");
                                } else if (electrons > protons) {
                                    charge.setText("Your atom is negatively charged");
                                } else {
                                    charge.setText("Your atom is positively charged");
                                }

                                state.setText("Protons: " + protons);

                                if (protons == 1) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Hydrogen");
                                    element = "Hydrogen";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 2) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Helium");
                                    element = "Helium";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 3) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Lithium");
                                    element = "Lithium";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 4)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Beryllium");
                                    element = "Beryllium";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 5)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Boron");
                                    element = "Boron";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 6)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Carbon");
                                    element = "Carbon";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 7)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Nitrogen");
                                    element = "Nitrogen";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 8)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Oxygen");
                                    element = "Oxygen";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 9)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Flourine");
                                    element = "Fluorine";

                                    save.putExtra("PROTONS", protons);
                                    Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                    goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            startActivity(save);
                                        }
                                    });
                                }

                                else if (protons == 10)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Neon");
                                    element = "Neon";
                                }

                                else if (protons == 11)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Sodium");
                                    element = "Sodium";
                                }

                                else if (protons == 12)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Magnesium");
                                    element = "Magnesium";
                                }

                                else if (protons == 13)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Aluminium");
                                    element = "Aluminium";
                                }

                                else if (protons == 14)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Silicon");
                                    element = "Silicon";
                                }

                                else if (protons == 15)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Phosphorus");
                                    element = "Phosphorus";
                                }

                                else if (protons == 16)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Sulfur");
                                    element = "Sulfur";
                                }

                                else if (protons == 17)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Chlorine");
                                    element = "Chlorine";
                                }

                                else if (protons == 18)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Argon");
                                    element = "Argon";
                                }

                                else if (protons == 19)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Potassium");
                                    element = "Potassium";
                                }

                                else if (protons == 20)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Calcium");
                                    element = "Calcium";
                                }

                                else if (protons == 21)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Scandium");
                                    element = "Scandium";
                                }

                                else if (protons == 22)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Titanium");
                                    element = "Titanium";
                                }

                                else if (protons == 23)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Vanadium");
                                    element = "Vanadium";
                                }

                                else if (protons == 24)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Chromium");
                                    element = "Chromium";
                                }

                                else if (protons == 25)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Manganese");
                                    element = "Manganese";
                                }

                                else if (protons == 26)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Iron");
                                    element = "Iron";
                                }

                                else if (protons == 27)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Cobalt");
                                    element = "Cobalt";
                                }

                                else if (protons == 28)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Nickel");
                                    element = "Nickel";
                                }

                                else if (protons == 29)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Copper");
                                    element = "Copper";
                                }

                                else if (protons == 30)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Zinc");
                                    element = "Zinc";
                                }

                                else if (protons == 31)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Gallium");
                                    element = "Gallium";
                                }

                                else if (protons == 32)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Germanium");
                                    element = "Germanium";
                                }

                                else if (protons == 33)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Arsenic");
                                    element = "Arsenic";
                                }

                                else if (protons == 34)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Selenium");
                                    element = "Selenium";
                                }

                                else if (protons == 35)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Bromine");
                                    element = "Bromine";
                                }

                                else if (protons == 36)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Krypton");
                                    element = "Krypton";
                                }

                                else if (protons == 37)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Rubidium");
                                    element = "Rubidium";
                                }

                                else if (protons == 38)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Strontium");
                                    element = "Strontium";
                                }

                                else if (protons == 39)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Yttrium");
                                    element = "Yttrium";
                                }

                                else if (protons == 40)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Zirconium");
                                    element = "Zirconium,";
                                }

                                else if (protons == 41)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Niobium");
                                    element = "Niobium";
                                }

                                else if (protons == 42)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Molybdenum");
                                    element = "Molybdenum";
                                }

                                else if (protons == 43)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Technetium");
                                    element = "Technetium";
                                }

                                else if (protons == 44)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Ruthenium");
                                    element = "Ruthenium";
                                }

                                else if (protons == 45)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Rhodium");
                                    element = "Rhodium";
                                }

                                else if (protons == 46)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Palladium");
                                    element = "Palladium";
                                }

                                else if (protons == 47)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Silver");
                                    element = "Silver";
                                }

                                else if (protons == 48)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Cadmium");
                                    element = "Cadmium";
                                }

                                else if (protons == 49)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Indium");
                                    element = "Indium";
                                }

                                else if (protons == 50)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Tin");
                                    element = "Tin";
                                }

                                else if (protons == 51)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Antimony");
                                    element = "Antimony";
                                }

                                else if (protons == 52)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Tellurium");
                                    element = "Tellurium";
                                }

                                else if (protons == 53)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Iodine");
                                    element = "Iodine";
                                }

                                else if (protons == 54)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Xenon");
                                    element = "Xenon";
                                }

                                else if (protons == 55)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Caesium");
                                    element = "Caesium";
                                }

                                else if (protons == 56)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Barium");
                                    element = "Barium";
                                }

                                else if (protons == 57)

                                {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Lanthanum");
                                    element = "Lanthanum";
                                }

                                else if (protons == 58) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Cerium");
                                    element = "Cerium";
                                }

                                else if (protons == 59) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Praseodymium");
                                    element = "Praseodymium";
                                }

                                else if (protons == 60) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Neodymium");
                                    element = "Neodymium";
                                }

                                else if (protons == 61) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Promethium");
                                    element = "	Promethium	";
                                }

                                else if (protons == 62) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Samarium");
                                    element = "Samarium";
                                }

                                else if (protons == 63) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Europium");
                                    element = "Europium";
                                }

                                else if (protons == 64) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Gadolinium");
                                    element = "Gadolinium";
                                }

                                else if (protons == 65) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Terbium");
                                    element = "Terbium";
                                }

                                else if (protons == 66) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Dysprosium");
                                    element = "Dysprosium";
                                }

                                else if (protons == 67) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Holmium");
                                    element = "Holmium";
                                }

                                else if (protons == 68) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Erbium");
                                    element = "Erbium";
                                }

                                else if (protons == 69) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Thulium");
                                    element = "Thulium";
                                }

                                else if (protons == 70) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Ytterbium");
                                    element = "Ytterbium";
                                }

                                else if (protons == 71) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Lutetium");
                                    element = "Lutetium";
                                }

                                else if (protons == 72) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Hafnium");
                                    element = "Hafnium";
                                }

                                else if (protons == 73) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Tantalum");
                                    element = "Tantalum";
                                }

                                else if (protons == 74) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Tungsten");
                                    element = "Tungsten";
                                }

                                else if (protons == 75) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Rhenium");
                                    element = "Rhenium";
                                }

                                else if (protons == 76) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Osmium");
                                    element = "Osmium";
                                }

                                else if (protons == 77) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Iridium");
                                    element = "Iridium";
                                }

                                else if (protons == 78) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Platinum");
                                    element = "Platinum";
                                }

                                else if (protons == 79) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Gold");
                                    element = "Gold";
                                }

                                else if (protons == 80) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Mercury");
                                    element = "Mercury";
                                }

                                else if (protons == 81) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Thallium");
                                    element = "Thallium";
                                }

                                else if (protons == 82) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Lead");
                                    element = "Lead";
                                }

                                else if (protons == 83) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Bismuth");
                                    element = "Bismuth";
                                }

                                else if (protons == 84) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Polonium");
                                    element = "Polonium";
                                }

                                else if (protons == 85) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Astatine");
                                    element = "Astatine";
                                }

                                else if (protons == 86) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Radon");
                                    element = "Radon";
                                }

                                else if (protons == 87) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Francium");
                                    element = "Francium";
                                }

                                else if (protons == 88) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Radium");
                                    element = "Radium";
                                }

                                else if (protons == 89) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Actinium");
                                    element = "Actinium";
                                }

                                else if (protons == 90) {
                                    Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                    elementbutton.setText("Thorium");
                                    element = "Thorium";
                                }

                                else{
                                    elementbutton.setText("Unknown");
                                }

                            }
                            break;
                        }
                        return true;
                }

            };

        }









