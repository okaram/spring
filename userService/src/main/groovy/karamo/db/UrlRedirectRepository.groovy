package karamo.db

import karamo.db.User
import org.springframework.data.repository.CrudRepository

interface UrlRedirectRepository extends CrudRepository<UrlRedirect, Long> {

}