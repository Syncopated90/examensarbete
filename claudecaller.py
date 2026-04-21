import os
import requests
import json
import time
import sys

def main():
  sys.exit()

def call_claude(filename):
  urlstring = 'https://api.anthropic.com/v1/messages'
  headersmap = {"Content-Type": "application/json", "anthropic-version": "2023-06-01", "x-api-key" : os.environ["ANTHROPIC_API_KEY"]}
  results_subdir = "Claude analysis results/"

  with open(filename, "r", encoding='utf8') as java_file:
    code = java_file.read()
  datamap = {
    "model": "claude-sonnet-4-6",
    "max_tokens": 3000,
    "messages": [
      {
        "role": "user",
        "content": "Perform static analysis on the below java code. Provide line reference and rule name for the broken rule. " +
          "Do not give a summary at the end. Be terse.\n" + code
      }
    ]
  }
  x = requests.post(urlstring, headers = headersmap, data = json.dumps(datamap))
  print(x.text)
  json_answer = json.loads(x.text)
  with open(results_subdir + "claudeanswer_" + filename[11:-5] + f"_{(time.time() % 10000):.0f}" + ".txt", "w", encoding = 'utf8') as text_file:
    text_file.write(json_answer["content"][0]["text"])

if __name__ == "__main__":
  main()