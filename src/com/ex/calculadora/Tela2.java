package com.ex.calculadora;

// importa a classe R do pacote do projeto
import com.ex.calculadora.R;

import android.app.Activity;
import android.os.Bundle;

public class Tela2 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// chama a tela2 do xml
		setContentView(R.layout.tela2);
	}

}
