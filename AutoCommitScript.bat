#!/bin/bash

cd C:\Users\Lenovo\Desktop\Task-3  # Replace with the path to your repository

# Add your files to the repository
git add .

# Commit the changes
git commit -m "now we can get the info of all products by using get product api api/products, and we can get the info of each product by using their id api/product/(productId)" --allow-empty

# Push the changes to GitHub
git push
