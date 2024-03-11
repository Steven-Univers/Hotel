package Entities

class Reservacion(
    private val habitacion: Habitacion,
    private val cliente: Cliente,
    private val fechaInicio: String,
    private val fechaFin: String,
    private var totalNoches: Int,
    private var estaCancelada: Boolean = false,
) {
    private var precioTotal = 0.0

    fun calcularPrecio() {
        precioTotal = habitacion.precioPorNoche * totalNoches
    }

    fun cancelarReserva() {
        estaCancelada = true
    }

    fun actualizarNoches(totalNoches: Int) {
        this.totalNoches = totalNoches
    }

    fun getTotal(): Double = precioTotal

    fun getDatosReserva(): String {
        return "Nombre cliente ${cliente.getDatosCliente()}" + "Total de noches: $totalNoches" +
                "Fecha inicio :  $fechaInicio" +
                "Fecha final :  $fechaFin" +
                "Total : $precioTotal"
    }
}
