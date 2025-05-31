import tkinter as tk
# Function to update the current expression
def press(key):
    current_exp = entry.get()
    entry.delete(0, tk.END)
    entry.insert(0, current_exp + str(key))
# Function to evaluate the current expression
def evaluate():
    try:
        result = eval(entry.get())
        entry.delete(0, tk.END)
        entry.insert(0, str(result))
    except Exception as e:
        entry.delete(0, tk.END)
        entry.insert(0, "Error")
# Function to clear the input
def clear():
    entry.delete(0, tk.END)
# Create the main window
root = tk.Tk()
root.title("Basic Calculator")
# Create an entry widget to display the expression
entry = tk.Entry(root, width=20, font=('Arial', 24), borderwidth=2, relief='solid', justify='right')
entry.grid(row=0, column=0, columnspan=4)
# Button layout for the calculator
buttons = [
    ('7', 1, 0), ('8', 1, 1), ('9', 1, 2), ('/', 1, 3),
    ('4', 2, 0), ('5', 2, 1), ('6', 2, 2), ('*', 2, 3),
    ('1', 3, 0), ('2', 3, 1), ('3', 3, 2), ('-', 3, 3),
    ('0', 4, 0), ('C', 4, 1), ('=', 4, 2), ('+', 4, 3),
]
# Add the buttons to the window
for (text, row, col) in buttons:
    if text == '=':
        button = tk.Button(root, text=text, width=5, height=2, font=('Arial', 20), command=evaluate)
    elif text == 'C':
        button = tk.Button(root, text=text, width=5, height=2, font=('Arial', 20), command=clear)
    else:
        button = tk.Button(root, text=text, width=5, height=2, font=('Arial', 20), command=lambda t=text: press(t))
    button.grid(row=row, column=col)
# Start the Tkinter event loop
root.mainloop()
