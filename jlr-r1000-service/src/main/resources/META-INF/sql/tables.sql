create table JLR_R1000 (
	uuid_ VARCHAR(75) null,
	r1000Id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	period VARCHAR(75) null,
	dealer VARCHAR(75) null,
	partCategory VARCHAR(75) null,
	repairCount INTEGER,
	visitCount INTEGER,
	conCode VARCHAR(75) null,
	percentage INTEGER,
	percentage1 INTEGER,
	percentage2 INTEGER
);