# 키친포스

## 요구 사항
### 상품
- [x] 상품을 생성한다.
  - [x] 상품의 금액은 0원을 이상이여야한다.
- [x] 상품 내역을 조회한다.
### 메뉴(실제 주문 가능 단위)
- [x] 메뉴를 생성한다.
  - [x] 가격은 0원을 초과해야한다.
  - [x] 등록된 상품에 한에서 생성할 수 있다.
  - [x] 상품들의 가격의 합산이 0보다 커야 한다.
- [x] 메뉴 내역을 조회한다.
### 메뉴 그룹(메뉴들의 묶음)
- [x] 메뉴 그룹을 생성한다.
- [x] 메뉴 그룹 내역을 조회한다.
### 주문
- [x] 주문을 생성한다.
  - [x] 주문한 메뉴 내역은 1건 이상이여야한다.
  - [x] 주문한 메뉴들은 모두 메뉴 내역에 등록되어있어야한다.
  - [x] 주문한 테이블 의 존재 유무를 확인한다.
- [x] 주문 내역을 조회한다.
- [x] 주문을 수정한다.
  - [x] 주문이 완료된 건은 수정할 수 없다.
### 주문 테이블
- [x] 주문 테이블을 생성한다.
- [x] 빈 테이블로 상태를 변경한다.
  - [x] 해당 테이블이 그룹된 상태라면 불가하다.
  - [x] 해당 테이블이 식사중이거나 음식이 준비중일 경우는 변경하지 못한다.
- [x] 방문한 손님수를 입력한다.
  - [x] 테이블의 존재 유무를 확인한다.
### 주문 테이블 그룹
- [x] 주문 테이블들을 그룹 지어준다.
  - [x] 테이블들의 존재 유무를 확인한다.
  - [x] 테이블들을 그룹 지어주기 위해선 2개 이상이어야한다.
- [x] 주문 테이블들의 그룹을 해제한다.
  - [x] 해당 그룹이 식사중이거나 음식이 준비중일 경우는 해제하지 못한다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 상품 | product | 메뉴를 관리하는 기준이 되는 데이터 |
| 메뉴 그룹 | menu group | 메뉴 묶음, 분류 |
| 메뉴 | menu | 메뉴 그룹에 속하는 실제 주문 가능 단위 |
| 메뉴 상품 | menu product | 메뉴에 속하는 수량이 있는 상품 |
| 금액 | amount | 가격 * 수량 |
| 주문 테이블 | order table | 매장에서 주문이 발생하는 영역 |
| 빈 테이블 | empty table | 주문을 등록할 수 없는 주문 테이블 |
| 주문 | order | 매장에서 발생하는 주문 |
| 주문 상태 | order status | 주문은 조리 ➜ 식사 ➜ 계산 완료 순서로 진행된다. |
| 방문한 손님 수 | number of guests | 필수 사항은 아니며 주문은 0명으로 등록할 수 있다. |
| 단체 지정 | table group | 통합 계산을 위해 개별 주문 테이블을 그룹화하는 기능 |
| 주문 항목 | order line item | 주문에 속하는 수량이 있는 메뉴 |
| 매장 식사 | eat in | 포장하지 않고 매장에서 식사하는 것 |
