web: cd build ; java $JAVA_OPTS -Dgrails.env=prod -jar ../build/server/webapp-runner-*.jar --expand-war --port $PORT libs/*.war;
web: java -Dserver.port=$PORT $JAVA_OPTS -jar build/libs/*.war