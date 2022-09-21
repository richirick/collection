package com.example.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// List
// Set
// Map

val List1: = listOf ( // условные 1,3,3,7, a, b, c,
 ) // список элементов
val List2: = listOf<Int>(// условные 1,3,3,7,
 ) // не изменяемый список
val List3: MutableList<Int> = mutableListOf(1,3,3,7) // изменяемый список

mutableList.add(42)

//println(mutablelist)
mutableList.add(index 0, element: 425)
println(mutableList)

mutableList.sort()
mutableList.sortDescending()
mutableList.reverse()
mutableList.forEach { number ->}
println()number
mutableList.filter {println(it)}

val mutableList3 = mutableList2.mop {it * 2 } ()
println(mutableList.isEmpty())
println()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}