package chap13.Ex05;


//지역이너클래스의 컴파일 이후 생성 클래스 파일


class A{
	void abc() {
		class B{}      // A$1B.class
		class C{}      // A$1C.class
	}
	
	void bcd(){
		class C{}      //  A$2C.class
		class D{}		// A$1D.class	
	}
	
	void cde() {
		class B{}      //  A$2B.class
		class C{}		// A$3C.class
	}
}


public class InnerClass_5 {

	public static void main(String[] args) {

	}

}
