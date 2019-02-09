package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ItemChoosey extends AppCompatActivity {

    public static final String EXTRA_REPLY = "ca.nbcc.shoppinglist.extra.REPLY";

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_choosey);
        output = (TextView)findViewById(R.id.output);
    }

    public void moreSand(View view) {

        genericFinish(MainActivity.SAND);

    }

    public void moreMilk(View view) {

        genericFinish(MainActivity.MILK);

    }

    public void moreCuttings(View view) {

        genericFinish(MainActivity.CUTTINGS);

    }

    public void moreWool(View view) {

        genericFinish(MainActivity.WOOL);

    }

    public void moreBatteries(View view) {

        genericFinish(MainActivity.BATTERIES);

    }

    public void moreScones(View view) {

        genericFinish(MainActivity.SCONES);

    }

    public void moreTongues(View view) {

        genericFinish(MainActivity.TONGUES);

    }


    public void moreGel(View view) {

        genericFinish(MainActivity.GEL);

    }

    public void moreGluten(View view) {

        genericFinish(MainActivity.GLUTEN);

    }

    public void moreEggs(View view) {

        genericFinish(MainActivity.EGGS);

    }

    public void genericFinish(String toPut)
    {
        Intent toSend = new Intent();
        toSend.putExtra(EXTRA_REPLY,toPut);
        setResult(RESULT_OK,toSend);
        finish();
    }
}
