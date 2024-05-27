-- select parent_id from ecoli_data;
-- select * from ecoli_data where id not in (select parent_id from ecoli_data);
-- select count(id) is COUNT, PARENT_ID  from ecoli_data where id not in (select distinct(parent_id) from ecoli_data where parent_id is not null) group by parent_id;
 
-- SELECT COUNT(id) AS "COUNT", RANK() OVER (ORDER BY PARENT_ID ASC) AS GENERATION 
-- FROM ecoli_data
-- WHERE id NOT IN (SELECT DISTINCT parent_id FROM ecoli_data WHERE parent_id IS NOT NULL)
-- GROUP BY PARENT_ID;


WITH RECURSIVE ecoli AS (
  SELECT id, parent_id, 1 AS generation FROM ecoli_data WHERE parent_id IS NULL
  UNION ALL
  SELECT a.id, a.parent_id, e.generation +1 FROM ecoli_data a INNER JOIN ecoli e ON a.parent_id = e.id
)
SELECT COUNT(*) AS count, generation
FROM ecoli WHERE id NOT IN (SELECT parent_id FROM ecoli WHERE parent_id IS NOT NULL)
GROUP BY generation
ORDER BY generation;
