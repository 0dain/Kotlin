package ex20221118

fun main() {

    //null 처리 하는 방법 1번 => 세이프 콜(?.)

    //null 허용하는 변수 name1을 선언(String?)
    var name1:String?=null

    //null 허용하지 않는 변수 name2를 선언(String)
    var name2:String="임다인"

    //name1, name2의 문자열 길이(.length)를 출력해보자

//    println(name1.length) => 오류 남 얘를 처리하고 싶으면 물음표나 느낌표를 사용해!! 라는 오류가 뜸
    println(name1?.length)
    // ?(null 허용)가 붙은 변수들을 사용하려면 뒤쪽에서 계속 관리를 해줘야 한다
        //변수명 뒤에 계속 물음표 붙여주기(변수명?) / ? : 세이프 콜
//    println(name1!!.length) 오류남! null이 아니라고 단정지었는데 null이라서!
    println(name2.length)

    //name1에 오류 발생
    //원인: null은 길이가 null이므로 NPE가 발생
    //오류 해결 방법: String? 형에서는 세이프콜(?.)
    //이나 non-null 단정기호(!!.)을 사용해서 출력할 수 있다 => 얘는 절대 null이 아닐 거야!! 라는 뜻으로 사용하는 것임
            //DB에서 값을 가져오는 게 아니라면 대부분 다 오류가 남
        //단정기호(!!.)는 거의 사용하지 않음
        //그럼 언제 사용? => 반드시 null 값이 아니라고 판단되는 변수에만 사용!
        //단정기호를 사용한 경우엔 주석으로 사용한 이유와 경위에 대해서 기록해야 함

    //null 처리 하는 방법 2번 => 조건문
    //조건문을 활용해서 null을 허용한 변수 검사

    //null 처리 하는 방법 3번 => 엘비스 연산자
    //엘비스 연산자(Elvis) ? :
        //삼항 연산자 같은 역할

}