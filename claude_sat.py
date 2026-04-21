import claudecaller
import os
import random
import timeit

code_dir = "Sourcecode/"
def main():
  #all_files()
  #random_choice()
  #pmd_recheck_with_all_rules()
  print("doing nothing, check claude_sat.py")

def pmd_recheck_with_all_rules():
  files = populate_checked_files()
  start = timeit.default_timer()
  for file in files:
    os.system("pmd.bat check -d C:\\Users\\fredr\\kod\\exjobb\\Sourcecode\\" + file + 
              " -R rulesets/internal/all-java.xml -f sarif -r C:\\Users\\fredr\\kod\\exjobb\\PMD_analysis_results_with_all_rules\\pmdreport_jabref_" + file + ".sarif")
  end = timeit.default_timer()
  print(f"Elapsed time: {end - start}")

def random_choice():
  file_amount = 80
  checked_files = populate_checked_files()
  claude_time = 0.0
  pmd_time = 0.0
  number_of_files_checked = 0
  for _ in range(0, file_amount):
    file = random.choice(os.listdir(code_dir))
    if file not in checked_files:
      checked_files.append(file)
      start = timeit.default_timer()
      run_pmd_single_file(file)
      middle = timeit.default_timer()
      claudecaller.call_claude(code_dir + file)
      end = timeit.default_timer()
      pmd_time += (middle - start)
      claude_time += (end - middle)
      number_of_files_checked += 1
  print(f"pmd time: {pmd_time}")
  print(f"claude time: {claude_time}")
  print(f"number of files checked: {number_of_files_checked}")
def populate_checked_files():
  checked_files = []
  analysed_files_dir = "PMD_analysis_results"
  for file in os.listdir(analysed_files_dir):
    checked_files.append(file[17:-6])
  return checked_files
def all_files():
  for file in os.listdir(code_dir):
    run_pmd_single_file(file)
    claudecaller.call_claude(code_dir + file)
def run_pmd():
  os.system("pmd.bat check -d C:\\Users\\fredr\\kod\\exjobb\\Sourcecode -R rulesets/java/quickstart.xml -f sarif -r C:\\Users\\fredr\\kod\\exjobb\\PMD_analysis_results\\pmdreport_jabref.sarif")
def run_pmd_single_file(file):
  os.system("pmd.bat check -d C:\\Users\\fredr\\kod\\exjobb\\Sourcecode\\" + file + " -R rulesets/java/quickstart.xml -f sarif -r C:\\Users\\fredr\\kod\\exjobb\\PMD_analysis_results\\pmdreport_jabref_" + file + ".sarif")
if __name__ == "__main__":
  main()