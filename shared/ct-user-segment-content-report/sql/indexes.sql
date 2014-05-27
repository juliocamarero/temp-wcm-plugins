create index IX_D00D8502 on UserSegmentContentReport_UserSegmentContent (userSegmentId);
create index IX_2BD71E32 on UserSegmentContentReport_UserSegmentContent (userSegmentId, className, classPK, eventType);
create index IX_D2A260C0 on UserSegmentContentReport_UserSegmentContent (userSegmentId, createDate);