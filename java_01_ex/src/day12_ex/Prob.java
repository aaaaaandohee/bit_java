/*package day12_ex;

public class Prob {

}

**문제. 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? => b, d, f

class AirUnit extends Unit {}
class GroundUnit extends Unit {}

class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}

Unit u = new GroundUnit();
Tank t = new Tank();
AirCraft ac = new AirCraft();

a. u = (Unit)ac;
b. u = ac;                        => u = (Unit)ac;
c. GroundUnit gu = (GroundUnit)u;
d. AirUnit au = ac;               => AirUnit au = (AirCraft)ac;
e. t = (Tank)u; 
f. GroundUnit gu = t;             => GroundUnit gu = (GroundUnit)t;




*/