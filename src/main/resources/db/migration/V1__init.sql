create table home_message
(
    id int primary key,
    message text not null
);
create sequence home_message_seq;

insert into home_message
values (nextval('home_message_seq'), 'Hello World!');

