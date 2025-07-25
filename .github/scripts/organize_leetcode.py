import os
import json
import shutil

ROOT_DIR = "solutions"
DIFFICULTY_DIRS = ["easy", "medium", "hard"]

# Make sure difficulty folders exist
for d in DIFFICULTY_DIRS:
    os.makedirs(os.path.join(ROOT_DIR, d), exist_ok=True)

# Go through files in the solutions folder
for filename in os.listdir(ROOT_DIR):
    file_path = os.path.join(ROOT_DIR, filename)

    # Skip if it's already in a difficulty folder or not a JSON/meta file
    if os.path.isdir(file_path) or not filename.endswith(".json"):
        continue

    with open(file_path, 'r') as f:
        try:
            meta = json.load(f)
            difficulty = meta.get("difficulty", "").lower()
            if difficulty in DIFFICULTY_DIRS:
                shutil.move(file_path, os.path.join(ROOT_DIR, difficulty, filename))
                
                # Also move the code file (.py / .cpp / .js / etc.)
                code_file = filename.replace(".json", f".{meta.get('lang')}")
                code_path = os.path.join(ROOT_DIR, code_file)
                if os.path.exists(code_path):
                    shutil.move(code_path, os.path.join(ROOT_DIR, difficulty, code_file))
        except Exception as e:
            print(f"Failed to process {filename}: {e}")
