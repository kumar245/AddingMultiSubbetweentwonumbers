package kumar.addingmultisubbetweentwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
   EditText result;
    Button b1,b2,b3,b4;

    int num1;
    int num2;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        result=(EditText) findViewById(R.id.editText3);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);

    }

    public void Add(View view) {
num1=Integer.parseInt(e1.getText().toString());
        num2=Integer.parseInt(e2.getText().toString());
       sum=num1+num2;
        result.setText(Integer.toString(sum));

    }

    public void btn2(View view) {
    }

    public void btn3(View view) {
    }


    public void btn4(View view) {
    }
}
