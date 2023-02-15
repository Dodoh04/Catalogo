package br.com.etecia.catalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView idListCamisetas;
    String titulo[] = {};
    String desc1 [] = {};
    String desc2 [] = {};
    String pontos [] = {};
    int Camisetas [] = {R.drawable.camisetaum, R.drawable.camisetadois, R.drawable.camisetatres, R.drawable.camisetaquatro, R.drawable.camisetacinco,
    R.drawable.camisetaseis, R.drawable.camisetasete, R.drawable.camisetaoito};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idListCamisetas = findViewById(R.id.idListCamisetas);
        MyAdapter Adapter = new MyAdapter();
        idListCamisetas.setAdapter(Adapter);

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Camisetas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //variaveis do modelo
            ImageView imagemCamisetas;
            TextView descricao1Camisetas, descricao2Camisetas, pontuacao, tituloCamisetas;

            //adaptador ligando ao modelo

            View v = getLayoutInflater().inflate(R.layout.modelo_camisetas, null);

            //Apresentar as Variaveis do java para o modelo xml3

            imagemCamisetas = v.findViewById(R.id.idImgCamiseta);
            tituloCamisetas = v.findViewById(R.id.idTitulo);
            descricao1Camisetas = v.findViewById(R.id.idDescricao1);
            descricao2Camisetas = v.findViewById(R.id.idDescricao2);
            pontuacao = v.findViewById(R.id.idPontuacao);


            tituloCamisetas.setText(titulo[i]);
            descricao1Camisetas.setText(desc1[i]);
            descricao2Camisetas.setText(desc2[i]);
            pontuacao.setText(pontos[i]);
            imagemCamisetas.setImageResource(Camisetas[i]);

            return v;
        }
    }

}