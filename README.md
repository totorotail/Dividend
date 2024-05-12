# Dividend Project
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">  <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white">  <img src="https://img.shields.io/badge/java-%23ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"> 
<img src="https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=springboot&logoColor=white">
<br/><br/>

## 📜프로젝트 소개
- 미국 주식 배당금 정보를 제공하는 API 서비스를 개발
<br/><br/>

## ⭐주요 기능
✅ GET - finance/dividend/{companyName}
- 회사 이름을 인풋으로 받아서 해당 회사의 메타 정보와 배당금 정보를 반환
  
✅ GET - company/autocomplete
- 자동완성 기능을 위한 API

✅ GET - company
- 서비스에서 관리하고 있는 모든 회사 목록을 반환

✅ POST - company
- 새로운 회사 정보 추가

✅ DELETE - company/{ticker}
- ticker 에 해당하는 회사 정보 삭제

✅ POST - auth/signup
- 회원가입 API

✅ POST - auth/signin
- 로그인 API
