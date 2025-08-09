#!/bin/bash
# Run OWASP ZAP baseline scan with docker (make sure docker is running)
TARGET=${1:-https://demoqa.com}
docker run --rm -v $(pwd):/zap/wrk/:rw --network host owasp/zap2docker-stable zap-baseline.py -t $TARGET -r zap-report.html
echo "ZAP scan finished. See zap-report.html in current folder."
