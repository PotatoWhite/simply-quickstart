# Simply는 Maven Central에 등록 중에 있으며 완료이전까지는 아래의 과정으로 Library를 획득할 수 있다.

## sonatype Snaphot Repository 등록

```groovy
repositories {
    mavenCentral()
    maven {
        url 'https://oss.sonatype.org/content/repositories/snapshots/'
    }
}
```

### Import

```groovy
implementation 'io.easywalk:simply-common:0.0.1-SNAPSHOT'
implementation 'io.easywalk:simply-serviceable:0.0.1-SNAPSHOT'
implementation 'io.easywalk:simply-controllable:0.0.1-SNAPSHOT'
```