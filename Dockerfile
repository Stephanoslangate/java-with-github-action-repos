FROM openjdk:8
EXPOSE 8080
ADD target/springboot-images-cicd-stephanos.jar springboot-images-cicd-stephanos.jar
ENTRYPOINT ["java","-jar","/springboot-images-cicd-stephanos.jar"]