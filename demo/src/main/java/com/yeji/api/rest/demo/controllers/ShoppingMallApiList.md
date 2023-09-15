package com.yeji.api.rest.demo.controllers;


    1. 로그인/회원가입 자원 user
     - 로그인 : user/login -> getmapping
     - 로그아웃 : user/logout -> patchmapping
     - 회원가입 : user/join -> postmapping

    2. 내정보 자원 members
     - 내 정보 조회 : members/{id} -> getmapping
     - 내 정보 수정 : members/{id} -> patchmapping

    3. 상품 자원 products
     - 상품 목록 : products/ -> getmapping
     - 상품 상세 : products/{id} -> getmapping

    4. 상품리뷰 자원 review
     - 상품에 리뷰 작성 : review/{id} -> postmapping
     - 상품에 리뷰 수정 : review/{id} -> patchmapping
     - 상품에 리뷰 삭제 : review/{id} -> deletemapping

    5. 장바구니 자원 cart
     - 장바구니에 상품 추가 : cart/{id} -> postmapping, patchmapping
     - 장바구니에 상품 삭제 : cart/{id} -> deletemapping
     - 장바구니 (담긴 상품 목록) : cart/{id} -> getmapping

    6. 구매 자원 orders
     - 주문하기 : orders/{id}/action -> postmapping, patchmapping
     - 주문 목록 : orders/{id}/list -> getmapping

