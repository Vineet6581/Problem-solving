import numpy as np

def generate_random_array(size, min_val, max_val):
    """Generates a NumPy array with random integers."""
    return np.random.randint(min_val, max_val, size)

def compute_statistics(arr):
    """Computes and returns the mean, median, and standard deviation of a NumPy array."""
    mean_val = np.mean(arr)
    median_val = np.median(arr)
    std_dev = np.std(arr)
    return mean_val, median_val, std_dev

# Generate a random array of 10 integers between 1 and 100
random_array = generate_random_array(10, 1, 100)

# Compute statistics
mean, median, std_dev = compute_statistics(random_array)

# Display results
print("Random Array:", random_array)
print("Mean:", mean)
print("Median:", median)
print("Standard Deviation:", std_dev)
