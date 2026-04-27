import os, json

def summarize_results():
  summarize_claude()
  #summarize_pmd()
  #summarize_pmd_with_all_rules()
def summarize_claude():
  claude_results_dir = "Claude analysis results/"
  file_results = []
  for file in os.listdir(claude_results_dir):
    with open(claude_results_dir + file, "r", encoding="utf-8") as code_file:
      code = code_file.read()
      for result in code.split("\n"):
        if len(result) != 0:
          file_results.append(file[13:-9] + ".java" +  ": " + result.replace('\u2014','-'))
      #file_results.extend(code.split("\n"))
  for result in file_results:
    print(result)
  #print(file_results[0])
  print(len(file_results))
  with open("claude_results_summary_320_files.txt", "w", encoding = "utf-8") as file:
    for result in file_results:
      file.write(json.dumps(result))
      file.write("\n")

def summarize_pmd():
  pmd_results_dir = "PMD_analysis_results/"
  pmd_results = []
  for file in os.listdir(pmd_results_dir):
    with open(pmd_results_dir + file, "r", encoding = 'utf-8') as code_file:
      code = json.loads(code_file.read())
      if len(code['runs'][0]['results']) == 0:
        continue
      for result in code['runs'][0]['results']:
        pmd_results.append(result)
  for result in pmd_results:
    print(result)
  print(len(pmd_results))
  with open("pmd_results_summary_320_files.txt", 'w', encoding = 'utf-8') as file:
    for result in pmd_results:
      file.write(json.dumps(result))
      file.write("\n")

def summarize_pmd_with_all_rules():
  pmd_results_dir = "PMD_analysis_results_with_all_rules/"
  pmd_results = []
  for file in os.listdir(pmd_results_dir):
    with open(pmd_results_dir + file, "r", encoding = 'utf-8') as code_file:
      code = json.loads(code_file.read())
      if len(code['runs'][0]['results']) == 0:
        continue
      for result in code['runs'][0]['results']:
        pmd_results.append(result)
  for result in pmd_results:
    print(result)
  print(len(pmd_results))
  with open("pmd_results_summary_with_all_rules_320_files.txt", 'w', encoding = 'utf-8') as file:
    for result in pmd_results:
      file.write(json.dumps(result))
      file.write("\n")
def main():
  summarize_results()
if __name__ == "__main__":
  main()