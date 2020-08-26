#start app on docker container

#shoose java version
export JAVA_HOME=`/usr/libexec/java_home -v 14`

#build JAR file
mvn clean install

#build docker image
docker build -t zd/zd-product:0.0.1 .

#start docker container
docker run --rm -d -p 9090:9090  zd/zd-product:0.0.1