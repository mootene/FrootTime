package com.bignerdranch.android.froottime

import java.util.*

data class Fruit(val id: UUID = UUID.randomUUID(),
                 var frequency: Int = 0,
                 var tooSweet: Boolean = false,
                 var tooSoft: Boolean = false,
                 var tooCrunchy: Boolean = false,
                 var tooBitter: Boolean = false,
                 var perfect: Boolean = false)
