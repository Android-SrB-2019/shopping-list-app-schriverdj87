package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    public static final String SAND = "sand";
    public static final String MILK = "milk";
    public static final String CUTTINGS = "cuttings";
    public static final String WOOL  = "wool";
    public static final String BATTERIES = "batteries";
    public static final String SCONES = "scones";
    public static final String TONGUES = "tongues";
    public static final String GEL = "gel";
    public static final String GLUTEN = "gluten";
    public static final String EGGS = "eggs";


    private int sand = 0;
    private int milk = 0;
    private int cuttings = 0;
    private int wool = 0;
    private int batteries = 0;
    private int scones = 0;
    private int tongues = 0;
    private int gel = 0;
    private int gluten = 0;
    private int eggs = 0;

    private TextView sand_output;
    private TextView milk_output;
    private TextView cutting_output;
    private TextView wool_output;
    private TextView batteries_output;
    private TextView scones_output;
    private TextView tongue_output;
    private TextView gel_output;
    private TextView gluten_output;
    private TextView egg_output;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the text views:
        sand_output = (TextView)findViewById(R.id.sand_output);
        milk_output = (TextView)findViewById(R.id.milk_output);
        cutting_output = (TextView)findViewById(R.id.cutting_output);
        wool_output = (TextView)findViewById(R.id.wool_output);
        batteries_output = (TextView)findViewById(R.id.batteries_output);
        scones_output = (TextView)findViewById(R.id.scones_output);
        tongue_output = (TextView)findViewById(R.id.tongue_output);
        gel_output = (TextView)findViewById(R.id.gel_output);
        gluten_output = (TextView)findViewById(R.id.gluten_output);
        egg_output = (TextView)findViewById(R.id.egg_output);
        output = (TextView)findViewById(R.id.output);

        //Get extras
        if (savedInstanceState != null)
        {
            sand = savedInstanceState.getInt(SAND);
            milk = savedInstanceState.getInt(MILK);
            cuttings = savedInstanceState.getInt(CUTTINGS);
            wool = savedInstanceState.getInt(WOOL);
            batteries = savedInstanceState.getInt(BATTERIES);
            scones = savedInstanceState.getInt(SCONES);
            tongues = savedInstanceState.getInt(TONGUES);
            gel = savedInstanceState.getInt(GEL);
            gluten = savedInstanceState.getInt(GLUTEN);
            eggs = savedInstanceState.getInt(EGGS);
        }



        //Set the text views

        putValues();

    }

    public void putValues()
    {

        sand_output.setText("Sand: " + Integer.valueOf(sand));
        milk_output.setText("Goat Milk: " + Integer.valueOf(milk));
        cutting_output.setText("Host Cuttings: " + Integer.valueOf(cuttings));
        wool_output.setText("Steel Wool: " + Integer.valueOf(wool));
        batteries_output.setText("Batteries: " + Integer.valueOf(batteries));
        scones_output.setText("Scones: " + Integer.valueOf(scones));
        tongue_output.setText("Cow Tongues: " + Integer.valueOf(tongues));
        gel_output.setText("Hair Gel: " + Integer.valueOf(gel));
        gluten_output.setText("Gluten: " + Integer.valueOf(gluten));
        egg_output.setText("Eggs: " + Integer.valueOf(eggs));
    }

    public void launchChoosy(View view) {
        Intent intent = new Intent(this, ItemChoosey.class);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode == TEXT_REQUEST)
        {
            if(resultCode == RESULT_OK)
            {

                String incoming = data.getStringExtra(ItemChoosey.EXTRA_REPLY);

                switch (incoming)
                {
                    case SAND: sand+=1;break;
                    case MILK: milk+=1;break;
                    case CUTTINGS: cuttings+=1;break;
                    case WOOL: wool+=1;break;
                    case BATTERIES: batteries+=1;break;
                    case SCONES: scones+=1;break;
                    case TONGUES: tongues+=1;break;
                    case GEL: gel+=1;break;
                    case GLUTEN: gluten+=1;break;
                    case EGGS: eggs+=1;break;
                    default: break;
                }

                putValues();

            }
        }
    }


    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(SAND,sand);
        outState.putInt(MILK,milk);
        outState.putInt(CUTTINGS,cuttings);
        outState.putInt(WOOL,wool);
        outState.putInt(BATTERIES,batteries);
        outState.putInt(SCONES,scones);
        outState.putInt(TONGUES,tongues);
        outState.putInt(GEL,gel);
        outState.putInt(GLUTEN,gluten);
        outState.putInt(EGGS,eggs);
    }


}
