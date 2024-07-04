package com.example.recyclerviewinfragment

import java.io.Serializable

data class EmployeeDetails (
    val residence : String,
    val number: String
) : Serializable {

    init {
        var string = number
    }
}
