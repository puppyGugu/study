# 환경설정
```
git clone https://flapper@git.boaflower.com/flapper/jhmybatis
cd jhmybatis
code . (윈도우는 탐색기 해당폴더에서 VSCode 실행)
$./mvnw (윈도우는 mvnw.cmd)
$npm start
http://localhost:9000/jhmybatis 으로 확인
```
[VSCode 환경설정](https://www.jhipster.tech/configuring-ide-visual-studio-code/)
[각 IDE별 환경설정](https://www.jhipster.tech/configuring-ide/)
spring-boot-devtools 를 통한 Hot Restart 가 중요함


# jhmybatis
created by [JHipster](https://www.jhipster.tech/) generator  
and modified to use [Mybatis](mybatis.org) not only [Spring Data JPA](https://spring.io/projects/spring-data-jpa).
In this case,  "Region" of Entities is Mybatis applied.
Still, you can use Spring Data Jpa not only Mybatis.
And when I use Mybatis, I used HashMap instead using VO(Value Object), so there is no impl, dto, dao etc.

# 만든 이유
한국 IT개발자들이 많이 쓰는 SQL 방식의 Mybatis 를 적용한 것
전자정부에서 쓰이는 
Controller > Service > ServiceImpl > Mapper(Java) > Mapper(XML) -> Database 
방식을
Controller > Service > Mapper(XML) -> Database 
으로 수정함

# jar 생성
`./mvnw -Pprod clean verify -Dmaven.test.skip=true`
> Mybatis 로 바꾸면서 test 통과 못하는 부분 있음

# Prod 에서 실행
`java -jar jhmybatis-1.jar --spring.profiles.active=prod`
> 메뉴얼대로라면 profile 지정안해도 Prod 로 되어야하지만 잘 안된다

# Jenkins
http://git.boaflower.com:18080/
