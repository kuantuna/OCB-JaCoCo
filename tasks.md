# Tasks:
## 1. Find what Maven does when profile doesn't exist.

Run the following command (although the profile "tuna" doesn't exist.)
```
mvn install -DskipTests -Ptuna
```
build is successfully done and got the following warning.
```
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.779 s
[INFO] Finished at: 2021-08-02T15:24:28+03:00
[INFO] ------------------------------------------------------------------------
[WARNING] The requested profile "tuna" could not be activated because it does not exist.
```

## 2. Find out what coveralls:report is (some Maven plugin that may be saving coverage reports to coveralls.io) (potential task: build a similar pluing for codecov.io)


Link of the github repo of the plugin: https://github.com/trautonen/coveralls-maven-plugin

Yes, basically what it does is that it submits the generated code coverage reports to Coveralls web service.

## 3. Find difference between jacoco:report and jacoco:report-integration

As it pointed out in the documentation, report-integration goal is "same as report, but provides default values suitable for integration-tests"

## 4. What does "gradle jacoco:report" (this may just save files as "mvn … jacoco")

Yes, this is used to generate HTML, Xml and CSV reports of Jacoco coverage data.

## 5. Check if one can upload coverage to Sonar

Yes, one can upload coverage to Sonar as can be seen in here: https://tomgregory.com/how-to-measure-code-coverage-using-sonarqube-and-jacoco/
