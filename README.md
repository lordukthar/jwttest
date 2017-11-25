Read more at: [http://jarbytes.com/jwt-on-dropwizard.html](http://jarbytes.com/jwt-on-dropwizard.html)



POST http://localhost:8080/api/auth/login
body
{
	"username":"user",
	"password":"123"
}

use return in header X-Auth

POST
http://localhost:8080/api/secured/user# jwttest
