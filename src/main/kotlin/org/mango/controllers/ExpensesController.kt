package org.mango.controllers

import org.jboss.resteasy.annotations.ResponseObject
import org.mango.dto.Expense
import repository.ExpenseRepository
import javax.transaction.Transactional
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import kotlin.math.exp

@Path("/expenses")
class ExpensesController(val repository: ExpenseRepository) {

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun createExpense(expense: Expense): Response {
        repository.persist(expense);
        return Response.ok(expense).status(201).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllExpenses(): Response = Response.ok(repository.listAll()).build()

    @GET
    @Path("/{id}")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    fun getExpense(@PathParam("id") id : Long) : Response = Response.ok(repository.findById(id)).build();

    @DELETE
    @Path("/{id}")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteExpense(@PathParam("id") id: Long) : Response {
        repository.deleteById(id);
        return Response.ok("Item in $id has been deleted").build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun updateExpense(expense: Expense, @PathParam("id") id: Long) : Response {
        repository.update("" +
                "expense = '${expense.expense}', " +
                "roommate = '${expense.roommate}', " +
                "price = ${expense.price}, " +
                "date = '${expense.date}'" +
                "where id = $id");
        return Response.ok(repository.findById(id)).build();
    }

}