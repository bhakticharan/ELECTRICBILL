package com.example.electricbill;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonDiv;
    EditText  editTextN;
    TextView textView;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // ✅ Important: link to the XML layout


        buttonDiv = findViewById(R.id.cal_culate);

        editTextN = findViewById(R.id.number);
        textView = findViewById(R.id.answer);


        buttonDiv.setOnClickListener(this);
    }
    public int getIntFromEditText(EditText editText) {
        String input = editText.getText().toString();

        return Integer.parseInt(input);
    }

    @Override
    public void onClick(View view) {

        num = getIntFromEditText(editTextN);

        int id = view.getId(); // Get the ID once

          if (id == R.id.cal_culate) {
              if(num>50)
              {
                  int num1=num-50;

                  double bill=50*2.9+(float)num1*4.7+42.5;
                  textView.setText("Your payable ampunt is = " +bill+" /-");
              }
              else{
                  double bill=num*2.9+42.5;
                  textView.setText("Your payable amount is= " + bill+" /-");
              }


   }
}


}