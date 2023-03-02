package com.example.examen_sg_tr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isGone
import com.example.examen_sg_tr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        super.onCreate(savedInstanceState)

        binding.alerta.isGone = true

        var pelicula = Movie("titulo", 0, "", 0, false)
        pelicula.setTitulo("ejemplo")
        binding.siguiente.setOnClickListener{

            if (binding.titulo.text.isEmpty() || binding.duracion.text.isEmpty()){
                binding.alerta.isGone = false
            }else {
                binding.alerta.isGone = true
                pelicula.setTitulo(binding.titulo.text.toString())
                pelicula.setDuracion(binding.duracion.text.toString().toInt())
                /*
                ---.aply{
                ---    "titulo", binding.titulo.text.toString
                 ---   "duracion", binding.duracion.text.toString
                }
                 */
            }
        }
        binding.favorito.setOnClickListener{
            //pelicula.setFavorito(true)
        }




    }
}




