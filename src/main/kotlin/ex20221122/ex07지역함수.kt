package ex20221122

fun main() {

//    add1(5,6) => 오류, 함수 선언 전에 사용하려고 해서!
        //지역함수를 사용할 때에는 먼저 선언부가 있어야 함
    //지역함수
    fun add1(a:Int, b:Int):Int{
        return a+b
    }
    add1(3,4)


    //최상위 레벨 함수(Top-Level)
    add2(5,6)
}//최상위 레벨 함수(Top-Level-Function)

fun add2(a:Int, b:Int):Int{
    return a+b
}//최상위 레벨 함수