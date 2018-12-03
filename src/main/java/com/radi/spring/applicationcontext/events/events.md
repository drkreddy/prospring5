### Events
* Event extends _ApplictionEvent_ having source in constructor.
* Listenr implements _ApplicationListener_ and implements _onApplicationEvent(ApplicationEvent applicationEvent) _ method
* Publisher implements _ApplicationContextAware_ and calls _context.publishEvent_ to send the message

* Has to be used for decoupling minimal requirements, like updating cache when db modified. Rather than maintaining direct dependencies. For LongRunning we have to use JMS not this.