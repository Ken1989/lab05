create table if not exists Company_Info (
ID int not null primary key auto_increment,
NAME varchar(100),
ID_NO VARCHAR(18),
PHONE_NUM VARCHAR(11),
EMAIL VARCHAR(100),
CREATE_TIME DATE,
MODIFY_TIME DATE,
USE_STATE VARCHAR(1));