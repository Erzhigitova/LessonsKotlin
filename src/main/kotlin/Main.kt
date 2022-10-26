fun main() {
    /*Дан массив чисел “5, -3, 15, 61, 29, 10, -2 ,7”. Найти наибольший элемент в этом массиве.*/
    val arr1 = arrayOf(5, -3, 15, 61, 29, 10, -2 ,7)
    println("Наибольший элемент в этом массиве: ${getMaxItem(arr1)}")

    /* Дан массив чисел "5, 13, 2, 26, 55, 100, 99, 1". Посчитать сумму элементов массива с нечетными индексами*/
    val arr2 = arrayOf(5, 13, 2, 26, 55, 100, 99, 1)
    println("Сумма элементов массива с нечетными индексаами: ${getSumOfOddIndices(arr2)}")
}

fun getMaxItem(arr: Array<Int>): Int {
    var maxItem: Int = arr[0]
    for(i in 0 until arr.size){
        if(arr[i]>maxItem) maxItem = arr[i]
    }
    return maxItem
}

fun getSumOfOddIndices(arr: Array<Int>):Int {
    var sum = 0
    for(i in 1 until arr.size step 2)
        sum+=arr[i]
    return sum
}