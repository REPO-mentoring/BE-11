# 왜 IoC / DI / AOP가 필요했을까?
---------
## 객체를 직접 생성하고 관리하면 어떤 문제가 생길까?
``` java
class OrderService {
    private final PaymentService paymentService = new PaymentService();
}
```
### 문제점
- 결합도가 높다
- 유연성이 부족하다
- 재사용성 저하
- 테스트의 어려움 
- 생명주기 관리의 복잡성

이렇게 되면 이런 문제점들을 개발자가 다 감당하게 된다.


## IoC/DI
---
IoC(Inversion of Control)은 제어의 역전이다. IoC가 존재함으로 개발자는 무엇이 필요한지 선언을 하면 프레임워크가 객체의 생성, 초기화, 소멸, 메서드 호출 등 을 스프링이 대신 실행한다. 
``` java
@Service
class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```
> 객체 생성 주도권이 개발자 → 프레임워크로 이동한다

### IoC를 도입함으로 얻을 수 있는 장점은?
- 프로그램의 진행 흐름과 구체적인 구현을 분리시킬 수 있다.
- 개발자는 비즈니스 로직에 집중할 수 있다.
- 구현체 사이의 변경이 용이하다.
- 객체 간 의존성이 낮아진다.

### DI(의존성 주입)
의존성을 주입하는 방법은 크게 4가지이다. 주요 방식으로는 **생성자 주입, 수정자(Setter) 주입, 필드 주입** 이 세가지가 있다. 추가적으로 일반 메서드 주입도 있다. 스프링에서는 생성자 주입을 가장 권장한다.

#### 생성자 주입(생성자를 통해 의존 관계를 주입하는 방법)
생성자 주입은 생성자의 호출 시점에 1회 호출 된다. 그렇기 때문에 주입받은 객체가 변하지 않거나, 반드시 객체의 주입이 필요한 경우에 강제하기 위해 사용할 수 있다. 또한 Spring 프레임워크에서는 생성자 주입을 적극 지원하고 있기 때문에, 생성자가 1개만 있을 경우에 @Autowired를 생략해도 주입이 가능하도록 편의성을 제공하고 있다.
```java
@Service
public class UserService {

    private UserRepository userRepository;
    private MemberService memberService;

    @Autowired
    public UserService(UserRepository userRepository, MemberService memberService) {
        this.userRepository = userRepository;
        this.memberService = memberService;
    }
}
```

#### 수정자 주입(Setter 주입)
수정자 주입(Setter 주입)은 필드 값을 변경하는 Setter를 통해서 의존 관계를 주입하는 방법이다. Setter 주입은 생성자 주입과 다르게 주입받는 객체가 변경될 가능성이 있는 경우에 사용한다
```java
@Service
public class UserService {

    private UserRepository userRepository;
    private MemberService memberService;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
}
```

#### 필드 주입
필드 주입은 필드에 바로 의존 관계를 주입하는 방법이다.
```java
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MemberService memberService;

}
```
#### 메서드 주입
일반 메소드를 통해 의존 관계를 주입하는 방법이다. 수정자 주입과 동일하며 마찬가지로 거의 사용할 필요가 없는 주입 방법이다. 수정자 주입을 사용하면 한 번에 여러 필드를 주입 받을 수 있도록 메소드를 작성할수도 있다.

## AOP
AOP(Aspect-Oriented-Programming)는 핵심 비즈니스 로직과 중복되는 부가 기능(로깅, 보안, 트랜잭션 등)을 *횡단 관심사(Cross-Cutting Concern)로 분리하여 모듈화하는 프로그래밍 패러다임이다.

*횡단관심사란? 여러 모듈이나 클래스에서 공통으로 필요하지만 모듈 자체의 핵심적인 기능과 직접적인 관련이 없는 관심사이다. ex) 로깅, 트랜잭션(공통이지만 널리 퍼져있는 로직)

### AOP사용으로 얻을 수 있는 장점은?
횡단관심사와 핵심 비지니스 로직을 분리해 비지니스 로직 개발에 더 집중할 수 있다.



