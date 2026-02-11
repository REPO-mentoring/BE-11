## 자바 API 도큐먼트

API는 라이브러리라고 부르기도 하는데 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다 우리가 사용해 왔던 String 클래스와 System 클래스 및 인터페이스의 모음을 말한다. 이 API들은 JDK설치경로라는 압축파일에 저장되어있음.

API도큐먼트는 쉽게 API를 찾아 이용할 수 있도록 문서화 한것을 말한다.

API 도큐먼트는 HTML 페이지로 작성되어 있기 때문에 웹 브라우저를 열고 오라클에서 제공하는 [http://docs.oracle.com/javase/8/docs/api/ 에서](http://docs.oracle.com/javase/8/docs/api/에서) 볼수있다.

## Java.lang과 java.util 패키지

### java.lang 패키지

자바 클래스의 기본적인클래스를 담고 있는 패키지이다. 그렇기에 java.lang 패키지에 있는 클래스와 인터페이스는 import 없이 사용할수있다.

간단한 클래스들

- Object : 자바 클래스의 최상위 클래스로 사용
- System
    - 표준 입력 장치로부터 데이터를 입력 받을때 사용
    - 표준 출력 장치(모니터)로 출력하기 위해 사용
    - 자바 가상 기계를 종료시킬 때 사용
    - 쓰레기 수집기를 실행 요청할 때 사용
- Class
    - 클래스 메모리로 로딩할 때 사용
- Stirng
    - 문자열을 저장하고 여러 가지 정보를 얻을 때 사용
- StringBuffer,StringBuider
    - 문자열을 저장하고 내부 문자열을 조작할 때 사용
- Math
    - 수학 함수를 이용할 때 사용
- Wrapper (Byte,Short,Character,Integer,Float,Double, Boolean)
    - 기본 타입의 데이터를 갖는 객체를 만들 때 사용
    - 문자열을 기본 타입으로 변환할때 사용
    - 입력값 검사에 사용

### java.utill 패키지

java.utill 패키지는 자바 프로그램 개발에 조미료 느낌

컬랙션 클래스들이 대부분임

- Arrays
    - 배열을 조작(비교,복사,정렬,찾기) 할때 사용
- Calendar
    - 운영체제의 날짜와 시간을 얻을 때 사용
- Date
    - 날짜와 시간정보를 저장하는 클래스
- Objects
    - 객체비교, 널 여부 등을 조사할때 사용
- StringTokenizer
    - 특정 문자로 구분된 문자열을 뽑아낼때 사용
- Random
    - 난수를 얻을때 사용

## Object Class

클래스를 선언할때 extends 키워드로 다른클래스를 상속하지않으면

암시적으로 java.lang.Object 클래스를 상속하게 된다. 따라서 자바의 모든 클래스는 Object 클래스의 자식이거나 자손 클래스이다. **Object는 자바의 최상위 부모 클래스에 해당**

- Object클래스는 필드가 없고 메소드들로 구성되어있다. **이 메소드들은 모든 클래스가 Object를  상속하기 때문에 모든 클래스에서 사용가능**

### 객체 비교 (equals())

```java
public boolean equals(Object obj){}
```

equals()메소드의 매개 타입은 Object인데, 이것은 모든 객체가 매개값으로 대입될 수 있음을 말한다.

equals()메소드는 비교 연산자==과 동일한 결과를 리턴함

두 객체가 동일 객체라면 true리턴 아니면 false를 리턴한다.

### 객체 해시코드

객체 해시코드란 객체를 식별할 하나의 정수값을 말한다. Object 의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 떄문에 객체마다 다른 값을 가지고 있다. 논리적 동등 비교 시 hashCode()를 오버라이딩할 필요성이있다.

우선 hashCode() 메소드를 실행해서 리턴된 해시코드 값이 같은지를 본다. 해시코드 값이 다르면 다른 객체로 판단하고 , 해시코드 값이 같으면 equals()메소드로 다시 비교한다.그렇기에 hashCode() 메소드가 true가 나와도 equals()의 리턴값이 다르면 다른객체가 된다.

### 객체 문자 정보(toString())

Object 클래스의 toString()메소드는 객체의 문자 정보를 리턴한다. 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다. 기본적으로 Object 클래스의 toString() 메소드는 “클래스명@16진수해시코드”로 구성된 문자 정보를 리턴한다.

```java
Object obj = new Object();
System.out.println(obj.toString());

//실행결과
java.langobject@de6ced
```

### 객체 복제(clone())

객체 복제는 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성하는것을 말함.

객체를 복제하는이유는 **원본 객체를 안전하게 보호하기 위해서이다.** 신뢰하지 않는 영역으로 원본 객체를 넘겨 작업할 경우 **원본 객체의 데이터가 훼손될수도있기때문에 복제된 객체를 만들어 신뢰하지 않는 영역에 넘기는것이 좋다.**

객체를 복제하는 방법은 얕은복사화, 깊은복사가있다.

### 얕은 복제

얕은 복제란 단순히 필드값을 복사해서 객체를 복제하는것을 말함.

필드값만 복제하기에 필드가 기본 타입일 경우 값 복사가 일어난다.

필드가 참조 타입일 경우 객체의 번지가 복사됨.

객체를 복사하려면 java.lang.Cloneable 인터페이스를 구현하고 있어야한다. 

```java
public class Member implements Cloneable{}
```

Clonable 인터페이스를 구현하지않으면 clone() 메소드를 호출할때 CloneNotSupportedExcpetion이 발생된다.

### 얕은복사에 단점

얕은 복제의 경우 참조 타입필드는 번지만 복제되기에 원본 객체의 필드와 복제 객체의 필드는 같은 객체를 참조하게됩니다.

만약 복제 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 가지게된답니다.

### 깊은복제

깊은 복제란 참조하고 있는 객체도 복제하는 것을 말한다. 다음 그림은 원본 객체를 깊은 복제했을 경우 참조하는 배열 객체도 복제된다는것을 보여준다.

얕은복사 : 

> 객체는 새로 만들지만
> 

> 내부에 있는
> 
> 
> **참조 객체는 그대로 공유**
> 

깊은 복사:

> 객체뿐 아니라
> 

> 내부의 참조 객체까지
> 
> 
> **모두 새로 복사**
> 

### 시스템 프로퍼티 읽기

시스템 프로퍼티는 JVM이 시작할 때 자동 설정되는 시스템의 속성값을 말한다. 

예: 운영체제의 종류 및 자바 프로그램을 실행시킨 사용자 아이디, JVM의 버전 , 운영체제에서 사용되는 파일 경로 구분자 등이 여기에 속한다.

시스템 프로퍼티는 키와 값으로 구성되어있다.

### 환경 변수 읽기

환경변수는 프로그램상의 변수가 아닌 운영체제가 설치될때 기본적인 내용이 설정되고 사용자가 직접 설정하거나 응용 프로그램이 설치될 때 자동적으로 추가 설정되기도한다.

### Class 클래스

자바는 클래스와 인터페이스의 메타 데이터를 java.lang 패키지에 소속된 Classs 클래스로 관리한다.

여기서 메타 데이터란 클래스의 이름 , 생성자 정보, 필드 정보, 메소드 정보를 말한다.

### Class 객체 얻기(getClass(), forName())

프로그램에서 Class 객체를 얻기 위해서는 Object 클래스가 가지고 있는 getClass() 메소드를 이용하면 된다. Object는 모든 클래스의 최상위 클래스이므로 모든 클래스에서 getClass() 메소드를 호출할수있다

```java
Class clazz = obj.getClass();
```

getClass() 메소드는 해당 클래스로 객체를 생성했을 때만 사용할 수 있는데, 객체를 생성하기전에 직접 Class 객체도 얻을수있다.

Class는 생성자를 감추고있기에 new 연산자로 객체를 만들순없고, 정적 메소드인 forName()을 이용해야한다. 

forName() 메소드는 클래스 전체 이름을 매개값으로 받고 Class 객체를 리턴한다.

```java
Class clazz = Class.forName(String className);
```

### 문자열 찾기 (indexof())

indexOf() 메소드는 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴한다. 만약 주어진 문자열이 포함되어있지 않으면 -1을 리턴한다.

```java
String suject = "자바 프로그래밍";
int index = subject.indexOf("프로그래밍")
```

### 문자열 길이(length())

length() 메소드는 문자열의 길이를 리턴한다.

```java
String subject = "자바 프로그래밍";
int length - subject.length();
```

### 문자열 대치 (replace())

replace() 메소드는 첫번째 매개값인 문자열을 찾아 두번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴함

```java
String oldStr = "자바 프로그래밍";
String newStr = oldStr.replace("자바","java");
```

### 알파벳 대 , 소문자 변경(toLowerCase(),toUpperCase())

```java
String original = "Java Programing";
String lowerCase = original.toLowerCase();
String upperCase = original.toUpperCase();
```

### 문자열 앞뒤 공백 잘라내기(trim())

```java
String oldStr = "   자바 프로그래밍   ";
String newStr = oldStr.trim();
```

### split()메소드

String 클래스의 split() 메소드는 다음과 같이 호출

### Math 클래스

Math클래스는 수학 계산에 사용할 수 있는 메소드를 제공하고있다.

모두 정적 static임

- int abs(int a) 절대값
- double ceil(double a) 올림값
- double floor(double a) 버림값
- int max(int a,int b) 최대값
- int min(int a,int b) 최소값
- double random() 랜덤값
- double rint(double a) 가까운 정수의 실수값
- long round(double a) 반올림값

### Random 클래스

난수를 얻어내기위한 다양한 메서드를 제공한다.

### 생성자

- Random() 호출 시마다 다른 종자값(현재시간 이용) 이 자동으로 설정된다.
- Random(long seed) 매개값으로 주어진 종자값이 설정된다.

### Date 클래스

Date는 날짜를 표현하는 클래스

Date 클래스는 객체 간에 날짜 정보를 주고 받을 때 주로 사용된다. 

```java
Date now = new Date();
```

### Calendar 클래스

Calender 클래스는 달력을 표현한 클래스이다. 추상 클래스이므로  new 연산자를 통해 인스턴스를 생성할수 없다.

그 이뉴는 날짜와 시간을 계산하는 방법이 각 나라마다 다르기 때문이다.

```java
Caleandar now = Calendar.getInstance();
```

### java.time 패키지

날짜와 시간 객체 생성

- LocalDate 로컬 날짜 클래스
- LocalTime 로컬 시간 클래스
- LocalDateTime 로컬 날짜 및 시간 클래스
- ZonedDateTime 특정 타임존의 날짜와 시간 클래스
- Instant 특정 시점의 time-stamp 클래스

### 파싱와 포맷팅

날짜와 시간 클래스는 문자열을 파싱해서 날짜와 시간을 생성하는 메소드와 이와 반대로 날짜와 시간을 포맷팅된 문자열로 변환하는 메소드를 제공하고있다.

**파싱 메소드**

날짜와 시간 정보가 포함된 문자열을 파싱해서 날짜와 시간을 생성하는 두개의 parse() 정적메소드이다.

**포맷팅 메소드**

날짜와 시간을 포맷팅된 문자열로 변환시키는 format()메소드이다.