package ma.ac.uit.ensa.complexlistviewitems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void addList()
    {
        ArrayList<Complex_Objects> ComplexObjects_Array = new ArrayList<>();
        for (int i =0; i<10; i++)
        {
            ComplexObjects_Array.add(new Complex_Objects(null, null, null));
//            tableau  = new complexTextView(getApplicationContext(),i, ComplexObjects_Array);
        }

        ListView list = (ListView)findViewById(R.id.listView1);
        complexTextView tableau  = new complexTextView(this, ComplexObjects_Array);

        list.setAdapter(tableau);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                call4thActivity(view);
            }
        });
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        addList();
    }





    public void call4thActivity(View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
