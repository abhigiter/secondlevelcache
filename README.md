# secondlevelcache
Hibernate Second Level Cache in Spring boot data JPA


Clone & Import this repository as maven project in your IDE.
Start project as spring boot project.

Use this enpoint to create Cities ==
http://localhost:8182/cities
{
    "name": "Pune",
    "population": 1000000
}

Use this get the city ==
http://localhost:8182/cities/1


Now the important thing is in console of IDE.

when you run the get endpoint first time you will see the query, but second time query will not see
as it will pick data from second level cache.
