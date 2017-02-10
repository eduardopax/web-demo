if [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
  echo -e "Starting to update the download file\n"

  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "Travis"
  git clone --quiet --branch=download https://${GIT_HUB_TOKEN}@github.com/eduardopax/web-demo.git  download > /dev/null

  cp -Rf ./target/webdemo-1.0.war ./download
  cd download
  git add -f .
  git commit -m "Travis build $TRAVIS_BUILD_NUMBER pushed to download"
  git push -fq origin download > /dev/null

  echo -e "Done the upload of war file\n"
fi