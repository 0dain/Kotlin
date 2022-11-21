package ex20221121

fun main() {

    //앨비스 연산자(?:)
    //NPE 발생을 예방할 수 있도록 NULL값을 처리해주는 연산자

    var str: String?=null

    //서버에서 값 받아올 때 자주 사용함!
    println(str?.length?:"null입니다")
    var result=str?.length ?: -1

    println(result)

}