package ma.ac.uit.ensa.listeviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public void addList()
    {
        ListView list = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<Integer> arrayAdapter ;
        ArrayList<Integer> items = new ArrayList<Integer>();

        for (int i =0; i<20; i++)
        {
            items.add(i);
        }

        arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.simpleitem, items);

        list.setAdapter(arrayAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              // do something
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addList();
    }
}
