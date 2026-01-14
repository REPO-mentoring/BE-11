## 스프링 시큐리티(Spring security)

스프링 시큐리티는 인증 권한 부여 및 보호 기능을 제공하는 프레임워크이다

@EnableWebSecurity로 활성화해 스프링시큐리티가 제공하는 기본 보안구성을 활성화할수있음

### 인증 / 인가

인증 : 해당 사용자가 본인 맞는지 확인하는 절차 (HTTP 에러코드 401 Unauthorized )

인가 : 해당사용자가 어디까지 접근가능한지를 결정하는 절차 (인가 실패는 403 Forbidden)

### 인증 방식

credential 인증 방식 username , password를 이용한 방식

Spring security는 credential기반 인증 방식을 취함

특정 자원에 대한 접근을 제어하기위해서 권한을 가지게된다

Spring security 특징

- Filter를 기반으로 동작한다
  - Spring MVC와 분리되여 관리하고 동작할수있음
- Bean으로 설정할수있다
- 사용시, 보안 관련 로직을 작성하지 않아도 되는게 장점.

### 스프링 시큐리티의 흐름

1. Http Request 수신

   → 사용자가 로그인 정보와 함께 인증 요청을한다.

2. 유저 자격을 기반으로 인증토큰 생성

   → AuthenticationFilter가 요청을 가로채고, 가로챈 정보를 통해 UsernamePasswordAuthenticationToken의 인증용 객체를 생성한다.

3. Filter를 통해 AuthenticationToken을 AuthenticationManager로 위임

   → AuthenticationManager의 구현체인 ProviderManager에게 생성한 UsernamePasswordToken객체를 전달한다.

4. AuthenticationProvider의 목록으로 인증을 시도

   → AuthenticationManger는 등록된 AuthenticationProvider들을 조회하며 인증을 요구함

5. UserDetailsService의 요구

   → 실제 데이터베이스에서 사용자 인증정보를 가져오는 UserDetailsService에 사용자 정보를 넘겨준다.

6. UserDetails를 이용해 User객체에 대한 정보 탐색

   → 넘겨받은 사용자정보를 통해 DB에서 찾아낸 사용자 정보인 UserDetails객체를 만든다.

7. User 객체의 정보들을 UserDetails가 UserDetailsService(LoginService)로 전달

   → AuthenticationProvider들은 UserDetails를 넘겨받고 사용자 정보를 비교함

8. 인증 객체 or AuthenticationExveption

   → 인증이 완료가되면 권한 등의 사용자 정보를담은 Authentication 객체를반환함

9. 인증 끝

   → 다시 최초의 AuthenticationFilter에 Authentication 객체가 반환된다.

10. Security Context에 인증 객체를 설정

    → Authentication 객체를 Security Context에 저장한다.

### SecurityContextHolder, SecurityContext, Authentication

위 세가지는 클래스는 스프링 시큐리티의 주요 컴포넌트임

유저의 아이디와 패스워드 사용자 정보를 넣으면 실제 DB에 있는 사용자인지 체크후 인증성공하면 pricipal과 credential 정보를 Authentication안에 담음 이것을 SecurityContext에 보관함 다시 이 SecurityContext를 SecurityContextHolder에 담아보관함
