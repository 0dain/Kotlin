package ex20221118

fun main() {

    //만약, 어떤 값이 정수일 수도 있고 실수일 수도 있다면 어떻게 해야 하지?!

    //스마트캐스트: 컴파일러가 자동으로 형변환해줌

    //Number
    var test: Number=12.34
    println("test의 값은 $test")//문자열이랑 같이 출력하고 싶을 때 $ 사용하기
    println(test::class.java.simpleName)//Double 출력

    test=12
    println(test::class.java.simpleName)//Integer 출력 => Number는 참조 자료형이라 Int가 아니라 Integer로 출력됨

    //Any: Object랑 비슷, 최상위 자료형임

}