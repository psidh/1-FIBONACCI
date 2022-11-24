fun main(args: Array<String>) {
    var i = 1
    print("Enter the number till which you want to generate fibonacci series: ")
    var n: Int =Integer.valueOf(readLine())
    var t1 = 0
    var t2 = 1

    print("First $n terms: ")

    while (i <= n) {
        print("$t1 \n")

        val sum = t1 + t2
        t1 = t2
        t2 = sum

        i++
    }
}