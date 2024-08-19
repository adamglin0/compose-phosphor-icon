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

public val LightGroup.`Skype-logo-light`: ImageVector
    get() {
        if (`_skype-logo-light` != null) {
            return `_skype-logo-light`!!
        }
        `_skype-logo-light` = Builder(name = "Skype-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 152.0f)
                curveToRelative(0.0f, 16.54f, -17.05f, 30.0f, -38.0f, 30.0f)
                reflectiveCurveToRelative(-38.0f, -13.46f, -38.0f, -30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(0.0f, 9.76f, 11.91f, 18.0f, 26.0f, 18.0f)
                reflectiveCurveToRelative(26.0f, -8.24f, 26.0f, -18.0f)
                curveToRelative(0.0f, -11.21f, -10.7f, -15.1f, -28.33f, -20.18f)
                curveToRelative(-15.89f, -4.58f, -33.89f, -9.77f, -33.89f, -27.82f)
                curveToRelative(0.0f, -17.1f, 15.57f, -30.0f, 36.22f, -30.0f)
                curveToRelative(15.0f, 0.0f, 27.74f, 6.88f, 33.34f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.71f, 5.42f)
                curveTo(147.08f, 90.36f, 138.41f, 86.0f, 128.0f, 86.0f)
                curveToRelative(-13.81f, 0.0f, -24.22f, 7.74f, -24.22f, 18.0f)
                curveToRelative(0.0f, 8.41f, 9.52f, 11.76f, 25.21f, 16.29f)
                curveTo(145.48f, 125.0f, 166.0f, 131.0f, 166.0f, 152.0f)
                close()
                moveTo(230.0f, 176.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, 54.0f)
                arcToRelative(53.43f, 53.43f, 0.0f, false, true, -30.72f, -9.59f)
                arcTo(94.06f, 94.06f, 0.0f, false, true, 35.59f, 110.72f)
                arcTo(53.43f, 53.43f, 0.0f, false, true, 26.0f, 80.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 80.0f, 26.0f)
                arcToRelative(53.43f, 53.43f, 0.0f, false, true, 30.72f, 9.59f)
                arcTo(94.06f, 94.06f, 0.0f, false, true, 220.41f, 145.28f)
                arcTo(53.43f, 53.43f, 0.0f, false, true, 230.0f, 176.0f)
                close()
                moveTo(218.0f, 176.0f)
                arcToRelative(41.57f, 41.57f, 0.0f, false, false, -8.74f, -25.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.11f, -4.93f)
                arcToRelative(82.09f, 82.09f, 0.0f, false, false, -97.57f, -97.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.93f, -1.11f)
                arcTo(41.57f, 41.57f, 0.0f, false, false, 80.0f, 38.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 38.0f, 80.0f)
                arcToRelative(41.57f, 41.57f, 0.0f, false, false, 8.74f, 25.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.11f, 4.93f)
                arcToRelative(82.09f, 82.09f, 0.0f, false, false, 97.57f, 97.57f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, 4.93f, 1.11f)
                arcTo(41.57f, 41.57f, 0.0f, false, false, 176.0f, 218.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 218.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_skype-logo-light`!!
    }

private var `_skype-logo-light`: ImageVector? = null
