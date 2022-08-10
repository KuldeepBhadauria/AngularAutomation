###This Project is a cucumber based project for POC on UI Test Automation

**To Run From Test Runner:**
 
**Using single tag:**<br>
tags = "@Regression"<br>

**Using multiple or conditional tags:**<br>
tags = "@Smoke or  @Regression or or @AngularUI"<br>
tags = "(@Smoke or  @Regression) and @Smoke"<br>
tags = "(@Smoke or  @Regression) and not @Smoke"<br>

**To Run through command line:**<br>

mvn clean install -Dcucumber.filter.tags="@Smoke or  @Regression or @AngularUI"<br>
mvn clean verify -Dcucumber.filter.tags="@Smoke or  @Regression or @AngularUI"<br>

**For setting browser through command line**<br>
mvn clean verify -Dcucumber.filter.tags="@Smoke or  @Regression or @AngularUI" -DbrowserPlatform=chrome -Denv=dev<br>