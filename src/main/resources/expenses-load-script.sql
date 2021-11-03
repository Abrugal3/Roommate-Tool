insert into expense ("id", expense, roommate, price, date)
values (1, 'Rent', 'Anthony', 1200.00, '11/01/2021');

insert into expense ("id", expense, roommate, price, date)
values (2, 'Water', 'Felipe', 25.00, '11/01/2021');

insert into expense ("id", expense, roommate, price, date)
values (3, 'Internet', 'Anthony', 59.99, '11/11/2021');

select setval('hibernate_sequence', 3, true);