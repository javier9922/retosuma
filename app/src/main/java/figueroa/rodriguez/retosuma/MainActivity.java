package figueroa.rodriguez.retosuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android .widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button suma = (Button)findViewById(R.id.btn);
        suma.setOnClickListener(OkListener);
    }

    private View.OnClickListener OkListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            calcularSuma();
        }
    };

    public void calcularSuma(){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        int intNum1 = Integer.parseInt(num1.getText().toString());
        int intNum2 = Integer.parseInt(num2.getText().toString());
        int totalSuma = intNum1 + intNum2;
        Toast.makeText(this, "El resultado de la suma: " + totalSuma,Toast.LENGTH_LONG).show();
        }
    }