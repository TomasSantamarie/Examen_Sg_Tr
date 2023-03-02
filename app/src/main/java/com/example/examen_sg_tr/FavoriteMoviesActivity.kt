package com.example.examen_sg_tr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen_sg_tr.databinding.ActivityFavoriteMoviesBinding
import com.example.examen_sg_tr.databinding.ActivityMainBinding

class FavoriteMoviesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoriteMoviesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityFavoriteMoviesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        super.onCreate(savedInstanceState)

        /*
        var bundle = intent.extra
        var lista = bundle?.getString("lista")

        binding.listado.setText(lista)
         */

        //var aux = listamovies.lista.count()

        /*
        var listanueva = listMovies()
        bucle con el bucle de cero a aux{

        if(listaMovies[i].getFavorito()==True)
            listanueva.addPelicula(listaMovies[i])
         }
         binding.listaFavorita.setText(listanueva)


         binding.volver.setOnClickListener{
            /*
            var intent = --- TerPantalla
            startActivity(intent)
             */
        }

         */


    }




}