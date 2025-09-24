from tipo import Tipo

class CuentaBancaria:
    def __init__(self, nombres_titular: str, apellidos_titular: str, numero_cuenta : str,
                 tipo_cuenta : Tipo):
        
        self.nombres_titular = nombres_titular
        self.apellidos_titular = apellidos_titular
        self.numero_cuenta = numero_cuenta
        self.tipo_cuenta = tipo_cuenta
        self.saldo = 0.0
        
        
        
        
    