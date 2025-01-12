package bootcamp.emazon.transaction.infrastructure.out.entity;

import bootcamp.emazon.transaction.application.dto.article.ArticleResponse;
import bootcamp.emazon.transaction.domain.model.Article;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ArticleResponseMapper {
    Article toArticle(ArticleResponse articleResponse);
}
