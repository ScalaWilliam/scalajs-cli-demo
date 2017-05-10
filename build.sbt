resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSPlugin)
name := "Scala.js CLI Demo"
scalaVersion := "2.12.2"
scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule
mainClass in Compile := Some("HelloWorldApp")
moduleName in fullOptJS := "scalajs-cli-demo"