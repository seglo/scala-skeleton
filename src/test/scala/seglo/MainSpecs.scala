package seglo

class MainSpecs extends org.specs2.mutable.Specification {
  "hello returns 'Hello World'" >> {
    Main.hello mustEqual "Hello World"
  }
}
