package repository

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import org.mango.dto.Expense
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class ExpenseRepository : PanacheRepository<Expense> {}