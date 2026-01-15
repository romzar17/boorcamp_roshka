SELECT cliente.nombre, cliente.apellido, COUNT(factura.id)
FROM cliente
JOIN factura ON cliente.id = factura.cliente_id
GROUP BY cliente.nombre, cliente.apellido
ORDER BY COUNT(factura.id) DESC;
