package ex20221122

fun main() {

    //Any: 이름처럼 아무거나 할 수 있는 느낌의 자료형
        //Int, Float, String ... 모든 자료형이 될 수 있음

    var str1:String = "abc"
    str1="cba"
//    str1=12345678 => 불가능 처음에 변수를 선언할 때 자료형 타입을 지정해줬기 때문에!
    var str2:Any = "abc"
    println(str2)
    str2=12345
//    println(str2)
    str2=true
//    println(str2)
    str2='c'

    //객체 데이터 타입도 체크할 수 있음
        //Person p1=new Person
        //p1
        //is Person
    // 상속관계에서 어디에서 나온 필드/메서드(프로퍼티)인지 확인하기 위해 is를 사용함

    //when => 데이터 타입을 판단하는 식을 넣어줘야 함
        //is Int => 정수형 자료형이 맞는지에 대한 타입 체크
    when(str2){
        is Int -> println("정수형입니다")
        is String -> println("문자열입니다")
        is Boolean -> println("논리형입니다")
        else -> println("정수형, 문자열, 논리형이 아닙니다")
    }

}