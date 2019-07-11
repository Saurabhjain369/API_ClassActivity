package com.example.classactivity2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;



import org.w3c.dom.Text;

public class Pokemondesc extends AppCompatActivity {


    ImageView pimg;
    TextView pname,pdesc,type,ability,height,weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_desc);

        pimg= findViewById(R.id.desc_pim00g);
        pname= findViewById(R.id.desc_pname);
        pdesc =  findViewById(R.id.desc_pdesc);
        type= findViewById(R.id.type);
        ability= findViewById(R.id.ability);
        height =  findViewById(R.id.height);
        weight =  findViewById(R.id.weight);


        Intent i = getIntent();

        Pokemon p = i.getParcelableExtra("data");

        String name = p.getPname();

        System.out.println("ProductDesc "+p.getPimg());

        Picasso.get().load(p.getPimg()).into(pimg);

        pname.setText(p.getPname());
        pdesc.setText(p.getDesc());
        type.setText(p.getType());
        ability.setText(p.getAbility());
        height.setText(p.getHeight());
        weight.setText(p.getWeight());


        System.out.println("This is from products page: "+name);
    }
}
