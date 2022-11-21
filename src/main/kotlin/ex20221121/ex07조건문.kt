package ex20221121

fun main() {

    //단순 if문
    val gender="여"

    if(gender=="여")
        println("여자입니다")
    //if문을 표현식으로 사용하고 싶으면 else문도 넣어라! 라는 오류가 뜸
//    val result2=if(gender=="여") "여자입니다"

    //if ~ else
    if(gender=="여")
        println("여자입니다")
    else
        println("남자입니다")

    val result=if(gender=="여") "여자입니다" else "남자입니다"

    println(result)
}