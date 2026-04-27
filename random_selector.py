import sys, random, os

def main():
  if not len(sys.argv) == 2:
    print("Usage: python random_selector number_of_files_to_randomly_select")
    sys.exit(0)
  try: 
    number_of_files = int(sys.argv[1])
  except:
    print("Argument must be an int")
    sys.exit(0)
  else:
    code_dir = "Claude analysis results/"
    print(number_of_files)
    for _ in range(0, number_of_files):
      print(random.choice(os.listdir(code_dir))[13:-9])

if __name__ == "__main__":
  main()