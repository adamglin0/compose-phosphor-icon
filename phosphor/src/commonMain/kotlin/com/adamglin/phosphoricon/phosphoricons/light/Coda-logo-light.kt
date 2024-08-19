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

public val LightGroup.`Coda-logo-light`: ImageVector
    get() {
        if (`_coda-logo-light` != null) {
            return `_coda-logo-light`!!
        }
        `_coda-logo-light` = Builder(name = "Coda-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 86.0f)
                arcToRelative(41.82f, 41.82f, 0.0f, false, true, 22.61f, 6.41f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 214.0f, 84.0f)
                lineTo(214.0f, 48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(56.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 48.0f)
                lineTo(42.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 172.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -15.36f, -8.43f)
                curveToRelative(-7.63f, 4.89f, -14.11f, 6.76f, -22.4f, 6.42f)
                lineTo(176.0f, 169.99f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, -84.0f)
                close()
                moveTo(122.0f, 128.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 53.88f, 54.0f)
                arcTo(46.36f, 46.36f, 0.0f, false, false, 202.0f, 175.57f)
                lineTo(202.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(200.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(202.0f, 80.48f)
                arcTo(54.28f, 54.28f, 0.0f, false, false, 122.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_coda-logo-light`!!
    }

private var `_coda-logo-light`: ImageVector? = null
