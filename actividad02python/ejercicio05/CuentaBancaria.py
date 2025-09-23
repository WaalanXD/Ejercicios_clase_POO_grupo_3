from __future__ import annotations

from .tipo import tipo


class CuentaBancaria:
    def __init__(self, nombresTitular: str, apellidosTitular: str, numeroCuenta: str, tipoCuenta: tipo) -> None:
        self.nombresTitular = nombresTitular
        self.apellidosTitular = apellidosTitular
        self.numeroCuenta = numeroCuenta
        self.tipoCuenta = tipoCuenta
        self.saldo: float = 0

    def imprimir(self) -> None:
        print("Titular: " + self.nombresTitular + " " + self.apellidosTitular)
        print("Número de cuenta: " + self.numeroCuenta)
        print("Tipo de cuenta: " + self.tipoCuenta.name)
        print("Saldo: " + str(self.saldo))

    def consultarSaldo(self) -> None:
        print("El saldo actual es: " + str(self.saldo))

    def consignar(self, valor: int) -> bool:
        if valor > 0:
            self.saldo += valor
            print(
                "Se ha consignado $" + str(valor) + " en la cuenta. El nuevo saldo es $" + str(self.saldo)
            )
            return True
        else:
            print("El valor a consignar debe ser mayor que cero.")
            return False

    def retirar(self, valor: int) -> bool:
        if valor > 0 and valor <= self.saldo:
            self.saldo -= valor
            print("Se ha retirado $" + str(valor) + " de la cuenta. El nuevo saldo es $" + str(self.saldo))
            return True
        else:
            print(
                "El valor a retirar debe ser menor que el saldo actual y mayor que cero."
            )
            return False
