FROM eclipse-temurin:17-jdk-alpine
ENV PORT= 8080
WORKDIR app
COPY . .
RUN mvn install
EXPOSE $PORT 
#COPY target/*.jar app.jar
CMD ./mvnw spring-boot:run