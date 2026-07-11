```python
import re
import pandas as pd
import matplotlib.pyplot as plt

# Paste your Java application output here
java_output = """
Added data point: price=506.049988, timestamp=2026-05-26T10:28:36.547871559Z
Added data point: price=506.120000, timestamp=2026-05-26T10:28:51.547871559Z
Added data point: price=506.250000, timestamp=2026-05-26T10:29:06.547871559Z
Added data point: price=506.180000, timestamp=2026-05-26T10:29:21.547871559Z
"""

# Extract price and timestamp values
matches = re.findall(
    r"price=([0-9.]+), timestamp=([^\n]+)",
    java_output
)

# Create DataFrame
df = pd.DataFrame(
    matches,
    columns=["price", "timestamp"]
)

# Convert data types
df["price"] = df["price"].astype(float)
df["timestamp"] = pd.to_datetime(df["timestamp"])

# Display extracted data
print(df)


# Create line graph
plt.figure(figsize=(10, 5))

plt.plot(
    df["timestamp"],
    df["price"],
    marker="o"
)

# Chart details
plt.title("DIA Price Over Time")
plt.xlabel("Timestamp")
plt.ylabel("Price")

# Improve readability
plt.xticks(rotation=45)
plt.tight_layout()

# Display graph
plt.show()
```
