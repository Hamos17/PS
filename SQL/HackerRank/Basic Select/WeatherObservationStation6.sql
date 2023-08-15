SELECT DISTINCT CITY
FROM   STATION
WHERE  1 = 1
AND    (CITY LIKE 'a%'
        OR CITY LIKE 'A%'
        OR CITY LIKE 'E%'
        OR CITY LIKE 'e%' 
        OR CITY LIKE 'I%'
        OR CITY LIKE 'i%'
        OR CITY LIKE 'O%' 
        OR CITY LIKE 'o%'
        OR CITY LIKE 'U%' 
        OR CITY LIKE 'u%');