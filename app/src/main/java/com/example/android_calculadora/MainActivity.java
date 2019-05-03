package com.example.android_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public int num;

    public EditText pantalla1, pantalla2;
    public Button btnMC, btnMR, btnMmas, btnMenos, btnMS, btnM, btnPorcentaje, btnRaiz, btnPotencia, btnDivisionx;
    public Button btnCE, btnC, btnBorrar, btnDivision, btn7, btn8, btn9, btnMultiplicacion;
    public Button btn4, btn5, btn6, btnResta, btn1, btn2, btn3, btnSuma;
    public Button btnMasmenos, btn_cero, btnPunto, btnIgual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla2 = findViewById(R.id.pantalla2);
        pantalla1 = findViewById(R.id.pantalla1);
        num = 0;

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener((View.OnClickListener) this);


        btnMC = findViewById(R.id.btnMC);
        btnMC.setOnClickListener((View.OnClickListener) this);
        btnMR = findViewById(R.id.btnMR);
        btnMR.setOnClickListener((View.OnClickListener) this);
        btnMmas = findViewById(R.id.btnMmas);
        btnMmas.setOnClickListener((View.OnClickListener) this);
        btnMenos = findViewById(R.id.btnMmenos);
        btnMenos.setOnClickListener((View.OnClickListener) this);
        btnMS = findViewById(R.id.btnMS);
        btnMS.setOnClickListener((View.OnClickListener) this);
        btnM = findViewById(R.id.btnM);
        btnM.setOnClickListener((View.OnClickListener) this);

        btnPorcentaje = findViewById(R.id.btnPorcentaje);
        btnPorcentaje.setOnClickListener((View.OnClickListener) this);
        btnRaiz = findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener((View.OnClickListener) this);
        btnPotencia = findViewById(R.id.btnPotencia);
        btnPotencia.setOnClickListener((View.OnClickListener) this);
        btnDivisionx= findViewById(R.id.btnDivisionX);
        btnDivisionx.setOnClickListener((View.OnClickListener) this);

        btnCE = findViewById(R.id.btnCE);
        btnCE.setOnClickListener((View.OnClickListener) this);
        btnC = findViewById(R.id.btnC);
        btnC.setOnClickListener((View.OnClickListener) this);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener((View.OnClickListener) this);
        btnDivision = findViewById(R.id.btnDivision);
        btnDivision.setOnClickListener((View.OnClickListener) this);

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener((View.OnClickListener) this);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnMultiplicacion.setOnClickListener((View.OnClickListener) this);

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener((View.OnClickListener) this);
        btnResta = findViewById(R.id.btnResta);
        btnResta.setOnClickListener((View.OnClickListener) this);


        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener((View.OnClickListener) this);
        btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener((View.OnClickListener) this);

        btnMasmenos = findViewById(R.id.btnMasMenos);
        btnMasmenos.setOnClickListener((View.OnClickListener) this);
        btn_cero = findViewById(R.id.btnCero);
        btn_cero.setOnClickListener((View.OnClickListener) this);
        btnPunto = findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener((View.OnClickListener) this);
        btnIgual = findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener((View.OnClickListener) this);
    }

   public void onClick(View v) {
        int click = v.getId();
        String res = "";
        res = res + pantalla1.getText();

        if(click == R.id.btn1) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"1");
           }
       }

       if(click == R.id.btn2) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"2");
           }
       }

       if(click == R.id.btn3) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"3");
           }
       }

       if(click == R.id.btn4) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"4");
           }
       }

       if(click == R.id.btn5) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"5");
           }
       }

       if(click == R.id.btn6) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"6");
           }
       }

       if(click == R.id.btn7) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"7");
           }
       }

       if(click == R.id.btn8) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"8");
           }
       }

       if(click == R.id.btn9) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"9");
           }
       }

       if(click == R.id.btnCero) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+"0");
           }
       }

       if(click == R.id.btnPunto) {
           if(pantalla1.getText().equals("0") ) {
               pantalla1.setText("0");
           } else {
               pantalla1.setText(res+".");
           }
       }


    }

}
