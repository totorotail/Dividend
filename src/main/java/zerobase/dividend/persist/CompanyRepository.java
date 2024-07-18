package zerobase.dividend.persist;

import zerobase.dividend.persist.entity.CompanyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    boolean existsByTicker(String ticker);

    Optional<CompanyEntity> findByName(String name);

    Optional<CompanyEntity> findByTicker(String ticker);

    // StartingWith: 특정 키워드(s)로 시작, IgnoreCase: 대소문자 구별 x
    Page<CompanyEntity> findByNameStartingWithIgnoreCase(String s, PageRequest limit);
}
