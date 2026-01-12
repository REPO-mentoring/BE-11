## 스프링 시큐리티(Spring security)

스프링 시큐리티는 인증 권한 부여 및 보호 기능을 제공하는 프레임워크이다

### 인증 / 인가

인증 : 해당 사용자가 본인 맞는지 확인하는 절차

인가 : 해당사용자가 어디까지 접근가능한지를 결정하는 절차

### 인증 방식

credential 인증 방식 username , password를 이용한 방식

Spring security는 credential기반 인증 방식을 취함

특정 자원에 대한 접근을 제어하기위해서 권한을 가지게된다

Spring security 특징

- Filter를 기반으로 동작한다
  - Spring MVC와 분리되여 관리하고 동작할수있음
- Bean으로 설정할수있다

### 스프링 시큐리티의 흐름

HTTP Request 수신 → 유저 자격을 기반으로 인증토큰 생성 → Filter를 통해 AuthenticationToken을 AuthenticationManager로 위임 → AuthenticationProvider의 목록으로 인증을 시도 → UserDetailsService의 요구 → UserDetails를 이용해 User객체에 대한 정보 탐색 → User 객체의 정보들을 UserDetails가 UserDetailsService(LoginService)로 전달 → 인증 객체 or AuthenticationException →

인증끝 →  \*\*\*\*SecurityContext에 인증 객체를 설정
