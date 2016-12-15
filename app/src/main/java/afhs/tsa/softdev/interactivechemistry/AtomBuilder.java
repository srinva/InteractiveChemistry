package afhs.tsa.softdev.interactivechemistry;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AtomBuilder extends AppCompatActivity {

    int protons = 0;
    int electrons = 0; //integer value of electrons
    String element; //String value of element name, will be displayed on button
    TextView drop, state;
    ImageView pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_atom_builder);



        drop = (TextView) findViewById(R.id.drop);
        state = (TextView) findViewById(R.id.state);
        pro = (ImageView) findViewById(R.id.imageView2);

        pro.setOnLongClickListener(longClickListener);
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

                        if (view.getId() == R.id.imageView2) {
                            state.setText("");
                            drop.setBackgroundResource(R.color.colorPrimary);
                            drop.getBackground().setAlpha(50);
                            state.setText("Protons: "+protons);
                        }
                        break;

                    case DragEvent.ACTION_DRAG_ENDED:
                        final View view4 = (View) event.getLocalState();

                        if (view4.getId() == R.id.imageView2) {
                            drop.getBackground().setAlpha(00);
                            state.setText("Protons: "+protons);
                        }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:

                        final View view2 = (View) event.getLocalState();

                        if (view2.getId() == R.id.imageView2) {
                            state.setText("");
                            drop.getBackground().setAlpha(00);
                            state.setText("Protons: "+protons);
                        }
                        break;
                    case DragEvent.ACTION_DROP:

                        final View view3 = (View) event.getLocalState();
                        if (view3.getId() == R.id.imageView2) {

                            protons ++;

                            state.setText("Protons: "+protons);

                            if (protons == 1) {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Hydrogen");
                                element = "Hydrogen";
                                Button goToHydrogen = (Button) findViewById(R.id.elementbutton);
                                goToHydrogen.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(AtomBuilder.this, Hydrogen.class));
                                    }
                                });
                            }

                            if (protons == 2) {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Helium");
                                element = "Helium";
                            }

                            if (protons == 3) {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Lithium");
                                element = "Lithium";
                            }

                            if (protons == 4)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Beryllium");
                                element = "Beryllium";
                            }

                            if (protons == 5)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Boron");
                                element = "Boron";
                            }

                            if (protons == 6)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Carbon");
                                element = "Carbon";
                            }

                            if (protons == 7)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Nitrogen");
                                element = "Nitrogen";
                            }

                            if (protons == 8)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Oxygen");
                                element = "Oxygen";
                            }

                            if (protons == 9)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Flourine");
                                element = "Fluorine";
                            }

                            if (protons == 10)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Neon");
                                element = "Neon";
                            }

                            if (protons == 11)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Sodium");
                                element = "Sodium";
                            }

                            if (protons == 12)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Magnesium");
                                element = "Magnesium";
                            }

                            if (protons == 13)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Aluminium");
                                element = "Aluminium";
                            }

                            if (protons == 14)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Silicon");
                                element = "Silicon";
                            }

                            if (protons == 15)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Phosphorus");
                                element = "Phosphorus";
                            }

                            if (protons == 16)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Sulfur");
                                element = "Sulfur";
                            }

                            if (protons == 17)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Chlorine");
                                element = "Chlorine";
                            }

                            if (protons == 18)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Argon");
                                element = "Argon";
                            }

                            if (protons == 19)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Potassium");
                                element = "Potassium";
                            }

                            if (protons == 20)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Calcium");
                                element = "Calcium";
                            }

                            if (protons == 21)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Scandium");
                                element = "Scandium";
                            }

                            if (protons == 22)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Titanium");
                                element = "Titanium";
                            }

                            if (protons == 23)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Vanadium");
                                element = "Vanadium";
                            }

                            if (protons == 24)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Chromium");
                                element = "Chromium";
                            }

                            if (protons == 25)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Manganese");
                                element = "Manganese";
                            }

                            if (protons == 26)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Iron");
                                element = "Iron";
                            }

                            if (protons == 27)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Cobalt");
                                element = "Cobalt";
                            }

                            if (protons == 28)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Nickel");
                                element = "Nickel";
                            }

                            if (protons == 29)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Copper");
                                element = "Copper";
                            }

                            if (protons == 30)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Zinc");
                                element = "Zinc";
                            }

                            if (protons == 31)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Gallium");
                                element = "Gallium";
                            }

                            if (protons == 32)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Germanium");
                                element = "Germanium";
                            }

                            if (protons == 33)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Arsenic");
                                element = "Arsenic";
                            }

                            if (protons == 34)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Selenium");
                                element = "Selenium";
                            }

                            if (protons == 35)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Bromine");
                                element = "Bromine";
                            }

                            if (protons == 36)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Krypton");
                                element = "Krypton";
                            }

                            if (protons == 37)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Rubidium");
                                element = "Rubidium";
                            }

                            if (protons == 38)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Strontium");
                                element = "Strontium";
                            }

                            if (protons == 39)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Yttrium");
                                element = "Yttrium";
                            }

                            if (protons == 40)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Zirconium");
                                element = "Zirconium,";
                            }

                            if (protons == 41)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Niobium");
                                element = "Niobium";
                            }

                            if (protons == 42)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Molybdenum");
                                element = "Molybdenum";
                            }

                            if (protons == 43)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Technetium");
                                element = "Technetium";
                            }

                            if (protons == 44)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Ruthenium");
                                element = "Ruthenium";
                            }

                            if (protons == 45)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Rhodium");
                                element = "Rhodium";
                            }

                            if (protons == 46)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Palladium");
                                element = "Palladium";
                            }

                            if (protons == 47)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Silver");
                                element = "Silver";
                            }

                            if (protons == 48)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Cadmium");
                                element = "Cadmium";
                            }

                            if (protons == 49)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Indium");
                                element = "Indium";
                            }

                            if (protons == 50)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Tin");
                                element = "Tin";
                            }

                            if (protons == 51)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Antimony");
                                element = "Antimony";
                            }

                            if (protons == 52)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Tellurium");
                                element = "Tellurium";
                            }

                            if (protons == 53)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Iodine");
                                element = "Iodine";
                            }

                            if (protons == 54)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Xenon");
                                element = "Xenon";
                            }

                            if (protons == 55)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Caesium");
                                element = "Caesium";
                            }

                            if (protons == 56)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Barium");
                                element = "Barium";
                            }

                            if (protons == 55)

                            {
                                Button elementbutton = (Button) findViewById(R.id.elementbutton);
                                elementbutton.setText("Lanthanum");
                                element = "Lanthanum";
                            }

                        }
                        break;
                }
                return true;
            }
        };
    }

