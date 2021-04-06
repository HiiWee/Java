# Java
### This is for my development skills with Java
-------------------------
### 프로젝트 계획이유
> 백엔드 개발을 목표로 하고 있으며 현재 Java 언어를 공부하고 있습니다.
> 
> 코드 작성 연습 및 공부했던 것을 복습하기 위해 간단한 커피 벤딩 머신을 구현해보려고 합니다.
>
### 프로젝트 설명
> 커피추출 머신 아메리카노, 라떼, 모카 커피를 만들 수 있으며 각각 Ice, Hot을 선택할 수 있다.
> 
> 커피 원료들의 관리 및 개인정보 보호를 위해 관리자 모드를 추가하여 벤딩머신을 관리한다.
> 
### 업데이트
+ 2021.03.17 pr01_maker 프로젝트 시작
+ 2021.03.19 pr01_maker/CoffeeMaker.java 업로드
+ 2021.03.20 CoffeeMaker.java 초기(설명 및 커피만들기, 관리자 목록선택)설정 추가
+ 2021.03.20 레퍼지토리 삭제 후 다시 생성
+ 2021.03.24 커피 추출(메뉴얼 모드) 함수 추가
+ 2021.03.25 기능 추가 및 변경
  + 변경: [메뉴얼 모드] -> [기본 모드] 이름 변경
  + 추가: [기본모드] makeBasicCoffee()
  + 추가: 원두 추가 함수  put[SIZE]CoffeeBean()  [SIZE] = “Small”, “Medium”, “Large” 
  + 추가: 물 추가 함수  putWater()
  + 추가: 얼음 추가 함수  putIce()
  + 추가: [기본 모드] 아메리카노 생성  makeAmericano(Integer)
+ 2021.03.26 기능 추가 및 변경
  + 변경: 함수명 변경 
	  + makeBasicCoffee() -> startBasicMode()
	  + makeAmericano() -> dripAmericano()
  + 변경: 아이스커피, 기본 커피 추출 함수 분리
  + 추가: [기본 모드] 라떼 추출 함수 dripLatte()
  + 추가: [기본 모드] 모카 추출 함수 dripMocca()
  + 추가: [기본 모드] 아이스 아메리카노, 라떼, 모카 추출 함수 dripIce[커피이름]
+ 2021.03.30 .gitignore 업데이트
+ 2021.04.01 함수삭제
  + 삭제: putSmallCoffeeBean() 
  + 삭제: putLargeCoffeeBean()

### 진행중인 서브 프로젝트
+ pr01_maker : 2021.03.20 ~ 진행중
+ pr02 : 추가예정

### 사용언어
+ Java SE 1.8 only
