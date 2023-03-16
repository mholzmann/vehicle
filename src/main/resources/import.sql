insert into person (id, birth_date, name)
values (1, '2001-01-21', 'John Doe'),
       (2, '2002-02-22', 'Jane Doe'),
       (3, '2003-03-23', 'John Smith');

insert into vehicle (id, brand, model, price_per_day)
values (1, 'BMW', 'i3', 500),
       (2, 'Tesla', 'Model S', 400),
       (3, 'Tesla', 'Model 3', 800);

insert into rental (id, discount, enddatetime, startdatetime, person_id, vehicle_id)
values (1, 0, '2023-03-10 17:16:00', '2023-03-12 10:00:35', 1, 1),
       (2, 10, '2023-03-10 17:16:00', '2023-03-12 10:00:35', 2, 2);

SELECT setval('hibernate_sequence', 1000);