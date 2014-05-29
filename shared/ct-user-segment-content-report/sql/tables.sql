create table UserSegmentContentReport_UserSegmentContent (
	id_ LONG not null primary key,
	userSegmentId LONG,
	className VARCHAR(75) null,
	classPK LONG,
	eventType VARCHAR(75) null,
	count INTEGER,
	createDate DATE null
);