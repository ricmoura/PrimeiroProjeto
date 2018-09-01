package com.example.ricardo.primeiroprojeto.extensions

fun Double.format(digitos: Int) = String.format("%.${digitos}f",this)
