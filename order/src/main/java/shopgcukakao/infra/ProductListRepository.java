package shopgcukakao.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopgcukakao.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "productLists",
    path = "productLists"
)
public interface ProductListRepository
    extends PagingAndSortingRepository<ProductList, Long> {}
