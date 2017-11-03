FROM armdocker.rnd.ericsson.se/proj_innov8/alpine-jre:v31.07.17

MAINTAINER Igor Tcherniavski <igor.tcherniavski@ericsson.com>

ADD build/libs/crm-latest.jar /crm/crm-latest.jar

ENTRYPOINT ["java", "-jar","/crm/crm-latest.jar"]
# Document that the service listens on port 8088.
EXPOSE 8088
