insert into chore ("id", choreName, roommate, date)
values (1, 'Sweep', 'Anthony', '11/02/2021');

insert into chore ("id", choreName, roommate, date)
values (2, 'Mop', 'Felipe', '11/06/2021');

insert into chore ("id", choreName, roommate, date)
values (3, 'Dishes', 'Grayson', '11/04/2021');

insert into chore ("id", choreName, roommate, date)
values (4, 'Laundry', 'David', '11/03/2021');

select setval('hibernate_sequence', 4, true);

insert into expense ("id", expense, roommate, price, date)
values (1, 'Rent', 'Anthony', 1200.00, '11/01/2021');

insert into expense ("id", expense, roommate, price, date)
values (2, 'Water', 'Felipe', 25.00, '11/01/2021');

insert into expense ("id", expense, roommate, price, date)
values (3, 'Internet', 'Anthony', 59.99, '11/11/2021');

select setval('hibernate_sequence', 3, true);
