SELECT
    COUNT(*) as COUNT
FROM
    ecoli_data
WHERE
    -- 이진수 1,2,4,8  
    -- 형질  1,2,3,4
    -- 조건 : 1,3형질 필요, 2형질 불필요 
    ((genotype & 1) > 0 or (genotype & 4) > 0)
AND
    (genotype & 2) = 0;