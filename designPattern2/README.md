호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다. SOLID 중에서 개방페쇄원칙(OCP)를 따른다.

connect는 110v용 함수 , cleaner은 220v 인터페이스 사용
인터페이스가 달라서 사용이 불가할 떄는 'adapter'를 사용하여 변환시켜준다.

SocketAdapter 클래스에서 implements 110v 하여 220v 가 110v 함수 사용 가능하도록 구현
SocketAdapter 함수에서 110v의 poweron이 아닌 220v의 함수 connect를 호출해줌으로써 해결
