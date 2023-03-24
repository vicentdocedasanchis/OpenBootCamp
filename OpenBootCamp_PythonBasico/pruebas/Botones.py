import tkinter as tk

class RadioList:
    def __init__(self, master, options):
        self.master = master
        self.options = options
        self.var = tk.StringVar(value="")
        self.buttons = []

        for option in options:
            button = tk.Radiobutton(master, text=option, variable=self.var, value=option, command=self.show_selection)
            button.pack(anchor=tk.W)
            self.buttons.append(button)

        reset_button = tk.Button(master, text="Reiniciar", command=self.reset)
        reset_button.pack(anchor=tk.W)

    def show_selection(self):
        print("Opción seleccionada:", self.var.get())

    def reset(self):
        self.var.set("")
        print("Todo ha sido reiniciado.")

if __name__ == '__main__':
    root = tk.Tk()
    options = ["Opción 1", "Opción 2", "Opción 3", "Opción 4"]
    radio_list = RadioList(root, options)
    root.mainloop()
