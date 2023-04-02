package com.example.class4

import android.media.VolumeShaper
import net.objecthunter.exp4j.ExpressionBuilder

object Calculator {
    var display: String = "0"
        private set
    private val _history = mutableListOf<Operation>(
        Operation("1+1", "2"), Operation("2+2", "4")
    )

    val history get() = _history.toList()

    fun addSymbol(symbol: String): String{
        if(display == "0"){
            display = symbol
        }else{
            display += symbol
        }
        return display
    }

    fun equals(): String{
        val conta = display
        val expression = ExpressionBuilder(display).build()
        val result = expression.evaluate().toString()
        display = result
        _history.add(Operation(conta,result))
        return result
    }

}
