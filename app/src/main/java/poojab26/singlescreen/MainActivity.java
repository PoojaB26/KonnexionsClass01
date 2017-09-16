package poojab26.singlescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText etName, etPhone;
    String name, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.name);
        etPhone = (EditText)findViewById(R.id.phone);
        btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = etName.getText().toString();
                phone = etPhone.getText().toString();

                Toast.makeText(MainActivity.this, "Hello " + name + "! Your number is " + phone, Toast.LENGTH_LONG).show();
            }
        });


    }
}
