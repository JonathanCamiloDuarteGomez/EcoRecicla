package com.example.ecorecicla;

import static com.example.ecorecicla.VersionAdapter.nFactura;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DetalleFactura extends AppCompatActivity {
    private String[] header;
    private ArrayList<String[]> rows;

    TableDynamic tableDynamic;


    private TableLayout tablaFactura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_factura);

        Button irHistorial = (Button) findViewById(R.id.btnIrAVentanaHistorial);

        //obtengo el numero de factura
        final TextView numFactura;
        numFactura = findViewById(R.id.numFactura_txt);
        numFactura.setText(nFactura);

        header = new String[]{"Id Producto","Nombre","Kg","Valor","Coins","Total"};
        tablaFactura=(TableLayout) findViewById(R.id.tablaFactura);
        rows = new ArrayList<>();

        tableDynamic = new TableDynamic(tablaFactura,getApplicationContext());
        tableDynamic.addHeader(header);
        tableDynamic.addData(getProducto());
        tableDynamic.linearColor();

        irHistorial.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent next = new Intent(DetalleFactura.this, MainActivity.class);
                startActivity(next);
            }
        });
    }

    //este lo voy a usar cuando se agrega un producto a una factura especifica
    public void saveItem(View view){
        String[] item = new String[]{"6","Papel","1000","1000000","100","1000000"};
        tableDynamic.addItems(item);
    }

    private ArrayList<String[]> getProducto() {
        rows.add(new String[]{"1","Carton","1000","1000000","100","1000000"});
        rows.add(new String[]{"2","Plastico","55","5500","55","suma"});
        rows.add(new String[]{"3","Aluminio","2","10000","140","suma"});
        rows.add(new String[]{"4","Carton","10","100","1","suma"});
        rows.add(new String[]{" "," "," "," ","Total ","150000"});
        return rows;
    }

}
