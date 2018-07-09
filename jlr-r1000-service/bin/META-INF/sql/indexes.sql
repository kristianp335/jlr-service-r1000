create index IX_52F18540 on JLR_R1000 (userId, createDate);
create index IX_9EFD993C on JLR_R1000 (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A0533EBE on JLR_R1000 (uuid_[$COLUMN_LENGTH:75$], groupId);