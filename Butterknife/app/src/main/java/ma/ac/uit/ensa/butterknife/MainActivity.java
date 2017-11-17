package ma.ac.uit.ensa.butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    EditText username;

    @BindView(R.id.editText2)
    EditText password;

    @BindView(R.id.button)
    Button loginbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void onButtonClicked(View view)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}