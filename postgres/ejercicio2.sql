SELECT public.cliente.nombre, public.cliente.apellido, SUM(public.factura_detalle.cantidad * public.producto.precio) AS total_gastado
FROM public.cliente
JOIN public.factura ON public.cliente.id = public.factura.cliente_id
JOIN public.factura_detalle ON public.factura.id = public.factura_detalle.factura_id
JOIN public.producto ON public.factura_detalle.producto_id = public.producto.id
GROUP BY public.cliente.id, public.cliente.nombre, public.cliente.apellido
ORDER BY total_gastado DESC;


