package com.example.myapplication.coba

interface Transport {
    var weight :Float
    var capacity:String
    var speed :Float
    fun load(){
        println("Goods are loaded successfully")
    }
    fun onload(){
        println("Goods are unloaded successfully")
    }
    fun ship()


}