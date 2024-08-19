package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Twitter-logo`: ImageVector
    get() {
        if (`_twitter-logo` != null) {
            return `_twitter-logo`!!
        }
        `_twitter-logo` = Builder(name = "Twitter-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.39f, 68.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 64.0f)
                lineTo(209.57f, 64.0f)
                arcTo(48.66f, 48.66f, 0.0f, false, false, 168.1f, 40.0f)
                arcToRelative(46.91f, 46.91f, 0.0f, false, false, -33.75f, 13.7f)
                arcTo(47.9f, 47.9f, 0.0f, false, false, 120.0f, 88.0f)
                verticalLineToRelative(6.09f)
                curveTo(79.74f, 83.47f, 46.81f, 50.72f, 46.46f, 50.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.65f, 4.92f)
                curveToRelative(-4.31f, 47.79f, 9.57f, 79.77f, 22.0f, 98.18f)
                arcToRelative(110.93f, 110.93f, 0.0f, false, false, 21.88f, 24.2f)
                curveToRelative(-15.23f, 17.53f, -39.21f, 26.74f, -39.47f, 26.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.85f, 11.93f)
                curveToRelative(0.75f, 1.12f, 3.75f, 5.05f, 11.08f, 8.72f)
                curveTo(53.51f, 229.7f, 65.48f, 232.0f, 80.0f, 232.0f)
                curveToRelative(70.67f, 0.0f, 129.72f, -54.42f, 135.75f, -124.44f)
                lineToRelative(29.91f, -29.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 247.39f, 68.94f)
                close()
                moveTo(202.39f, 98.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.32f, 5.14f)
                curveTo(196.0f, 166.58f, 143.28f, 216.0f, 80.0f, 216.0f)
                curveToRelative(-10.56f, 0.0f, -18.0f, -1.4f, -23.22f, -3.08f)
                curveToRelative(11.51f, -6.25f, 27.56f, -17.0f, 37.88f, -32.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 169.08f)
                curveToRelative(-0.47f, -0.27f, -43.91f, -26.34f, -44.0f, -96.0f)
                curveToRelative(16.0f, 13.0f, 45.25f, 33.17f, 78.67f, 38.79f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 104.0f)
                lineTo(136.0f, 88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 9.6f, -22.92f)
                arcTo(30.94f, 30.94f, 0.0f, false, true, 167.9f, 56.0f)
                curveToRelative(12.66f, 0.16f, 24.49f, 7.88f, 29.44f, 19.21f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 204.67f, 80.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_twitter-logo`!!
    }

private var `_twitter-logo`: ImageVector? = null
