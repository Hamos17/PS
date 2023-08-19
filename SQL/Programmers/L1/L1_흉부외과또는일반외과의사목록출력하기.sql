-- 코드를 입력하세요
SELECT DR_NAME
     , DR_ID
     , MCDP_CD
     , TO_CHAR(HIRE_YMD, 'YYYY-MM-DD') AS HIRE_YMD
FROM   DOCTOR
WHERE  1 = 1
AND    MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;