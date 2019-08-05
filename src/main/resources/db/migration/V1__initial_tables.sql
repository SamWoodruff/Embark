create table hire(
     id serial primary key,
     first_name varchar,
     last_name varchar
);

create table task(
    id serial primary key,
    content varchar,
    deadline date,
    hire_id int,
    FOREIGN KEY(hire_id)
    REFERENCES hire(id)
    ON DELETE CASCADE
);