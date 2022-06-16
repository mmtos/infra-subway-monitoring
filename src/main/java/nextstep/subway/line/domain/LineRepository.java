package nextstep.subway.line.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LineRepository extends JpaRepository<Line, Long> {

    List<Line> findAll();
}
