create table CampaignContentReport_CampaignContent (
	id_ LONG not null primary key,
	campaignId LONG,
	className VARCHAR(75) null,
	classPK LONG,
	eventType VARCHAR(75) null,
	count INTEGER,
	createDate DATE null
);