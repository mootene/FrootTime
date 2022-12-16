package com.bignerdranch.android.froottime

import android.content.Context

class FruitRepository private constructor(context: Context){

    companion object {
        private var INSTANCE: FruitRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = FruitRepository(context)
            }
        }
    }
}