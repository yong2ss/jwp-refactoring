package kitchenpos.domain;

import kitchenpos.common.exceptions.MinimumOrderTableNumberException;
import kitchenpos.common.exceptions.NotEmptyOrderTableGroupException;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("테이블 그룹 도메인 테스트")
class TableGroupTest {

    private OrderTable 테이블1;
    private OrderTable 테이블2;
    private OrderTable 빈_테이블;
    private TableGroup 테이블그룹;

    @BeforeEach
    void setup() {

        테이블1 = OrderTable.of(2, false);
        테이블2 = OrderTable.of(4, false);
        빈_테이블 = OrderTable.of(0, true);
        테이블그룹 = TableGroup.from(Lists.newArrayList(테이블1, 테이블2));

    }

    @DisplayName("생성 테스트")
    @Test
    void createTest() {
        assertThat(TableGroup.from(Lists.newArrayList(테이블1, 테이블2)))
                .isEqualTo(TableGroup.from(Lists.newArrayList(테이블1, 테이블2)));
    }

    @DisplayName("주문 테이블이 최소 2개 이상이어야 한다")
    @Test
    void validateTest1() {
        final List<OrderTable> 테이블목록 = Collections.singletonList(테이블2);

        assertThatThrownBy(() -> TableGroup.from(테이블목록))
                .isInstanceOf(MinimumOrderTableNumberException.class);
    }

    @DisplayName("주문 테이블에 빈 테이블이 있으면 안된다")
    @Test
    void validateTest2() {
        final List<OrderTable> 테이블목록 = Lists.newArrayList(테이블1, 빈_테이블);

        assertThatThrownBy(() -> TableGroup.from(테이블목록))
                .isInstanceOf(NotEmptyOrderTableGroupException.class);
    }

    @DisplayName("단체 해지를 할 수 있다")
    @Test
    void unGroupTest() {
        테이블그룹.unGroup();
        assertAll(
                () -> assertThat(테이블1.getTableGroup()).isNull(),
                () -> assertThat(테이블2.getTableGroup()).isNull()
        );
    }
}
