KOSTA - 1차 팀 프로젝트 
=======
# 📃목차

- 개요
    - 프로젝트 목적
    - 아이디어 및 배경
- 팀원
    - 소개 및 역할 분담
- 설계
    - 주요 기능
    - 사용된 기술 스택
    - 프로젝트 구조
    - ERD 설계
- 동작 화면
- issue 사항
<br/>


# 📌 프로젝트 목적

- 와챠피디아와 유사한 영화 정보 플랫폼을 구현하여, 사용자에게 최신 영화 정보를 제공합니다.
- API 통신, DB 설계, MVC패턴 로직 구현 등 웹 개발 필요한 지식 습득합니다.
- 클론 코딩을 활용하여 단기간에 프로젝트 개발 합니다.
<br/>


# 💡 아이디어 및 배경

- 1차 프로젝트를 기획하는 단계에서 공공 API를 사용한 프로젝트를 개발하면 좋겠다는 생각이 들었습니다
- 팀장의 제안으로 와챠피디아를 클론코딩하여 프로젝트를 진행하면 좋겠다는 생각이 들었습니다.
<br/>

# 🤼 팀 멤버 소개
| **항목**    | **재원**                                                                                       | **선우**                                                                                       | **정아**                                                                                       | **혁주**                                                                                       |
|:----------|:----------------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------|
| **사진**   | ![김재원](https://github.com/user-attachments/assets/c4d78a14-2eff-4b21-b37f-f293addbd65e)                              | ![한선우](https://avatars.githubusercontent.com/u/120350053?v=4)    | ![최정아](https://github.com/user-attachments/assets/20aab45b-c93b-4166-9c77-acb1288f47fe)    | ![석혁주](https://github.com/user-attachments/assets/bb81db9e-db1d-4c15-a78c-531344dcc4e7)    |
| **역할**   | BackEnd(팀장)                                                                                             | BackEnd(팀원)                                                                                             | FrontEnd(팀원)                                                                                             | FrontEnd(팀원)                                                                                             |
| **GitHub** | [김재원 GitHub](https://github.com/UsoD98)                                                   | [한선우 GitHub](https://github.com/hamster0410)                                                   | [최정아 GitHub](https://github.com/berryicebox)                                                   | [석혁주 GitHub](https://github.com/cocoball0)                                                   |
| **주 작업** | 1. 전체 프로젝트 총괄 <br>2. 회원 CRUD 기능 구현 <br>3. 게시글 평점, 코멘트 구현 <br>4. 소셜 기능 구현 <br>5. 영화 API 설계 <br> 6. ERD 설계 <br> 7. 발표 | 1. 주간, 개봉예정작 API 처리 <br> 2. 위시리스트 기능 구현 <br> 3. 화면 전환 처리 <br> 4. 비밀번호 찾기 기능 구현  <br> 5. 영화 정보 검색기능 구현 <br> 6. PPT 제작| 1. 메인 홈페이지 구현 <br> 2. 사용자 개인 페이지(메인정보, 팔로워, 찜) <br> 3. html & css 관리 | 1. 메인 홈페이지 구현 <br> 2. 로그인 페이지 구현 <br> 3. 영화 detail 페이지 구현 <br> 4. html & css 관리 |
<br/>

# 🔑 주요 기능

- **회원 관리**
    - 세션 기반 인증 방식을 활용하여 회원가입, 로그인 유지, 회원 전용 기능을 구현했습니다.
- **실시간 영화 정보 제공**
    - 공공 API를 사용해 실시간 박스오피스 정보를 화면에 출력합니다.
    - 일별, 주간, 공개예정작 정보를 메인페이지에 출력하고 db에 전처리하여 저장합니다.
    - 기능 구현을 위해 두 API영화정보 테이블을  join하여 사용합니다.
- **영화 평점 & 코멘트 기능**
    - 사용자마다 영화별 평점을 기록하고 코멘트를 남깁니다.
    - 메인 페이지에서 다른 사용자에 최근 평점 및 코멘트를 출력합니다.
- **영화 보고싶어요 & 보는 중 기능**
    - 내가 찜한 영화 리스트를 확인합니다.
    - 내가 보는 중인 영화 리스트를 확인합니다.
- **사용자 팔로우 기능**
    - 다른 사용자를 팔로우 하여 소셜 커뮤니케이션 기능을 지원합니다.
- **비밀번호 찾기**
    - 사용자에 메일로 임시 비밀번호를 전달합니다.
<br/>


# <img src="https://github.com/user-attachments/assets/8add337f-87f1-43c4-bb30-a0f9f9e19b1c" width="40" height="40" alt="Image description"> 사용된 기술 스택

![제목을-입력해주세요_-001 (2)](https://github.com/user-attachments/assets/11c71b28-11a3-44a5-a469-2127088d6e41)
<br/>


# <img src="https://github.com/user-attachments/assets/d300fa7e-a678-4422-bb9d-55bdf79e3bc5" width="35" height="35" alt="Image description"> 프로젝트 구조

```bash
├─main
│  ├─java
│  │  └─com
│  │      └─pedia
│  │          └─movie
│  │              ├─config
│  │              ├─movie
│  │              │  ├─controller
│  │              │  ├─dto
│  │              │  ├─entity
│  │              │  ├─repository
│  │              │  └─service
│  │              └─user
│  │                  ├─controller
│  │                  ├─dto
│  │                  ├─entity
│  │                  ├─repository
│  │                  └─service
│  └─resources
│      ├─static
│      │  └─common
│      │      ├─css
│      │      └─js
│      └─templates
│          ├─fragments
│          └─user
└─test
    └─java
        └─com
            └─pedia
                └─movie
```
<br/>


# 🧱  ERD 설계

![image (9)](https://github.com/user-attachments/assets/6961ca77-8a23-4761-a31e-d43dfc4831c0)
<br/>


# 🔥 동작 화면
### 홈페이지
<p align="center">
  <img src="https://github.com/user-attachments/assets/bb6ae3be-5c0c-4427-b7ab-c5c0f632cdb7" style="display: block; margin: auto; border: 2px solid #000;">
</p>
<br/>

### 화면전환
<p align="center">
  <img src="https://github.com/user-attachments/assets/f97c734e-6bd2-4915-9bc3-2d097e22748a" style="display: block; margin: auto; border: 2px solid #000;">
</p>
<br/>

### 회원기능
<p align="center">
  <img src="https://github.com/user-attachments/assets/d8036d6b-4634-484b-b956-1ec146f1506f" style="display: block; margin: auto; border: 2px solid #000; width: 200px;">
  <img src="https://github.com/user-attachments/assets/349e2623-b590-4a9f-a83b-2de555d6afc8" style="display: block; margin: auto; border: 2px solid #000; width: 200px;">
  <img src="https://github.com/user-attachments/assets/90449483-69f4-4c42-8c72-0b25c5c7b1ea" style="display: block; margin: auto; border: 2px solid #000; width: 200px;">
</p>

<br/>

### 평점 및 찜하기
<p align="center">
  <img src="https://github.com/user-attachments/assets/b3018a40-4826-484b-9f13-bddc7709b58a" style="display: block; margin: auto; border: 2px solid #000;">
</p>
<br/>

### 코멘트
<p align="center">
  <img src="https://github.com/user-attachments/assets/6c7fcf19-b3e8-4050-be3e-f2b425a89762" style="display: block; margin: auto; border: 2px solid #000;">
</p>
<br/>

### 마이페이지
<p align="center">
  <img src="https://github.com/user-attachments/assets/9ae7db08-1ae7-4997-a11b-1b8e58595943" style="display: block; margin: auto; border: 2px solid #000;">
</p>
<br/>

### 영화 검색
<p align="center">
  <img src="https://github.com/user-attachments/assets/e5d6a09a-9a36-48cb-ac8b-6e2b6c37aa11" style="display: block; margin: auto; border: 2px solid #000;">
</p>
<br/>

# ❓ Issue 사항
**팔로잉/팔로우 상태 동적 시각화**
   - 팔로우 상태에 따라 색이 다르게 보이도록 ThymeLeaf의 `classappend`를 활용하여 시각화 했습니다.
<br/>

# 참고자료
ppt : https://www.miricanvas.com/v/13n2jqg
<br>
notion : https://www.notion.so/1-69371a9ec7d2464dadd9e7b598e89a36
