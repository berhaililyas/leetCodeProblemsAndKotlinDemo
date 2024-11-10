package by_example.productivity_boosters

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
    val date: ChronoLocalDate? = LocalDate.now()    // 1

    if (date != null) {
        println(date)                    // 2
        println(date.isLeapYear)                    // 2
    }

    if (date != null && date.isLeapYear) {          // 3
        println("It's a leap year!")
    }

    if (date == null || !date.isLeapYear) {         // 4
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        val month = date.monthValue                 // 5
        val day = date.dayOfMonth                 // 5
        println("month: $month, day: $day")
    }
}