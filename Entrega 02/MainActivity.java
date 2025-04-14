package com.example.reajustesalarial;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSalario;
    RadioGroup rgPercentual;
    Button btnCalcular;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSalario = findViewById(R.id.edtSalario);
        rgPercentual = findViewById(R.id.rgPercentual);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String salarioStr = edtSalario.getText().toString();

                if (salarioStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, getString(R.string.erro), Toast.LENGTH_SHORT).show();
                    return;
                }

                double salario = Double.parseDouble(salarioStr);
                double percentual = 0;

                int checkedId = rgPercentual.getCheckedRadioButtonId();

                if (checkedId == R.id.rb40) {
                    percentual = 0.40;
                } else if (checkedId == R.id.rb45) {
                    percentual = 0.45;
                } else if (checkedId == R.id.rb50) {
                    percentual = 0.50;
                }

                double novoSalario = salario + (salario * percentual);
                txtResultado.setText("Novo salário: R$ " + String.format("%.2f", novoSalario));
            }
        });
    }
}
