package viktorrocha.br.com.carroskotlinapp.domain

import android.graphics.Bitmap
import java.lang.StringBuilder


class Carro(
    val modelo: String,
    val ano: Int,
    val marca: Marca,
    val motor: Motor,
    val preco: Float,
    val acessorios: List<Acessorio>,
    val imagem: Bitmap) {

    fun getAcessoriosFormatted():String{
        val aux = StringBuilder()

        for (acessorios in acessorios)
            aux.append("${acessorios.nome} (${acessorios.preco}),")
        return aux.trimEnd().trimEnd( ',' ).toString()
    }
}