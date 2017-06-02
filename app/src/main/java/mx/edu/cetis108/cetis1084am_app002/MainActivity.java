package mx.edu.cetis108.cetis1084am_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Sumar(View x){
        TextView txtResultado=(TextView)findViewById(R.id.txtResultado);
        EditText txdNum1=(EditText)findViewById(R.id.txdNum1);
        EditText txdNum2=(EditText)findViewById(R.id.txdNum2);
        int Num1,Num2,result;
        Num1=Integer.parseInt(txdNum1.getText().toString());
        Num2=Integer.parseInt(txdNum2.getText().toString());
        result= Num1+Num2;
        txtResultado.setText(Integer.toString(result));
    }
    public void Restar(View x){
        TextView txtResultado=(TextView)findViewById(R.id.txtResultado);
        EditText txdNum1=(EditText)findViewById(R.id.txdNum1);
        EditText txdNum2=(EditText)findViewById(R.id.txdNum2);
        int Num1,Num2,result;
        Num1=Integer.parseInt(txdNum1.getText().toString());
        Num2=Integer.parseInt(txdNum2.getText().toString());
        result= Num1-Num2;
        txtResultado.setText(Integer.toString(result));
    }
    public void Multiplicar(View x) {
        TextView txtResultado=(TextView)findViewById(R.id.txtResultado);
        EditText txdNum1=(EditText)findViewById(R.id.txdNum1);
        EditText txdNum2=(EditText)findViewById(R.id.txdNum2);
        int Num1,Num2,result;
        Num1=Integer.parseInt(txdNum1.getText().toString());
        Num2=Integer.parseInt(txdNum2.getText().toString());
        result= Num1*Num2;
        txtResultado.setText(Integer.toString(result));
    }
    public void Dividir(View x){
        TextView txtResultado=(TextView)findViewById(R.id.txtResultado);
        EditText txdNum1=(EditText)findViewById(R.id.txdNum1);
        EditText txdNum2=(EditText)findViewById(R.id.txdNum2);
        int Num1,Num2,result;
        Num1=Integer.parseInt(txdNum1.getText().toString());
        Num2=Integer.parseInt(txdNum2.getText().toString());
        result= Num1/Num2;
        txtResultado.setText(Integer.toString(result));
    }

}

