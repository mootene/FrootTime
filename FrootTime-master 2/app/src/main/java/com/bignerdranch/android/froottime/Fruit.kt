package com.bignerdranch.android.froottime

import androidx.room.Entity
import java.util.*
data class Fruit(var frequency: Int = 0,
                 var tooSweet: Boolean = false,
                 var tooSoft: Boolean = false,
                 var tooCrunchy: Boolean = false,
                 var tooBitter: Boolean = false,
                 var perfect: Boolean = false,
                 var low: Int,
                 var high: Int,)
