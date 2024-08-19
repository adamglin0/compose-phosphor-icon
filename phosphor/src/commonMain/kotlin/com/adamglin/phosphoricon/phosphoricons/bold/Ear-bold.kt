package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Ear-bold`: ImageVector
    get() {
        if (`_ear-bold` != null) {
            return `_ear-bold`!!
        }
        `_ear-bold` = Builder(name = "Ear-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                curveToRelative(0.0f, 25.0f, 7.58f, 32.3f, 16.35f, 40.76f)
                reflectiveCurveTo(96.0f, 163.71f, 96.0f, 188.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                curveToRelative(9.0f, 0.0f, 16.19f, -3.7f, 22.75f, -11.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.5f, 15.28f)
                curveTo(158.09f, 237.15f, 144.21f, 244.0f, 128.0f, 244.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, -56.0f)
                curveToRelative(0.0f, -14.09f, -4.63f, -18.56f, -12.31f, -26.0f)
                curveTo(49.13f, 151.86f, 36.0f, 139.19f, 36.0f, 104.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f)
                close()
                moveTo(179.87f, 157.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.4f, 4.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.47f, -2.0f)
                curveToRelative(0.0f, -7.61f, 3.65f, -12.86f, 9.6f, -20.8f)
                curveTo(172.0f, 130.65f, 180.0f, 120.0f, 180.0f, 104.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -104.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                curveToRelative(0.0f, 7.61f, -3.65f, 12.86f, -9.6f, 20.8f)
                curveTo(140.0f, 133.35f, 132.0f, 144.0f, 132.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 52.25f, 14.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 179.87f, 157.61f)
                close()
            }
        }
        .build()
        return `_ear-bold`!!
    }

private var `_ear-bold`: ImageVector? = null
