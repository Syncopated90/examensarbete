import timeit, requests, json, os

def main():
  check_claude_latency()
def check_claude_latency():
  urlstring = 'https://api.anthropic.com/v1/messages'
  headersmap = {"Content-Type": "application/json", "anthropic-version": "2023-06-01", "x-api-key" : os.environ["ANTHROPIC_API_KEY"]}
  datamap = {
    "model": "claude-sonnet-4-6",
    "max_tokens": 3000,
    "messages": [
      {
        "role": "user",
        "content": ""
      }
    ]
  }
  latency = 0.0
  for _ in range(0, 100):
    start = timeit.default_timer()
    x = requests.post(urlstring, headers = headersmap, data = json.dumps(datamap))
    end = timeit.default_timer()
    print(x.text)
    #print(f"time to send one claude message: {end - start} s")
    latency += (end - start)
  print(f"total latency for 100 runs: {latency}")
  print(f"average per file: {latency/100}")
if __name__ == "__main__":
  main()