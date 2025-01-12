package bootcamp.emazon.transaction.domain.api;

import bootcamp.emazon.transaction.domain.model.Article;

public interface IArticleClientServicePort {

    Article getArticle(String articleName);
}
