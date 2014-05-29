<style>
	#userSegmentContentChart {
		height: 400px;
		min-width: 600px;
		width: 100%;
	}
</style>

<script>
	YUI().use('charts', function (Y) {
		var userSegmentContentChartDataValues = [
			<#list userSegmentContents as userSegmentContent>
				{content:"${userSegmentContent.getTitle(locale)}", count:${userSegmentContent.getCount()}}<#if userSegmentContent_has_next>,</#if>
			</#list>
		];

		var userSegmentContentCharAxes = {
			count:{
				keys:["count"],
				type:"numeric"
			},
			dateRange:{
				keys:["content"],
				type:"category"
			}
		};

		var userSegmentContentChart = new Y.Chart({
			axes: userSegmentContentCharAxes,
			dataProvider: userSegmentContentChartDataValues,
			horizontalGridlines: true,
			render: "#userSegmentContentChart",
			type: "bar",
			verticalGridlines: true
		});
	});
</script>

<div id="userSegmentContentChart"></div>