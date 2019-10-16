create table sys_user
(
    id       int(11) primary key,
    nickname varchar(255),
    username varchar(255),
    avatar   varchar(255),
    password varchar(255)
);

create table sys_role
(
    id       int(11) primary key,
    name varchar(255)
)