package org.mango.repository

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import org.mango.dto.Chore
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class ChoreRepository : PanacheRepository<Chore> {}