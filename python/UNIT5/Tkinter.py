import tkinter as tk

# Create main window
root = tk.Tk()
root.title("Tkinter Geometry Managers")
root.geometry("400x300")  # Set window size

# ---------- 1. Using pack() for Header ----------
header_label = tk.Label(root, text="User Registration", font=("Arial", 16, "bold"))
header_label.pack(pady=10)  # Centered at the top

# ---------- 2. Using grid() for Form Inputs ----------
form_frame = tk.Frame(root)  # Create a frame for the form
form_frame.pack(pady=20)  # Pack the frame (keeps it centered)

# Labels
tk.Label(form_frame, text="Name:").grid(row=0, column=0, padx=10, pady=5, sticky="e")
tk.Label(form_frame, text="Email:").grid(row=1, column=0, padx=10, pady=5, sticky="e")

# Entry Fields
name_entry = tk.Entry(form_frame)
email_entry = tk.Entry(form_frame)
name_entry.grid(row=0, column=1, padx=10, pady=5)
email_entry.grid(row=1, column=1, padx=10, pady=5)

# ---------- 3. Using place() for Submit Button ----------
submit_btn = tk.Button(root, text="Submit", bg="lightblue", font=("Arial", 12))
submit_btn.place(x=170, y=200)  # Fixed position

# Run the application
root.mainloop()
