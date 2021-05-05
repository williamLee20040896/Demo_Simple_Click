package sg.rp.edu.c346.id20040896.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tgButton;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextTextPersonName);
        tvDisplay = findViewById(R.id.textViewDisplay);
        tgButton = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroup);




        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                String stringResponse = "";
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    stringResponse = getString(R.string.he_say) + " " +   etInput.getText().toString();


                }
                else{
                    // Write the code when female selected
                    stringResponse = getString(R.string.she_say) + " " + etInput.getText().toString();

                }
                tvDisplay.setText(stringResponse);




            }
        });
        tgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tgButton.isChecked()){
                    etInput.setEnabled(true);

                }
                else{
                    etInput.setEnabled(false);
                }



            }
        });
    }
}