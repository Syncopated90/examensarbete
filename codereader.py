import json
import time

def main():
  filename = "AbbreviateJournalCleanup"
  with open("claudeanswer_" + filename, "r") as text_file:
    claude_answer = text_file.read()
    claude_json = json.loads(claude_answer)
  print(claude_answer)
  print("")
  print(claude_json["content"][0]["text"])
  with open("claudeanswer_" + filename + f"_{(time.time() % 10000):.0f}" + "_text.txt", "w") as tf:
    tf.write(claude_json["content"][0]["text"])
  #with open("AbbreviateJournalCleanup.java", "r") as java_file:
  #  code = java_file.read()
  #print(code)
if __name__ == "__main__":
  main()