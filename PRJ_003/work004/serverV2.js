/*
Es otra variación de server.js
*/
var http = require("http");

function onRequest(request, response) {
  response.writeHead(200, {"Content-Type": "text/html"});
  response.write("Hola Mundo Version 2");
  response.end();
  console.log("Se ha procesado una petición"+response);
}

http.createServer(onRequest).listen(8888);

console.log("Servidor Iniciado.");