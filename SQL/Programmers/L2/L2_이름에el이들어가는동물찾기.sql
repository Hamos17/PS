-- 코드를 입력하세요
SELECT ANIMAL_ID
     , NAME
FROM   ANIMAL_INS
WHERE  1 = 1
AND    ANIMAL_TYPE = 'Dog'
AND    (NAME LIKE '%EL%'
        OR
        NAME LIKE '%el%')
ORDER BY NAME;