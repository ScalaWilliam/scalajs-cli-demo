resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSPlugin)
name := "ScalaJS Filter"
scalaVersion := "2.12.2"
scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule
mainClass in Compile := Some("HelloWorldApp")
