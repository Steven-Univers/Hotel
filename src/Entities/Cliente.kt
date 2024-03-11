package Entities

class Cliente(
    private val nombres: String,
    private val primerApellido: String,
    private val segundoApellido: String,
    private val rfc: String,
    private val direccion: String,
    private val numeroTelefonico: String,
    private val email: String,
    private val listaReservaciones: MutableList<Reservacion> = mutableListOf()
) {

    fun getDatosCliente(): String {
        return "Nombre: $primerApellido $segundoApellido $nombres RFC: $rfc Dirección: $direccion Número Telefónico: $numeroTelefonico Email: $email"
    }

    fun agregarReserva(reserva: Reservacion) {
        listaReservaciones.add(reserva)
    }
}
