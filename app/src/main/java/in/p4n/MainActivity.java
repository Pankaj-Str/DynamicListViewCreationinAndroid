package in.p4n;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class MainActivity extends Activity {

    List<String> li;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout rl=(RelativeLayout) findViewById(R.id.rl);
        final RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams
                ((int)LayoutParams.WRAP_CONTENT,(int)LayoutParams.WRAP_CONTENT);
        params.leftMargin=10;
        params.topMargin=150;

        Button show=(Button) findViewById(R.id.button1);
        final ListView list=new ListView(this);

        li=new ArrayList<String>();
        li.add("List 1");
        li.add("List 2");
        li.add("List 3");
        li.add("List 4");
        li.add("List 5");

        show.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                ArrayAdapter<String> adp=new ArrayAdapter<String> (getBaseContext(),
                        android.R.layout.simple_dropdown_item_1line,li);
                adp.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

                list.setAdapter(adp);
                list.setLayoutParams(params);

                rl.addView(list);
            }
        });
    }


}