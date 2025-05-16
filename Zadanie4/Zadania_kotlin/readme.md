package com.example.kotlinexercises

class Exercises {
    /**
     * Realizacja zadań z Kotlin.
     * Każde zadanie posiada treść polecenia z użyciem KDoc.
     */
    /**
     * Zadanie 1: Complete the code to make the program print "Mary is 20 years old" to standard output.
     *
     * fun main() {
     *   val name = "Mary"
     *   val age = 20
     *   // Write your code here
     * }
     */
    fun zad1() {
        val name = "Mary"
        val age = 20
        println("$name is $age years old")
    }
    /**
     * Zadanie 2: Explicitly declare the correct type for each variable:
     *
     * fun main() {
     *   val a: Int = 1000
     *   val b = "log message"
     *   val c = 3.14
     *   val d = 100_000_000_000_000
     *   val e = false
     *   val f = '\n'
     * }
     */
    fun zad2() {
        val a: Int = 1000
        val b: String = "log message"
        val c: Double = 3.14
        val d: Long = 100_000_000_000_000L
        val e: Boolean = false
        val f: Char = '\n'
        println("a=$a, b=\"$b\", c=$c, d=$d, e=$e, f=$f")
    }
    /**
     * Zadanie 3: You have a list of "green" numbers and a list of "red" numbers.
     * Complete the code to print how many numbers there are in total.
     *
     * fun main() {
     *   val greenNumbers = listOf(1, 4, 23)
     *   val redNumbers   = listOf(17, 2)
     *   // Write your code here
     * }
     */
    fun zad3() {
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers   = listOf(17, 2)
        val totalCount = greenNumbers.count() + redNumbers.count()
        println(totalCount)
    }
    /**
     * Zadanie 4: You have a set of protocols supported by your server.
     * Complete the program to check whether the requested protocol is supported or not.
     *
     * fun main() {
     *   val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
     *   val requested = "smtp"
     *   val isSupported = // Write your code here
     *	 println("Support for $requested: $isSupported")
     * }
     */
    fun zad4() {
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")
    }
    /**
     * Zadanie 5: Define a map that relates integer numbers from 1 to 3 to their corresponding spelling.
     * Use this map to spell the given number.
     *
     * fun main() {
     *   val number2word = // Write your code here
     *   val n = 2
     *   println("$n is spelt as '${number2word[n]}'")
     * }
     */
    fun zad5() {
        val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
        val n = 2
        println("$n is spelt as '${number2word[n]}'")
    }
    /**
     * Zadanie 6: Create a simple game where you win if throwing two dice results in the same number.
     * Use if to print You win :) if the dice match or You lose :( otherwise.
     *
     * import kotlin.random.Random
     *	fun main() {
     *	  val firstResult = Random.nextInt(6)
     *	  val secondResult = Random.nextInt(6)
     *	  // Write your code here
     * }
     */
    fun zad6() {
        val firstResult  = kotlin.random.Random.nextInt(6)
        val secondResult = kotlin.random.Random.nextInt(6)
        if (firstResult == secondResult) {
            println("You win :)")
        } else {
            println("You lose :(")
        }
    }
    /**
     * Zadanie 7: Using a when expression, update the following program so that it prints the corresponding actions when you input the names of game console buttons.
     *
     * A -> Yes
     * B -> No
     * X -> Menu
     * Y -> Nothing
     * Other -> There is no such button
     * fun main() {
     *   val button = "A"
     *   println(
     *   // Write your code here
     *   )
     * }
     */
    fun zad7() {
        val button = "A"
        val action = when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
        println(action)
    }
    /**
     * Zadanie 8: You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
     * 1. Use a while loop.
     * 2. Use a do-while loop.
     * fun main() {
     *   var pizzaSlices = 0
     *   // Start refactoring here
     *   pizzaSlices++
     *   println("There's only $pizzaSlices slice/s of pizza :(")
     *   pizzaSlices++
     *   println("There's only $pizzaSlices slice/s of pizza :(")
     *   pizzaSlices++
     *   println("There's only $pizzaSlices slice/s of pizza :(")
     *   pizzaSlices++
     *   println("There's only $pizzaSlices slice/s of pizza :(")
     *   pizzaSlices++
     *   println("There's only $pizzaSlices slice/s of pizza :(")
     *   pizzaSlices++
     *   println("There's only $pizzaSlices slice/s of pizza :(")
     *   pizzaSlices++
     *   println("There's only $pizzaSlices slice/s of pizza :(")
     *   pizzaSlices++
     *   // End refactoring here
     *   println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
     *   }
     */
    fun zad8() {
        println("while")
        var pizzaSlices = 0
        while (pizzaSlices < 8) {
            pizzaSlices++
            println("There's only $pizzaSlices slice/s of pizza :(")
        }
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
        println("do-while")
        pizzaSlices = 0
        do {
            pizzaSlices++
            println("There's only $pizzaSlices slice/s of pizza :(")
        } while (pizzaSlices < 8)
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    }
    /**
     * Zadanie 9: Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word
     * "fizz", and any number divisible by five with the word "buzz". Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
     * fun main() {
     *   // Write your code here
     * }
     */
    fun zad9() {
        for (number in 1..100) {
            println(
                when {
                    number % 15 == 0 -> "fizzbuzz"
                    number % 3 == 0 -> "fizz"
                    number % 5 == 0 -> "buzz"
                    else -> number.toString()
                }
            )
        }
    }
    /**
     * Zadanie 10: You have a list of words. Use for and if to print only the words that start with the letter l.
     * fun main() {
     *   val words = listOf("dinosaur", "limousine", "magazine", "language")
     *   // Write your code here
     * }
     */
    fun zad10() {
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        for (w in words) {
            if (w.startsWith("L", ignoreCase = true)) println(w)
        }
    }
    /**
     * Zadanie 11: Write a function circleArea that takes radius:Int and returns area as Double.
     *
     * import kotlin.math.PI
     *
     * // Write your code here
     *
     * fun main() {
     * println(circleArea(2))
     * }
     */
    fun zad11() {
        fun circleArea(radius: Int): Double {
            return kotlin.math.PI * radius * radius
        }
        println(circleArea(2))
    }
    /**
     * Zadanie 12: You have a function that translates a time interval given in hours, minutes, and seconds into seconds. In most cases, you need to pass only one or two function
     * parameters while the rest are equal to 0. Improve the function and the code that calls it by using default parameter values and named arguments so that the code is
     * easier to read.
     *
     * fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
     *   ((hours * 60) + minutes) * 60 + seconds
     * fun main() {
     *   println(intervalInSeconds(1, 20, 15))
     *   println(intervalInSeconds(0, 1, 25))
     *   println(intervalInSeconds(2, 0, 0))
     *   println(intervalInSeconds(0, 10, 0))
     *   println(intervalInSeconds(1, 0, 1))
     * }
     */
    fun zad12() {
        fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
            ((hours * 60) + minutes) * 60 + seconds
        fun main() {
            println(intervalInSeconds(1, 20, 15))
            println(intervalInSeconds(minutes = 1, seconds = 25))
            println(intervalInSeconds(hours = 2))
            println(intervalInSeconds(minutes = 10))
            println(intervalInSeconds(hours = 1, seconds = 1))
        }
    }
}
