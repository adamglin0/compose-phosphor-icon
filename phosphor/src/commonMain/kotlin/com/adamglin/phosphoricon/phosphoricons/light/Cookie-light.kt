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

public val LightGroup.`Cookie-light`: ImageVector
    get() {
        if (`_cookie-light` != null) {
            return `_cookie-light`!!
        }
        `_cookie-light` = Builder(name = "Cookie-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.07f, 164.93f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.14f, 0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 163.07f, 164.93f)
                close()
                moveTo(84.93f, 156.93f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 14.14f, 0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 84.93f, 156.93f)
                close()
                moveTo(91.07f, 115.07f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -14.14f, 0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 91.07f, 115.07f)
                close()
                moveTo(124.93f, 116.93f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 14.14f, 0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 124.93f, 116.93f)
                close()
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 128.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 128.0f)
                close()
                moveTo(217.82f, 133.65f)
                arcTo(54.09f, 54.09f, 0.0f, false, true, 170.3f, 85.7f)
                arcToRelative(54.09f, 54.09f, 0.0f, false, true, -48.0f, -47.53f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, 95.47f, 95.48f)
                close()
            }
        }
        .build()
        return `_cookie-light`!!
    }

private var `_cookie-light`: ImageVector? = null
