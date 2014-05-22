<style>
	#campaignContentChart {
		height: 400px;
		min-width: 600px;
		width: 100%;
	}
</style>

<script>
	YUI().use('charts', function (Y) {
		var campaignContentChartDataValues = [
			<#list campaignContents as campaignContent>
				{content:"${campaignContent.getTitle(locale)}", count:${campaignContent.getCount()}}<#if campaignContent_has_next>,</#if>
			</#list>
		];

		var campaignContentCharAxes = {
			count:{
				keys:["count"],
				type:"numeric"
			},
			dateRange:{
				keys:["content"],
				type:"category"
			}
		};

		var campaignContentChart = new Y.Chart({
			axes: campaignContentCharAxes,
			dataProvider: campaignContentChartDataValues,
			horizontalGridlines: true,
			render: "#campaignContentChart",
			type: "bar",
			verticalGridlines: true
		});
	});
</script>

<div id="campaignContentChart"></div>