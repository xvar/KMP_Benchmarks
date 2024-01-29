plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.example.kmp_sample_gen.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.kmp_sample_gen.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}

dependencies {
    implementation(projects.shared)
    implementation(projects.shared1)
    implementation(projects.shared2)
    implementation(projects.shared3)
    implementation(projects.shared4)
    implementation(projects.shared5)
    implementation(projects.shared6)
    implementation(projects.shared7)
    implementation(projects.shared8)
    implementation(projects.shared9)
    implementation(projects.shared10)
    implementation(projects.shared11)
    implementation(projects.shared12)
    implementation(projects.shared13)
    implementation(projects.shared14)
    implementation(projects.shared15)
    implementation(projects.shared16)
    implementation(projects.shared17)
    implementation(projects.shared18)
    implementation(projects.shared19)
    implementation(projects.shared20)
    implementation(projects.shared21)
    implementation(projects.shared22)
    implementation(projects.shared23)
    implementation(projects.shared24)
    implementation(projects.shared25)
    implementation(projects.shared26)
    implementation(projects.shared27)
    implementation(projects.shared28)
    implementation(projects.shared29)
    implementation(projects.shared30)
    implementation(projects.shared31)
    implementation(projects.shared32)
    implementation(projects.shared33)
    implementation(projects.shared34)
    implementation(projects.shared35)
    implementation(projects.shared36)
    implementation(projects.shared37)
    implementation(projects.shared38)
    implementation(projects.shared39)
    implementation(projects.shared40)
    implementation(projects.shared41)
    implementation(projects.shared42)
    implementation(projects.shared43)
    implementation(projects.shared44)
    implementation(projects.shared45)
    implementation(projects.shared46)
    implementation(projects.shared47)
    implementation(projects.shared48)
    implementation(projects.shared49)
    implementation(projects.shared50)
    implementation(projects.shared51)
    implementation(projects.shared52)
    implementation(projects.shared53)
    implementation(projects.shared54)
    implementation(projects.shared55)
    implementation(projects.shared56)
    implementation(projects.shared57)
    implementation(projects.shared58)
    implementation(projects.shared59)
    implementation(projects.shared60)
    implementation(projects.shared61)
    implementation(projects.shared62)
    implementation(projects.shared63)
    implementation(projects.shared64)
    implementation(projects.shared65)
    implementation(projects.shared66)
    implementation(projects.shared67)
    implementation(projects.shared68)
    implementation(projects.shared69)
    implementation(projects.shared70)
    implementation(projects.shared71)
    implementation(projects.shared72)
    implementation(projects.shared73)
    implementation(projects.shared74)
    implementation(projects.shared75)
    implementation(projects.shared76)
    implementation(projects.shared77)
    implementation(projects.shared78)
    implementation(projects.shared79)
    implementation(projects.shared80)
    implementation(projects.shared81)
    implementation(projects.shared82)
    implementation(projects.shared83)
    implementation(projects.shared84)
    implementation(projects.shared85)
    implementation(projects.shared86)
    implementation(projects.shared87)
    implementation(projects.shared88)
    implementation(projects.shared89)
    implementation(projects.shared90)
    implementation(projects.shared91)
    implementation(projects.shared92)
    implementation(projects.shared93)
    implementation(projects.shared94)
    implementation(projects.shared95)
    implementation(projects.shared96)
    implementation(projects.shared97)
    implementation(projects.shared98)
    implementation(projects.shared99)
    implementation(projects.shared100)
    implementation(projects.shared101)
    implementation(projects.shared102)
    implementation(projects.shared103)
    implementation(projects.shared104)
    implementation(projects.shared105)
    implementation(projects.shared106)
    implementation(projects.shared107)
    implementation(projects.shared108)
    implementation(projects.shared109)
    implementation(projects.shared110)
    implementation(projects.shared111)
    implementation(projects.shared112)
    implementation(projects.shared113)
    implementation(projects.shared114)
    implementation(projects.shared115)
    implementation(projects.shared116)
    implementation(projects.shared117)
    implementation(projects.shared118)
    implementation(projects.shared119)
    implementation(projects.shared120)
    implementation(projects.shared121)
    implementation(projects.shared122)
    implementation(projects.shared123)
    implementation(projects.shared124)
    implementation(projects.shared125)
    implementation(projects.shared126)
    implementation(projects.shared127)
    implementation(projects.shared128)
    implementation(projects.shared129)
    implementation(projects.shared130)
    implementation(projects.shared131)
    implementation(projects.shared132)
    implementation(projects.shared133)
    implementation(projects.shared134)
    implementation(projects.shared135)
    implementation(projects.shared136)
    implementation(projects.shared137)
    implementation(projects.shared138)
    implementation(projects.shared139)
    implementation(projects.shared140)
    implementation(projects.shared141)
    implementation(projects.shared142)
    implementation(projects.shared143)
    implementation(projects.shared144)
    implementation(projects.shared145)
    implementation(projects.shared146)
    implementation(projects.shared147)
    implementation(projects.shared148)
    implementation(projects.shared149)
    implementation(projects.shared150)
    implementation(projects.shared151)
    implementation(projects.shared152)
    implementation(projects.shared153)
    implementation(projects.shared154)
    implementation(projects.shared155)
    implementation(projects.shared156)
    implementation(projects.shared157)
    implementation(projects.shared158)
    implementation(projects.shared159)
    implementation(projects.shared160)
    implementation(projects.shared161)
    implementation(projects.shared162)
    implementation(projects.shared163)
    implementation(projects.shared164)
    implementation(projects.shared165)
    implementation(projects.shared166)
    implementation(projects.shared167)
    implementation(projects.shared168)
    implementation(projects.shared169)
    implementation(projects.shared170)
    implementation(projects.shared171)
    implementation(projects.shared172)
    implementation(projects.shared173)
    implementation(projects.shared174)
    implementation(projects.shared175)
    implementation(projects.shared176)
    implementation(projects.shared177)
    implementation(projects.shared178)
    implementation(projects.shared179)
    implementation(projects.shared180)
    implementation(projects.shared181)
    implementation(projects.shared182)
    implementation(projects.shared183)
    implementation(projects.shared184)
    implementation(projects.shared185)
    implementation(projects.shared186)
    implementation(projects.shared187)
    implementation(projects.shared188)
    implementation(projects.shared189)
    implementation(projects.shared190)
    implementation(projects.shared191)
    implementation(projects.shared192)
    implementation(projects.shared193)
    implementation(projects.shared194)
    implementation(projects.shared195)
    implementation(projects.shared196)
    implementation(projects.shared197)
    implementation(projects.shared198)
    implementation(projects.shared199)
    implementation(projects.shared200)
    implementation(projects.shared201)
    implementation(projects.shared202)
    implementation(projects.shared203)
    implementation(projects.shared204)
    implementation(projects.shared205)
    implementation(projects.shared206)
    implementation(projects.shared207)
    implementation(projects.shared208)
    implementation(projects.shared209)
    implementation(projects.shared210)
    implementation(projects.shared211)
    implementation(projects.shared212)
    implementation(projects.shared213)
    implementation(projects.shared214)
    implementation(projects.shared215)
    implementation(projects.shared216)
    implementation(projects.shared217)
    implementation(projects.shared218)
    implementation(projects.shared219)
    implementation(projects.shared220)
    implementation(projects.shared221)
    implementation(projects.shared222)
    implementation(projects.shared223)
    implementation(projects.shared224)
    implementation(projects.shared225)
    implementation(projects.shared226)
    implementation(projects.shared227)
    implementation(projects.shared228)
    implementation(projects.shared229)
    implementation(projects.shared230)
    implementation(projects.shared231)
    implementation(projects.shared232)
    implementation(projects.shared233)
    implementation(projects.shared234)
    implementation(projects.shared235)
    implementation(projects.shared236)
    implementation(projects.shared237)
    implementation(projects.shared238)
    implementation(projects.shared239)
    implementation(projects.shared240)
    implementation(projects.shared241)
    implementation(projects.shared242)
    implementation(projects.shared243)
    implementation(projects.shared244)
    implementation(projects.shared245)
    implementation(projects.shared246)
    implementation(projects.shared247)
    implementation(projects.shared248)
    implementation(projects.shared249)
    implementation(projects.shared250)
    implementation(projects.shared251)
    implementation(projects.shared252)
    implementation(projects.shared253)
    implementation(projects.shared254)
    implementation(projects.shared255)
    implementation(projects.shared256)
    implementation(projects.shared257)
    implementation(projects.shared258)
    implementation(projects.shared259)
    implementation(projects.shared260)
    implementation(projects.shared261)
    implementation(projects.shared262)
    implementation(projects.shared263)
    implementation(projects.shared264)
    implementation(projects.shared265)
    implementation(projects.shared266)
    implementation(projects.shared267)
    implementation(projects.shared268)
    implementation(projects.shared269)
    implementation(projects.shared270)
    implementation(projects.shared271)
    implementation(projects.shared272)
    implementation(projects.shared273)
    implementation(projects.shared274)
    implementation(projects.shared275)
    implementation(projects.shared276)
    implementation(projects.shared277)
    implementation(projects.shared278)
    implementation(projects.shared279)
    implementation(projects.shared280)
    implementation(projects.shared281)
    implementation(projects.shared282)
    implementation(projects.shared283)
    implementation(projects.shared284)
    implementation(projects.shared285)
    implementation(projects.shared286)
    implementation(projects.shared287)
    implementation(projects.shared288)
    implementation(projects.shared289)
    implementation(projects.shared290)
    implementation(projects.shared291)
    implementation(projects.shared292)
    implementation(projects.shared293)
    implementation(projects.shared294)
    implementation(projects.shared295)
    implementation(projects.shared296)
    implementation(projects.shared297)
    implementation(projects.shared298)
    implementation(projects.shared299)
    implementation(projects.shared300)
    implementation(projects.shared301)
    implementation(projects.shared302)
    implementation(projects.shared303)
    implementation(projects.shared304)
    implementation(projects.shared305)
    implementation(projects.shared306)
    implementation(projects.shared307)
    implementation(projects.shared308)
    implementation(projects.shared309)
    implementation(projects.shared310)
    implementation(projects.shared311)
    implementation(projects.shared312)
    implementation(projects.shared313)
    implementation(projects.shared314)
    implementation(projects.shared315)
    implementation(projects.shared316)
    implementation(projects.shared317)
    implementation(projects.shared318)
    implementation(projects.shared319)
    implementation(projects.shared320)
    implementation(projects.shared321)
    implementation(projects.shared322)
    implementation(projects.shared323)
    implementation(projects.shared324)
    implementation(projects.shared325)
    implementation(projects.shared326)
    implementation(projects.shared327)
    implementation(projects.shared328)
    implementation(projects.shared329)
    implementation(projects.shared330)
    implementation(projects.shared331)
    implementation(projects.shared332)
    implementation(projects.shared333)
    implementation(projects.shared334)
    implementation(projects.shared335)
    implementation(projects.shared336)
    implementation(projects.shared337)
    implementation(projects.shared338)
    implementation(projects.shared339)
    implementation(projects.shared340)
    implementation(projects.shared341)
    implementation(projects.shared342)
    implementation(projects.shared343)
    implementation(projects.shared344)
    implementation(projects.shared345)
    implementation(projects.shared346)
    implementation(projects.shared347)
    implementation(projects.shared348)
    implementation(projects.shared349)
    implementation(projects.shared350)
    implementation(projects.shared351)
    implementation(projects.shared352)
    implementation(projects.shared353)
    implementation(projects.shared354)
    implementation(projects.shared355)
    implementation(projects.shared356)
    implementation(projects.shared357)
    implementation(projects.shared358)
    implementation(projects.shared359)
    implementation(projects.shared360)
    implementation(projects.shared361)
    implementation(projects.shared362)
    implementation(projects.shared363)
    implementation(projects.shared364)
    implementation(projects.shared365)
    implementation(projects.shared366)
    implementation(projects.shared367)
    implementation(projects.shared368)
    implementation(projects.shared369)
    implementation(projects.shared370)
    implementation(projects.shared371)
    implementation(projects.shared372)
    implementation(projects.shared373)
    implementation(projects.shared374)
    implementation(projects.shared375)
    implementation(projects.shared376)
    implementation(projects.shared377)
    implementation(projects.shared378)
    implementation(projects.shared379)
    implementation(projects.shared380)
    implementation(projects.shared381)
    implementation(projects.shared382)
    implementation(projects.shared383)
    implementation(projects.shared384)
    implementation(projects.shared385)
    implementation(projects.shared386)
    implementation(projects.shared387)
    implementation(projects.shared388)
    implementation(projects.shared389)
    implementation(projects.shared390)
    implementation(projects.shared391)
    implementation(projects.shared392)
    implementation(projects.shared393)
    implementation(projects.shared394)
    implementation(projects.shared395)
    implementation(projects.shared396)
    implementation(projects.shared397)
    implementation(projects.shared398)
    implementation(projects.shared399)
    implementation(projects.shared400)
    implementation(projects.shared401)
    implementation(projects.shared402)
    implementation(projects.shared403)
    implementation(projects.shared404)
    implementation(projects.shared405)
    implementation(projects.shared406)
    implementation(projects.shared407)
    implementation(projects.shared408)
    implementation(projects.shared409)
    implementation(projects.shared410)
    implementation(projects.shared411)
    implementation(projects.shared412)
    implementation(projects.shared413)
    implementation(projects.shared414)
    implementation(projects.shared415)
    implementation(projects.shared416)
    implementation(projects.shared417)
    implementation(projects.shared418)
    implementation(projects.shared419)
    implementation(projects.shared420)
    implementation(projects.shared421)
    implementation(projects.shared422)
    implementation(projects.shared423)
    implementation(projects.shared424)
    implementation(projects.shared425)
    implementation(projects.shared426)
    implementation(projects.shared427)
    implementation(projects.shared428)
    implementation(projects.shared429)
    implementation(projects.shared430)
    implementation(projects.shared431)
    implementation(projects.shared432)
    implementation(projects.shared433)
    implementation(projects.shared434)
    implementation(projects.shared435)
    implementation(projects.shared436)
    implementation(projects.shared437)
    implementation(projects.shared438)
    implementation(projects.shared439)
    implementation(projects.shared440)
    implementation(projects.shared441)
    implementation(projects.shared442)
    implementation(projects.shared443)
    implementation(projects.shared444)
    implementation(projects.shared445)
    implementation(projects.shared446)
    implementation(projects.shared447)
    implementation(projects.shared448)
    implementation(projects.shared449)
    implementation(projects.shared450)
    implementation(projects.shared451)
    implementation(projects.shared452)
    implementation(projects.shared453)
    implementation(projects.shared454)
    implementation(projects.shared455)
    implementation(projects.shared456)
    implementation(projects.shared457)
    implementation(projects.shared458)
    implementation(projects.shared459)
    implementation(projects.shared460)
    implementation(projects.shared461)
    implementation(projects.shared462)
    implementation(projects.shared463)
    implementation(projects.shared464)
    implementation(projects.shared465)
    implementation(projects.shared466)
    implementation(projects.shared467)
    implementation(projects.shared468)
    implementation(projects.shared469)
    implementation(projects.shared470)
    implementation(projects.shared471)
    implementation(projects.shared472)
    implementation(projects.shared473)
    implementation(projects.shared474)
    implementation(projects.shared475)
    implementation(projects.shared476)
    implementation(projects.shared477)
    implementation(projects.shared478)
    implementation(projects.shared479)
    implementation(projects.shared480)
    implementation(projects.shared481)
    implementation(projects.shared482)
    implementation(projects.shared483)
    implementation(projects.shared484)
    implementation(projects.shared485)
    implementation(projects.shared486)
    implementation(projects.shared487)
    implementation(projects.shared488)
    implementation(projects.shared489)
    implementation(projects.shared490)
    implementation(projects.shared491)
    implementation(projects.shared492)
    implementation(projects.shared493)
    implementation(projects.shared494)
    implementation(projects.shared495)
    implementation(projects.shared496)
    implementation(projects.shared497)
    implementation(projects.shared498)
    implementation(projects.shared499)
    implementation(projects.shared500)


    implementation(libs.compose.foundation)
    implementation(libs.androidx.activity.compose)
    implementation(libs.compose.material3)
}
