This project provides simple soap integration with spring boot.
to run:
mvn spring-boot:run
to send soap request:
curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws

