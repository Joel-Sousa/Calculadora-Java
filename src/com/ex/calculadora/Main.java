package com.ex.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity{

	//instancia de ednum do xml
	// modificador tipo nome da variavel
	private	EditText edNum1;
	private	EditText edNum2;
	private	Button btSoma;
	private	EditText edSoma;

	//cria o Menu do projeto ou opcoes
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main,menu);
		return true;
	}
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {

		switch(item.getItemId()){
		case R.id.mntela1:
			Toast.makeText(this,"Item 1 clicado",Toast.LENGTH_SHORT).show();
			break;
		case R.id.mntela2:
			Toast.makeText(this,"Item 2 clicado",Toast.LENGTH_SHORT).show();
			break;
		case R.id.mntela3:
			Toast.makeText(this,"Item 3 clicado",Toast.LENGTH_SHORT).show();
			break;
		}

		return super.onMenuItemSelected(featureId, item);
	}
	protected void onCreate(Bundle save){
		super.onCreate(save);



		//A classe R faz referencia aos resoucers
		setContentView(R.layout.main);
		//capiturando o id no arquivo main.xml
		// (EditText)(Button) => cast, demostra o tipo de tag 
		// no arquivo main.xml
		edNum1 = (EditText)findViewById(R.id.ednum1);
		edNum2 = (EditText)findViewById(R.id.ednum2);
		edSoma = (EditText)findViewById(R.id.edsoma);
		btSoma = (Button) findViewById(R.id.btsoma);

		// guarda numa variavel e exibe mensagens para o usuario
		Toast t = Toast.makeText(this,"mensagem",Toast.LENGTH_SHORT);
		// pede para imprimir
		t.show();

		// pressionar o botao para exibir a msg
		Button btn;

		btn = (Button)findViewById(R.id.bttoast);
		btn.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast k = Toast.makeText(v.getContext(), "hiiiii", Toast.LENGTH_SHORT);
				k.show();
			}
		});

		//leva para a tela 2
		Button btn2;
		btn2 = (Button)findViewById(R.id.tela2);

		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// chama a tela2.xml
				Intent i = new Intent(v.getContext(),Tela2.class);
				startActivity(i);
				//sempre que criar uma nova tela ou activit fazer referencia a ela
				//dentro do arquivo AndroidMainifest.xml
			}
		});
	}
	// pega os dois valores dos edit text e soma eles
	public void facaSoma(View v){
		int x,y;
		x = Integer.valueOf(edNum1.getText().toString());
		y = Integer.valueOf(edNum2.getText().toString());
		
		int soma = x + y;
		
		edSoma.setText(String.valueOf( soma));
	}
}