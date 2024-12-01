package com.example.myapplication


fun gcd(a: Int, b: Int): Int {
    if (a == b) return a
    return if (a > b) gcd(b, a-b) else gcd(a, b-a)
}

fun lmc(a:Int, b:Int) :Int {
    return a*b/gcd(a,b)
}

fun checker(a: String) :Boolean {
    for (i in a) {
        if (i == '$') return true
    }
    return false
}


fun evenCounter(x:Int = 0) :Int {
    return if(x == 100) return 100 else  x + evenCounter(x+2)
}

fun reverseNum(x: Int) :Int {
    val inString: String = x.toString()
    var newString:String = ""
    for (i in inString.length-1 downTo 0 step 1)
    {
        newString += inString[i]
    }
    return newString.toInt()
}

fun isPalindrome(st: String) :Boolean {
    var newSt= ""
    for (i in st.length-1 downTo 0 step 1) {
        newSt += st[i]
    }
    return (newSt == st)
}