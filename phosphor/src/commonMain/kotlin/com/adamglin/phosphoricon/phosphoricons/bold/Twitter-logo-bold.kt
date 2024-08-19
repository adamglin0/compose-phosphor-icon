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

public val BoldGroup.`Twitter-logo-bold`: ImageVector
    get() {
        if (`_twitter-logo-bold` != null) {
            return `_twitter-logo-bold`!!
        }
        `_twitter-logo-bold` = Builder(name = "Twitter-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.09f, 67.41f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 60.0f)
                horizontalLineTo(211.82f)
                arcToRelative(52.73f, 52.73f, 0.0f, false, false, -43.67f, -24.0f)
                arcToRelative(50.85f, 50.85f, 0.0f, false, false, -36.6f, 14.85f)
                arcTo(51.87f, 51.87f, 0.0f, false, false, 116.0f, 88.0f)
                verticalLineToRelative(0.78f)
                curveToRelative(-36.83f, -11.57f, -66.38f, -40.9f, -66.7f, -41.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.47f, 7.38f)
                curveTo(22.52f, 125.1f, 53.48f, 162.72f, 70.89f, 178.05f)
                curveTo(56.4f, 192.83f, 36.0f, 200.68f, 35.8f, 200.76f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 30.0f, 218.66f)
                curveTo(32.0f, 221.55f, 43.44f, 236.0f, 80.0f, 236.0f)
                curveToRelative(72.25f, 0.0f, 132.7f, -55.26f, 139.6f, -126.63f)
                lineToRelative(28.88f, -28.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 251.09f, 67.41f)
                close()
                moveTo(199.52f, 95.52f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.49f, 7.72f)
                curveTo(192.14f, 164.23f, 141.18f, 212.0f, 80.0f, 212.0f)
                arcToRelative(90.78f, 90.78f, 0.0f, false, true, -12.49f, -0.79f)
                curveTo(78.0f, 204.55f, 89.72f, 195.07f, 98.0f, 182.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.9f, -17.0f)
                curveToRelative(-0.12f, -0.07f, -12.33f, -7.49f, -23.43f, -24.42f)
                reflectiveCurveToRelative(-17.26f, -37.0f, -18.46f, -59.78f)
                curveTo(69.37f, 94.4f, 96.0f, 110.79f, 126.0f, 115.84f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 104.0f)
                verticalLineTo(88.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 8.41f, -20.07f)
                arcTo(27.07f, 27.07f, 0.0f, false, true, 167.86f, 60.0f)
                arcToRelative(28.83f, 28.83f, 0.0f, false, true, 25.82f, 16.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, 7.19f)
                horizontalLineTo(211.0f)
                close()
            }
        }
        .build()
        return `_twitter-logo-bold`!!
    }

private var `_twitter-logo-bold`: ImageVector? = null
