package com.example.class4

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.class4.databinding.ActivityMainBinding
import com.example.class4.databinding.FragmentCalculaterBinding
import net.objecthunter.exp4j.ExpressionBuilder

class CalculaterFragment : Fragment() {
    private val TAG = MainActivity::class.java.simpleName
    private lateinit var binding: FragmentCalculaterBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_calculater, container, false
        )
        binding = FragmentCalculaterBinding.bind(view)
        return binding.root

    }
    override fun onStart() {
        super.onStart()

        binding.button1.setOnClickListener {addSymbol("1")}
        binding.button2.setOnClickListener {addSymbol("2")}
        binding.button3.setOnClickListener {addSymbol("3")}
        binding.button4.setOnClickListener {addSymbol("4")}
        binding.button5.setOnClickListener {addSymbol("5")}
        binding.button6.setOnClickListener {addSymbol("6")}
        binding.button7.setOnClickListener {addSymbol("7")}
        binding.button8.setOnClickListener {addSymbol("8") }
        binding.button9.setOnClickListener {addSymbol("9")}
        binding.buttonComa.setOnClickListener {addSymbol(".")}
        binding.buttonAdition.setOnClickListener{addSymbol("+")}
        binding.buttonMinus.setOnClickListener{addSymbol("-")}
        binding.buttonMultiply.setOnClickListener{addSymbol("*")}
        binding.buttonDevide.setOnClickListener{addSymbol("/")}
        binding.buttonEquals.setOnClickListener{
            binding.textVisor.text = Calculator.equals()
        }
    }
    fun addSymbol(symbol : String){
        binding.textVisor.text = Calculator.addSymbol(symbol)
    }
}