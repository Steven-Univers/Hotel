package Controllers

import Entities.Cliente
import Utils.Printer

class ClienteController {

    private val printer = Printer()
    private val listaClientes = mutableListOf<Cliente>(
        Cliente(
            "Osvaldo",
            "Palacios",
            "Flores",
            "PAFO980723KY9",
            "SMZ 510 Mz 1 Lt 1",
            "1234567890",
            "osvaldopf@gmail.com"
        )
    )

    fun registrarCliente() {
        printer.printMsg("Ingrese los nombres")
        val nombres = readln()
        printer.printMsg("Ingrese el primer apellido")
        val primerApellido = readln()
        printer.printMsg("Ingrese el segundo apellido")
        val segundoApellido = readln()
        printer.printMsg("Ingrese el RFC")
        val rfc = readln()
        printer.printMsg("Ingrese la dirección")
        val direccion = readln()
        printer.printMsg("Ingrese el número telefónico")
        val numeroTelefonico = readln()
        printer.printMsg("Ingrese el correo electrónico")
        val email = readln()

        val clienteAgregado = Cliente(
            nombres, primerApellido, segundoApellido, rfc, direccion, numeroTelefonico, email
        )

        listaClientes.add(clienteAgregado)
    }

    fun mostrarClientes() {
        if (listaClientes.isEmpty()) {
            printer.printMsg("No se encuentran clientes registrados")
        } else {
            var contador = 1
            for (cliente in listaClientes) {
                printer.printMsg("$contador-" + cliente.getDatosCliente())
                contador++
            }
        }
    }

    fun cargarClientesDesdeBD(){

    }

    fun obtenerClientePorIndice(indice: Int): Cliente = listaClientes[indice]

    fun noHayClientesRegistrados(): Boolean = listaClientes.isEmpty()
}
