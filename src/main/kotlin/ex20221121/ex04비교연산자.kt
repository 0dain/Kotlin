package ex20221121

fun main() {

    val a: Int = 128
    //-128~127까지의 숫자는 Byte형이라서 캐쉬메모리(CPU공간)에 저장됨 그래서 아예 참조값을 비교할 수 없음(기본형이랑 같다는 뜻)
    val b = a
    println(a === b)//true
    //===: 참조값(주소값)이 동일한지 비교하는 연산자

    val c: Int? = a
    val d: Int? = a
    //c와 d는 a라는 같은 값을 저장하지만 서로 다른 래퍼런스 변수이기 때문에 주소값이 다름!
    val e: Int? = c
    println(c == d)//true
    println(c === d)//false
    println(c === e)//true

}