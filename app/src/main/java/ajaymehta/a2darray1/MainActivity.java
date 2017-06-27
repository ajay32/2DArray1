package ajaymehta.a2darray1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   static TextView array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        array = (TextView) findViewById(R.id.tv_array);

        MyArray myArray = new MyArray();

        myArray.addingValues();
        myArray.print(this);
    }
}
