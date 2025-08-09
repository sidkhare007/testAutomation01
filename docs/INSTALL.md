# Installation and Mac M1 notes

1. Homebrew (if not installed):
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

2. Install OpenJDK 17 and Maven:
   brew install openjdk@17
   brew install maven
   sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
   export JAVA_HOME="/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home"
   export PATH="$JAVA_HOME/bin:$PATH"

3. Install Chrome and Chromedriver:
   brew install --cask google-chrome
   brew install --cask chromedriver

4. Docker & docker-compose:
   Install Docker Desktop for Mac (Apple Silicon) from https://www.docker.com/products/docker-desktop/
   Make sure to enable experimental features if required and allow use of Rosetta if needed for some images.

5. Run tests:
   mvn clean test

6. Run ZAP security scan:
   bash zap/run_zap_scan.sh https://demoqa.com

7. Run k6 performance test:
   docker run --rm -i -v $(pwd)/k6:/scripts loadimpact/k6 run /scripts/demo-load-test.js

