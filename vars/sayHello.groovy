import org.example.Helper

def call(String name = 'there'){
  def greeting = Helper.readGreeting()
  def upperName = Helper.toUpper(name)
  echo "${greeting} ${upperName}
}
