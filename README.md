# Builder-Design-Pattern-With-Required-Parameter

### You should consider using Builder pattern when:

- Have more than 4 parameters in the constructor -> hard to remember the ordering
- Want to have the named parameters -> provide readable interface
- Some fields are required, some fields are not -> may create in-consistent state of object
- "Unfortunately, the JavaBeans pattern has serious disadvantages of its own. Because construction is split across multiple calls, a JavaBean may be in an inconsistent state partway through its construction." - Effective Java
