package karamo.db

import karamo.db.User
import org.springframework.data.repository.CrudRepository

interface UrlRedirectEntityRepository extends CrudRepository<UrlRedirectEntity, String> {

}