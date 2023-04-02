package com.example.class4

data class Operation(val expression : String, val result : String) {
    val date : Long = System.currentTimeMillis()
}