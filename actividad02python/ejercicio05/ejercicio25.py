from .CuentaBancaria import CuentaBancaria
from .tipo import tipo


def main() -> None:
    cuenta = CuentaBancaria("Pedro", "Perez", "123456789", tipo.AHORROS)
    cuenta.imprimir()
    cuenta.consignar(200000)
    cuenta.consignar(300000)
    cuenta.retirar(400000)


if __name__ == "__main__":
    main()
