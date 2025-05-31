import matplotlib.pyplot as plt

# Data: Years and corresponding population (in thousands)
years = [2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023]
population = [500, 520, 540, 565, 590, 620, 650, 680, 710, 740]

# Creating the line plot
plt.figure(figsize=(8, 5))  # Set figure size to 8x5 inches
plt.plot(years, population, marker='o', linestyle='-', color='b', label='Population Growth')

# Adding labels and title
plt.xlabel('Year')  # Label for x-axis
plt.ylabel('Population (in thousands)')  # Label for y-axis
plt.title('City Population Growth Over 10 Years')  # Title of the plot
plt.legend()  # Display legend for the plot
plt.grid(True)  # Enable grid for better visualization

# Show the plot
plt.show()  # Display the line plot
