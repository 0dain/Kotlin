package ex20221122

fun main() {

    //호출했을 때 내 이름의 결과값만 가지고 오는 함수
    getName("임다인")

    println(getName("임다인"))

}

//fun getName(name:String): String {
//    return name
//}

//중괄호{} 안의 코드가 한 줄이면 중괄호{}와 return이라는 키워드를 생략할 수 있음
//단, return 키워드 대신 대입 연산자(=) 사용해야 함!

//간략화 1번 방법
//fun getName(name:String): String = name

//간략화 2번 방법 => 매개변수에 자료형이 명시되어 있기 때문에 반환값이 String이라고 추론할 수 있기 때문에 리턴타입 생략 가능
fun getName(name:String) = name


