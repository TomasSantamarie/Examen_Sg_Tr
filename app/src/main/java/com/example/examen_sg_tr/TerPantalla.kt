package com.example.examen_sg_tr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen_sg_tr.databinding.ActivityTerPantallaBinding

class TerPantalla : AppCompatActivity() {
    private lateinit var binding: ActivityTerPantallaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityTerPantallaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        super.onCreate(savedInstanceState)

        /*
        var bundle = intent.extra
       var lista = bundle?.getString("lista")

       binding.listado.setText(lista)
         */

        binding.atras3.setOnClickListener{

            /*
            var intent = --- SegPantalla
            startActivity(intent)
             */
        }
        binding.Nueva.setOnClickListener{
            /*
            var intent = --- MainActivity
            startActivity(intent)
             */
        }
        binding.favoritas.setOnClickListener{
            /*
            var intent= --FavoriteMoviesActivity.aply{
               --- "lista", listaMovies
            }

             */
        }

    }


}