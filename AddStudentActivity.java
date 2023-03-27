package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddStudentActivity extends AppCompatActivity {
    private EditText firstNameInput;
    private EditText lastNameInput;
    private EditText emailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        firstNameInput = findViewById(R.id.editTextFirstName);
        lastNameInput = findViewById(R.id.editTextLastName);
        emailInput = findViewById(R.id.editTextEmail);

    }

    public void AddUser(View view) {
        RadioGroup rgDegreeType = findViewById(R.id.radioGroup);
        String degree;
        switch (rgDegreeType.getCheckedRadioButtonId()){
            case R.id.rbTite:
                degree = "Tietotekniikka";
                RadioGroup rgImageType = findViewById(R.id.rgImage);
                switch (rgImageType.getCheckedRadioButtonId()) {
                    case R.id.rbPig:
                        User userPig = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.possu);
                        UserStorage.getInstance().addUser(userPig);
                        break;
                    case R.id.rbChicken:
                        User userChicken = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.kana);
                        UserStorage.getInstance().addUser(userChicken);
                        break;
                }
                break;
            case R.id.rbTuta:
                degree = "Tuotantotalous";
                RadioGroup rgImageType2 = findViewById(R.id.rgImage);
                switch (rgImageType2.getCheckedRadioButtonId()) {
                    case R.id.rbPig:
                        User userPig = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.possu);
                        UserStorage.getInstance().addUser(userPig);
                        break;
                    case R.id.rbChicken:
                        User userChicken = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.kana);
                        UserStorage.getInstance().addUser(userChicken);
                        break;
                }
                break;
            case R.id.rbLate:
                degree = "Laskennallinen tekniikka";
                RadioGroup rgImageType3 = findViewById(R.id.rgImage);
                switch (rgImageType3.getCheckedRadioButtonId()) {
                    case R.id.rbPig:
                        User userPig = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.possu);
                        UserStorage.getInstance().addUser(userPig);
                        break;
                    case R.id.rbChicken:
                        User userChicken = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.kana);
                        UserStorage.getInstance().addUser(userChicken);
                        break;
                }
                break;
            case R.id.rbSate:
                degree = "Sähkötekniikka";
                RadioGroup rgImageType4 = findViewById(R.id.rgImage);
                switch (rgImageType4.getCheckedRadioButtonId()) {
                    case R.id.rbPig:
                        User userPig = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.possu);
                        UserStorage.getInstance().addUser(userPig);
                        break;
                    case R.id.rbChicken:
                        User userChicken = new User(firstNameInput.getText().toString(), lastNameInput.getText().toString(), emailInput.getText().toString(), degree, R.drawable.kana);
                        UserStorage.getInstance().addUser(userChicken);
                        break;
                }
                break;
        }


    }

}
