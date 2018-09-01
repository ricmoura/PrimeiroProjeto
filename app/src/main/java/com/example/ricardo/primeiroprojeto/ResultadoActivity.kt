package com.example.ricardo.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Toast
import com.example.ricardo.primeiroprojeto.extensions.format
import com.example.ricardo.primeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val peso = intent.extras.getString(ConstantesExtra.KEY_PESO)
        val altura = intent.extras.getString(ConstantesExtra.KEY_ALTURA)

        calcularIMC(peso.toDouble(),altura.toDouble())

    }

    private fun calcularIMC(peso: Double, altura: Double) {
        val imc = peso / (altura*altura)

        if (imc < 17) {
            tvIMC.text = imc.format(0)
            setImgaem(R.drawable.magreza)
        }else if(imc < 18.5){
            tvIMC.text = imc.format(0)
            setImgaem(R.drawable.abaixo)
        }else if(imc <24.9){
            tvIMC.text = imc.format(0)
            setImgaem(R.drawable.ideal)
        }else if(imc < 29.9){
            tvIMC.text = imc.format(0)
            setImgaem(R.drawable.sobre)
        }else if(imc < 34.9){
            tvIMC.text = imc.format(0)
            setImgaem(R.drawable.obesidade)
        }else if(imc < 39.9){
            tvIMC.text = imc.format(0)
            setImgaem(R.drawable.obesidade)
        }else {
            tvIMC.text = imc.format(0)
            setImgaem(R.drawable.obesidade)
        }


        /*when (imc){
            in 0.0..17.0 ->{tvIMC.setText(imc.toString())
                            setImgaem(R.drawable.magreza)}
            in 17.1..18.5 ->{            tvIMC.setText(imc.toString())
                setImgaem(R.drawable.abaixo)}
            in 18.6..24.9 ->{            tvIMC.setText(imc.toString())
                setImgaem(R.drawable.ideal)}
            in 25.0..34.9 ->{}
            in 35.0..39.9 ->{}
            else -> {}
        }*/
    }

    private fun setImgaem(resourceId: Int){
        ivIMC.setImageDrawable(
                ContextCompat.getDrawable(this, resourceId)
        )
    }
}
