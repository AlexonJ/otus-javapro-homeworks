package ru.otus.javapro.homeworks.hw15springdata.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import ru.otus.javapro.homeworks.hw15springdata.entities.Category;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriesRepository extends ListCrudRepository<Category, Long> {
    @Query("select * from categories where title = :title")
    Optional<Category> nativeImplFindByTitle(String title);

    Optional<Category> findByTitle(String title);

    List<Category> findAllByIdGreaterThanAndIdLessThanAndTitleLike(Long minId, Long maxId, String title);
}