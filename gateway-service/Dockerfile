FROM anapsix/alpine-java:8_server-jre_unlimited
MAINTAINER shimmerjordan(shimmerjordan@foxmail.com)
ARG JAR_FILE
ADD target/${JAR_FILE} /opt/app.jar
EXPOSE 9180
ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -Duser.timezone=Asia/Shanghai -Dfile.encoding=UTF-8 -jar /opt/app.jar

# 演示环境GC参数：JAVA_OPS='-Xmx512m -Xms256m -XX:+UnlockDiagnosticVMOptions -XX:+UseConcMarkSweepGC -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=70 -XX:AutoBoxCacheMax=20000 -XX:-UseBiasedLocking -XX:-UseCounterDecay -XX:-OmitStackTraceInFastThrow -Djava.security.egd=file:/dev/urandom -XX:+CMSParallelInitialMarkEnabled -XX:+ParallelRefProcEnabled -XX:+ExplicitGCInvokesConcurrent -XX:+PrintGCApplicationStoppedTime -XX:+PrintGCApplicationConcurrentTime -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintTenuringDistribution -XX:+HeapDumpOnOutOfMemoryError -XX:+PerfDisableSharedMem -XX:+PrintCompressedOopsMode -XX:-PrintGCApplicationStoppedTime'