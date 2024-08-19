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

public val LightGroup.`Ear-light`: ImageVector
    get() {
        if (`_ear-light` != null) {
            return `_ear-light`!!
        }
        `_ear-light` = Builder(name = "Ear-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -148.0f, 0.0f)
                curveToRelative(0.0f, 27.55f, 8.83f, 36.06f, 18.18f, 45.08f)
                curveToRelative(4.31f, 4.15f, 8.77f, 8.45f, 12.16f, 14.47f)
                curveTo(88.15f, 170.31f, 90.0f, 178.3f, 90.0f, 188.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                curveToRelative(10.74f, 0.0f, 19.69f, -4.52f, 27.37f, -13.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.26f, 7.64f)
                curveTo(154.66f, 231.88f, 142.34f, 238.0f, 128.0f, 238.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                curveToRelative(0.0f, -16.64f, -6.24f, -22.66f, -14.15f, -30.29f)
                curveTo(54.12f, 148.33f, 42.0f, 136.64f, 42.0f, 104.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 172.0f, 0.0f)
                close()
                moveTo(176.86f, 162.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.19f, 2.19f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 150.0f, 160.0f)
                curveToRelative(0.0f, -10.0f, 5.0f, -16.67f, 10.8f, -24.4f)
                curveTo(167.0f, 127.35f, 174.0f, 118.0f, 174.0f, 104.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                curveToRelative(0.0f, 10.0f, -5.0f, 16.67f, -10.8f, 24.4f)
                curveTo(145.0f, 136.65f, 138.0f, 146.0f, 138.0f, 160.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 41.05f, 11.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 176.86f, 162.81f)
                close()
            }
        }
        .build()
        return `_ear-light`!!
    }

private var `_ear-light`: ImageVector? = null
