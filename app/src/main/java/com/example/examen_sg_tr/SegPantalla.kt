package com.example.examen_sg_tr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isGone
import com.example.examen_sg_tr.databinding.ActivitySegPantallaBinding

class SegPantalla : AppCompatActivity() {

    private lateinit var binding : ActivitySegPantallaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivitySegPantallaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        super.onCreate(savedInstanceState)

        binding.alerta2.isGone = true
        /*
        var bundle = intent.extra

       var titulo = bundle?.getString("titulo")
       var duracion = bundle?.getString("duracion")
         */


        binding.siguiente2.setOnClickListener{

            if (binding.nombre.text.isEmpty() || binding.ano.text.isEmpty()){
                binding.alerta2.isGone = false


            }else {
                binding.alerta2.isGone = true
                /*
            pelicula.setdirector(binding.nombre.text.toString())
            pelicula.setano(binding.ano.text.toString().toInt())
            listaMovies.add(pelicula)

            var intent= --TerPantalla.aply{
            "lista", listaMovies
             }
            startActivity(intent)
            }
             */
            }

        }

        binding.atras2.setOnClickListener{

            /*
            var intent = --- main
            startActivity(intent)
             */
        }
    }
}