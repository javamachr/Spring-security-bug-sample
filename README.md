# Sample of spring security bug
When built as native this example fails.

## Steps to reproduce:
```bash
# Run build
mvn -Pnative package
# Run application
./target/bug-native
# Access application
curl -v http://localhost:8080
```