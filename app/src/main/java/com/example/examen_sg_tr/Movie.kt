package com.example.examen_sg_tr

class Movie(titulo: String, duracion: Int, director: String, ano: Int, favorito: Boolean) : java.io.Serializable {

    fun setTitulo(s: String) {
        var titulo = s
    }
    fun setDuracion(s: Int) {
        var duracion = s
    }
    fun setDirector(s: String) {
        var titulo = s
    }
    fun setAno(s: Int) {
        var duracion = s
    }
    fun setFavorito(s: Boolean) {
        var duracion = s
    }

}

/*
class listMovies():java.io.Serializable{
    var lista = <Arraylist> Movie
}
*/

var pelicula = Movie("titulo",0,"",0,false)

// var listaMovies = listMovies()