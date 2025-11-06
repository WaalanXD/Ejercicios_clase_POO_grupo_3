import tkinter as tk
from tkinter import ttk

class DemoExcepciones:
    def __init__(self, root):
        self.root = root
        self.root.title("Demo de Excepciones")
        self.root.configure(padx=16, pady=16)
        self.root.geometry("460x340")

        cont_botones = ttk.Frame(self.root)
        cont_botones.pack(pady=8)

        ttk.Button(cont_botones, text="Iniciar demo", command=self.correr_demo).pack(side="left", padx=8)
        ttk.Button(cont_botones, text="Limpiar", command=self.limpiar).pack(side="left", padx=8)

        self.txt = tk.Text(self.root, height=12, width=52, font=("Courier", 11))
        self.txt.pack(pady=8)
        self.txt.config(state="disabled")

    def _append(self, linea: str):
        self.txt.config(state="normal")
        self.txt.insert(tk.END, linea + "\n")
        self.txt.config(state="disabled")
        self.txt.see(tk.END)

    def correr_demo(self):
        self.limpiar()
        try:
            self._append("Entrando al primer try")
            _ = 9999 / 0
            self._append("Después de la división (no debería verse)")
        except ZeroDivisionError:
            self._append("División por cero detectada")
        finally:
            self._append("Saliendo del primer finally")
        self._append("")
        try:
            self._append("Entrando al segundo try")
            obj = None
            obj.upper()
            self._append("Imprimiendo objeto (no debería verse)")
        except Exception:
            self._append("Ocurrió una excepción en el segundo bloque")
        finally:
            self._append("Saliendo del segundo finally")

    def limpiar(self):
        self.txt.config(state="normal")
        self.txt.delete("1.0", tk.END)
        self.txt.config(state="disabled")

class Lanzador:
    @staticmethod
    def main():
        root = tk.Tk()
        DemoExcepciones(root)
        root.mainloop()

if __name__ == "__main__":
    Lanzador.main()