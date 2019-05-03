package com.example.android_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public EditText entrada, lectura;
    public Button btnMC, btnMR, btnMmas, btnMenos, btnMS, btnM, btnPorcentaje, btnRaiz, btnPotencia, btnDivisionx;
    public Button btnCE, btnC, btnBorrar, btnDivision, btn7, btn8, btn9, btnMultiplicacion;
    public Button btn4, btn5, btn6, btnResta, btn1, btn2, btn3, btnSuma;
    public Button btnMasmenos, btn_cero, btnPunto, btnIgual;

    byte botonPulsado=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lectura = findViewById(R.id.lectura);
        entrada = findViewById(R.id.entrada);

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

        btnPorcentaje = findViewById(R.id.btnResiduo);
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

       if (click == R.id.btn1) {
           entrada.setText(entrada.getText() + "1");
       }

       if (click == R.id.btn2) {
           entrada.setText(entrada.getText() + "2");
       }

       if (click == R.id.btn3) {
           entrada.setText(entrada.getText() + "3");
       }

       if (click == R.id.btn4) {
           entrada.setText(entrada.getText() + "4");
       }

       if (click == R.id.btn5) {
           entrada.setText(entrada.getText() + "5");
       }

       if (click == R.id.btn6) {
           entrada.setText(entrada.getText() + "6");
       }

       if (click == R.id.btn7) {
           entrada.setText(entrada.getText() + "7");
       }

       if (click == R.id.btn8) {
           entrada.setText(entrada.getText() + "8");
       }

       if (click == R.id.btn9) {
           entrada.setText(entrada.getText() + "9");
       }

       if (click == R.id.btnCero) {
           entrada.setText(entrada.getText() + "0");
       }

       if (click == R.id.btnPunto) {
           int cont = 0;
           for (int i = 0; i < entrada.getText().length(); i++) {
               if (entrada.getText().toString().substring(i, i + 1).equals(".")) {
                   cont++;
               }
           }

           if (cont == 0) {
               entrada.setText(entrada.getText() + ".");
           }
       }
       double num1 = 0, num2 = 0;
       if (click == R.id.btnSuma) {
           botonPulsado=1;
           if (lectura.getText().toString().equals("")) {
               num2 = 0;
           } else {
               num2 = Double.parseDouble(lectura.getText().toString());
           }

           num1 = Double.parseDouble(entrada.getText().toString());
           double resp = num2 + num1;
           entrada.setText("");
           lectura.setText(String.valueOf(resp));

       }

       if (click == R.id.btnResta) {
           botonPulsado=2;
           if (lectura.getText().toString().equals("")) {
               num2 = 0;
           } else {
               num2 = Double.parseDouble(lectura.getText().toString());
           }

           num1 = Double.parseDouble(entrada.getText().toString());
           double resp = num1 - num2;
           entrada.setText("");
           lectura.setText(String.valueOf(resp));
       }

       if (click == R.id.btnMultiplicacion) {
           botonPulsado=3;
           if(lectura.getText().toString().equals("")) {
               num1=1;
           }else {
               num1=Double.parseDouble(lectura.getText().toString());
           }
           if(entrada.getText().toString().equals("")) {
               num2=1;
           }else {
               num2=Double.parseDouble(entrada.getText().toString());
           }
           double res= num1*num2;
           lectura.setText(String.valueOf(res));
           entrada.setText("");
       }

       if (click == R.id.btnDivision) {
           botonPulsado=4;
           if(lectura.getText().toString().equals("")) {
               double x=Double.parseDouble(entrada.getText().toString())*Double.parseDouble(entrada.getText().toString());
               lectura.setText(String.valueOf(x));
               entrada.setText(entrada.getText().toString());
           }

           num1=Double.parseDouble(lectura.getText().toString());
           num2=Double.parseDouble(entrada.getText().toString());
           double res=num1/num2;
           lectura.setText(String.valueOf(res));
           entrada.setText("");

       }

       if (click == R.id.btnRaiz) {
           if(entrada.getText().toString().equals("")){
               entrada.setText("0");
           }else {
               num1 = Double.parseDouble(entrada.getText().toString());
               double resp = Math.sqrt(num1);
               entrada.setText(String.valueOf(resp));
           }
       }

       if(click==R.id.btnDivisionX){
           if(entrada.getText().toString().equals("")){
               entrada.setText("0");
           }else{
               num1 = Double.parseDouble(entrada.getText().toString());
               double res = 1 / num1;
               entrada.setText(String.valueOf(res));
           }
       }

       if(click==R.id.btnResiduo){
           botonPulsado=5;
          if(lectura.getText().toString().equals("")){
              lectura.setText(entrada.getText().toString());
              entrada.setText("");
          }else{
              num1 = Double.parseDouble(lectura.getText().toString());
              num2 = Double.parseDouble(entrada.getText().toString());
              double res = num1 % num2;
              entrada.setText(String.valueOf(res));
          }
       }

       if(click==R.id.btnPotencia){
           if(entrada.getText().toString().equals("")){
               entrada.setText("0");
           }else {
               num1 = Double.parseDouble(entrada.getText().toString());
               double res = num1 * num1;
               entrada.setText(String.valueOf(res));
           }
       }

       if(click==R.id.btnIgual){
           if(botonPulsado==1) {
               double n1=Double.parseDouble(lectura.getText().toString());
               double n2=Double.parseDouble(entrada.getText().toString());
               double res=n1+n2;
               entrada.setText(String.valueOf(res));
               lectura.setText("");
           }
           if(botonPulsado==2) {
               double n1=Double.parseDouble(lectura.getText().toString());
               double n2=Double.parseDouble(entrada.getText().toString());
               double res=n1-n2;
               entrada.setText(String.valueOf(res));
               lectura.setText("");
           }
           if(botonPulsado==3) {
               double n1=Double.parseDouble(lectura.getText().toString());
               double n2=Double.parseDouble(entrada.getText().toString());
               double res=n1*n2;
               entrada.setText(String.valueOf(res));
               lectura.setText("");
           }

           if(botonPulsado==4) {
               double n1=Double.parseDouble(lectura.getText().toString());
               double n2=Double.parseDouble(entrada.getText().toString());
               double res=n1/n2;
               entrada.setText(String.valueOf(res));
               lectura.setText("");
           }
           if(botonPulsado==5) {
               if(lectura.getText().toString().equals("")){
                   lectura.setText(entrada.getText().toString());
                   entrada.setText("");
               }else{
                   num1 = Double.parseDouble(lectura.getText().toString());
                   num2 = Double.parseDouble(entrada.getText().toString());
                   double res = num1 % num2;
                   entrada.setText(String.valueOf(res));
               }
           }
       }
       if(click==R.id.btnMasMenos){
           double num=Double.parseDouble(entrada.getText().toString())*-1;
           entrada.setText(String.valueOf(num));
       }
       if(click==R.id.btnC){
           lectura.setText("");
           entrada.setText("0");
       }
       if(click==R.id.btnCE){
           entrada.setText("0");
       }
       if(click==R.id.btnBorrar){
           if(entrada.getText().toString().equals("") ){
               entrada.setText("0");
           }else {
               String cadena = entrada.getText().toString();
               cadena = cadena.substring(0, cadena.length() - 1);
               entrada.setText(cadena);
           }
       }


   }

}
