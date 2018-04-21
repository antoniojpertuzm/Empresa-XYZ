package com.example.a15_x555.empresaxyz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.a15_x555.empresaxyz.metodo.calcular;

public class Principal extends AppCompatActivity {

    private Spinner spsexo;

    private Spinner Sptipozapato;
    private Spinner spmarca;
    private EditText cantidad;
    private  TextView resultado;
    private String opctipozapato [];

    private String opcmarca [];
    private String opcsexo [];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        spsexo =findViewById(R.id.spinnerSexo);
        Sptipozapato= findViewById(R.id.spinnertipozapato);
        spmarca= findViewById(R.id.spinnermarca);
        cantidad= findViewById(R.id.idcantidad);
        resultado = findViewById(R.id.txtresultado);
        opctipozapato =this.getResources().getStringArray(R.array.tipozapato);
        opcmarca= this.getResources().getStringArray(R.array.marca);
        opcsexo= this.getResources().getStringArray(R.array.tiposexo);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,opctipozapato);
        ArrayAdapter<String> adapter1=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,opcmarca);
        ArrayAdapter<String> adapter2=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,opcsexo);
        Sptipozapato.setAdapter(adapter);
        spmarca.setAdapter(adapter1);
        spsexo.setAdapter(adapter2);


        }



   public void calcular2 (View v){

            int sexoselecionado, tipozapatoselec, marcaselescionada, cantidadselescionada, resultadocalcular = 0;

       if (validar()) {
            sexoselecionado = spsexo.getSelectedItemPosition();
            tipozapatoselec = Sptipozapato.getSelectedItemPosition();
            marcaselescionada = spmarca.getSelectedItemPosition();
            cantidadselescionada = Integer.parseInt(cantidad.getText().toString());
            resultadocalcular = calcular(sexoselecionado, tipozapatoselec, marcaselescionada, cantidadselescionada);
            this.resultado.setText("" + resultadocalcular);
        }

   }


   public boolean validar(){

        if(cantidad.getText().toString().isEmpty()){
            cantidad.requestFocus();
            cantidad.setError(this.getResources().getString(R.string.error_uno));

            return  false;
        }
        return true;
   }


}





