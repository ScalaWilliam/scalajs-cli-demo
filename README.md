# Scala.js CLI demo [![Build Status](https://travis-ci.org/ScalaWilliam/scalajs-cli-demo.svg?branch=master)](https://travis-ci.org/ScalaWilliam/scalajs-cli-demo)

> Publish Scala.js apps through NPM

[![NPM](https://nodei.co/npm/scalajs-cli-demo.png?compact=true)](https://nodei.co/npm/scalajs-cli-demo/)

## Rationale

Most likely, you've never ran a Scala CLI app, let alone a Scala.js CLI app.

But more likely you have ran Node.js CLI apps. This is because it is super
easy to publish your own CLI application through the NPM repository.

On the other hand. publishing Scala apps is not the easiest thing in the world.
I want to get the best of both worlds: an excellent programming language
and an excellent lightweight distribution channel.

Here's a demo to show you that it is possible.

It includes the use of the [Scala.js Node.js strong-typed API](https://github.com/scalajs-io/nodejs)
by [Lawrence Daniels](https://github.com/ldaniels528).

## Forks
* https://github.com/actionfps/actionfps-clone-logs - combine ScalaJS & EventSource to synchronise logs from HTTP to file.

## Usage

Use the pre-built npmjs package.

```
$ npm install -g scalajs-cli-demo
$ scalajs-cli-demo
Hello world from Scala!
----
To demonstrate we're in Node, here's some of your environment:
PATH = /home/...
```

## Development
I recommend IntelliJ IDEA. 

To iterate, inside SBT run:
```
> ~run
```

or:

```
> ~test
```

## Publishing
Requires SBT & for you to be logged in on NPM.

```
$ npm publish
```
