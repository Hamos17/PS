-- 코드를 입력하세요
SELECT ID
     , NAME
     , HOST_ID
FROM   PLACES
WHERE  1 = 1
AND    HOST_ID IN (SELECT HOST_ID
                   FROM PLACES
                   GROUP BY HOST_ID
                   HAVING COUNT(HOST_ID) >= 2
                  )
ORDER BY ID;