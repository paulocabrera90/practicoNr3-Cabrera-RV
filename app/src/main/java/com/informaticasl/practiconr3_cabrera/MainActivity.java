package com.informaticasl.practiconr3_cabrera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.informaticasl.practiconr3_cabrera.modelo.Pelicula;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPelicula;
    private PeliculaAdapter peliculaAdapter;
    private Toast miToast;
    private static final int LISTA_NUM = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPelicula = findViewById(R.id.rvContenedorPeli);
        rvPelicula.addItemDecoration(new DividerItemDecoration(this , DividerItemDecoration.VERTICAL));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvPelicula.setLayoutManager(linearLayoutManager);
        peliculaAdapter = new PeliculaAdapter(this.peliculasList(), this, getLayoutInflater());
        rvPelicula.setAdapter(peliculaAdapter);

    }

    public void onListItemClick(int clickedItem) {

        if(miToast != null){
            miToast.cancel();
        }
        String  mensajeToast = "Item "+ clickedItem + " clickeado";
        miToast = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        miToast.show();
    }


    public ArrayList<Pelicula> peliculasList (){
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        peliculas.add(new Pelicula("Spider-Man: No Way Home","Spider-Man: No Way Home1\u200B (titulada Spider-Man: Sin camino a casa en " +
                "Hispanoamérica) es una próxima película estadounidense de superhéroes basada en el personaje de Marvel Comics, Spider-Man, " +
                "coproducida por Columbia Pictures y Marvel Studios, y distribuida por Sony Pictures Releasing. Será la secuela de Spider-Man: " +
                "Homecoming (2017) y Spider-Man: Far From Home (2019), y la película número 27 en el Universo cinematográfico de Marvel (MCU). " +
                "La película es dirigida por Jon Watts, escrita por Chris McKenna y Erik Sommers, y protagonizada por Tom Holland como Peter" +
                " Parker/Spider-Man, junto a Zendaya, Benedict Cumberbatch, Jon Favreau, Jacob Batalon, Marisa Tomei, J. B. Smoove, Benedict Wong, Willem " +
                "Dafoe, Alfred Molina y Jamie Foxx.",2021, R.drawable.spiderman, "Tom Holland, Zendaya, Marisa Tomei, Jacob Batalon, Tony Revolori" +
                "Benedict Cumberbatch, Alfred Molina, Jamie Foxx", "Superheroes, accion, fantasia y ciencia ficcion"));
        peliculas.add(new Pelicula("Matrix 4","Los detalles sobre la trama de Matrix 4 se están guardando bajo llave y con el mayor de los recelos, " +
                "aunque el número incluido en el título sugiere, por el momento, que nos encontramos ante una continuación directa de The Matrix Revolutions. " +
                "La directora Lana Wachowski no ha querido adelantar nada de la trama y sin dudas es lo mejor, aunque seguramente antes del estreno tengamos " +
                "algún tráiler que de pistas sobre que veremos en la cinta.",2021, R.drawable.matrix ,"Keanu Reeves, Carrie-Anne Moss, Yahya Abdul-Mateen II," +
                "Jessica Henwick, Jonathan Groff","Accion, fantasia y ciencia ficcion"));
        peliculas.add(new Pelicula("The Purge","Después de una crisis económica en los Estados Unidos y América Latina que " +
                "conllevó a la caída del Partido Demócrata y el Partido Republicano, un gobierno totalitario asumió el poder en Estados " +
                "Unidos tras su triunfo en las elecciones, estableciendo una dictadura totalitaria: todos los movimientos políticos han " +
                "sido cerrados por el gobierno y el país se ha sumergido en un régimen de terror. Sin embargo, la tasa de desempleo y " +
                "a delincuencia se ha reducido a solo el 1% y la economía es la más alta de todos los tiempos, debido a que, después de " +
                "la enmienda constitucional número 28 ratificada en 2017, se crea La Purga anual. Durante ese tiempo, todo delito conocido " +
                "es legal y todos los servicios (policía, bomberos y hospitales) están cerrados. Se afirma que esto actúa como una catarsis " +
                "para los ciudadanos, pero en realidad se utiliza como método artificial de control poblacional, en el que las personas más " +
                "pobres y sin hogar son eliminadas.",2021, R.drawable.purge," Ethan Hawke, Lena Headey, Max Burkholder, Adelaide Kane y Edwin Hodge", "Superheroes, accion, fantasia y ciencia ficcion"));
        peliculas.add(new Pelicula("Black Widow","    Black Widow (Viuda Negra en España) es una película" +
                " de superhéroes estadounidense de 2021 basada en el personaje de Marvel Comics del mismo nombre. Producida " +
                "por Marvel Studios y distribuida por Walt Disney Studios Motion Pictures, es la vigésimo cuarta película en el " +
                "Universo cinematográfico de Marvel (MCU, por sus siglas en inglés). La película fue dirigida por Cate Shortland y " +
                "escrita por Eric Pearson a partir de una historia de Jac Schaeffer y Ned Benson, y está protagonizada por Scarlett " +
                "Johansson como Natasha Romanoff/Black Widow junto a Florence Pugh, David Harbour, O. T. Fagbenle, Olga Kurylenko, William " +
                "Hurt, Ray Winstone y Rachel Weisz. Ambientada después de Capitán América: Civil War (2016), la película sigue a Romanoff " +
                "huyendo de la justicia y obligada a enfrentarse a su pasado.",2021, R.drawable.bwidow,"Scarlett Johansson, Florence Pugh, David Harbour, O. T. Fagbenle, Olga Kurylenko, " +
                "William Hurt, Ray Winstone y Rachel Weisz", "Superheroes, accion, fantasia y ciencia ficcion"));
        peliculas.add(new Pelicula("Jumanji","La película empieza en 1869, cuando dos chicos entierran un cofre cerca de Brantford, " +
                "Nueva Hampshire, preocupados de deshacerse de su contenido y de que este nunca sea hallado por nadie, pero si alguien lo encuentra " +
                "le piden a Dios que se apiade de su alma. Un siglo después, en 1969, un niño de 12 años, Alan Parrish (Adam Hann-Byrd), huye de un grupo " +
                "de chicos y entra en la fábrica de calzados de su padre, Sam Parrish y se encuentra con su amigo Carl Bentley, un empleado de su padre quien " +
                "le muestra un nuevo diseño de zapato deportivo suyo. Alan daña accidentalmente una máquina con el prototipo de zapatilla de deporte que Carl " +
                "esperaba presentar a Sam. Cuando Carl descubre lo sucedido se echa la culpa y hace que el Sr. Parrish lo despida. Fuera de la fábrica, Alan se " +
                "encuentra con la pandilla de chicos que lo seguía, los cuales lo golpean y le roban su bicicleta. Alan empieza a escuchar sonidos de tambores tribales " +
                "en una obra de construcción cercana y encuentra el cofre enterrado, que contiene un juego de mesa, que en realidad es mágico, " +
                "llamado Jumanji.",2021, R.drawable.jumanji ," Robin Williams, Bonnie Hunt, Kirsten Dunst y Bradley Pierce","Accion,comica, fantasia y ciencia ficcion"));

        return peliculas;
    }


}


