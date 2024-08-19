package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Person-simple-tai-chi-light`: ImageVector
    get() {
        if (`_person-simple-tai-chi-light` != null) {
            return `_person-simple-tai-chi-light`!!
        }
        `_person-simple-tai-chi-light` = Builder(name = "Person-simple-tai-chi-light", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 78.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 48.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 78.0f)
                close()
                moveTo(128.0f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 30.0f)
                close()
                moveTo(222.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 110.0f)
                verticalLineToRelative(30.0f)
                lineToRelative(52.36f, 22.45f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 190.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(178.0f, 172.0f)
                lineTo(129.16f, 151.0f)
                lineTo(52.0f, 220.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.0f, -8.92f)
                lineToRelative(78.0f, -70.21f)
                lineTo(122.0f, 110.0f)
                lineTo(40.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 98.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_person-simple-tai-chi-light`!!
    }

private var `_person-simple-tai-chi-light`: ImageVector? = null
