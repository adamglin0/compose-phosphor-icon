package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Butterfly-thin`: ImageVector
    get() {
        if (`_butterfly-thin` != null) {
            return `_butterfly-thin`!!
        }
        `_butterfly-thin` = Builder(name = "Butterfly-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.5f, 52.94f)
                curveTo(224.89f, 47.0f, 218.0f, 44.0f, 208.93f, 44.0f)
                curveToRelative(-25.86f, 0.0f, -61.28f, 28.73f, -76.93f, 57.28f)
                lineTo(132.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(45.28f)
                curveTo(108.35f, 72.73f, 72.93f, 44.0f, 47.07f, 44.0f)
                curveToRelative(-9.0f, 0.0f, -16.0f, 3.0f, -20.57f, 8.94f)
                curveToRelative(-11.1f, 14.26f, -6.0f, 42.25f, 0.5f, 67.75f)
                curveToRelative(3.67f, 14.42f, 10.55f, 24.64f, 20.48f, 30.38f)
                arcToRelative(36.79f, 36.79f, 0.0f, false, false, 12.75f, 4.45f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 128.0f, 197.43f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 67.77f, -41.9f)
                arcToRelative(36.82f, 36.82f, 0.0f, false, false, 12.75f, -4.46f)
                curveToRelative(9.93f, -5.74f, 16.81f, -16.0f, 20.48f, -30.38f)
                curveTo(235.47f, 95.19f, 240.6f, 67.2f, 229.5f, 52.94f)
                close()
                moveTo(92.0f, 212.0f)
                arcToRelative(32.12f, 32.12f, 0.0f, false, true, -3.56f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.88f, -8.0f)
                arcTo(39.64f, 39.64f, 0.0f, false, false, 67.78f, 148.0f)
                curveToRelative(-22.8f, 1.24f, -30.68f, -20.0f, -33.0f, -29.24f)
                curveToRelative(-5.65f, -22.24f, -11.0f, -49.26f, -1.95f, -60.87f)
                curveTo(35.87f, 53.91f, 40.54f, 52.0f, 47.07f, 52.0f)
                curveTo(76.55f, 52.0f, 124.0f, 98.68f, 124.0f, 127.67f)
                lineTo(124.0f, 180.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 92.0f, 212.0f)
                close()
                moveTo(221.24f, 118.72f)
                curveToRelative(-2.34f, 9.22f, -10.22f, 30.47f, -33.0f, 29.24f)
                arcTo(39.68f, 39.68f, 0.0f, false, false, 168.44f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.88f, 8.0f)
                arcTo(32.1f, 32.1f, 0.0f, true, true, 132.0f, 180.0f)
                lineTo(132.0f, 127.67f)
                curveToRelative(0.0f, -29.0f, 47.45f, -75.67f, 76.93f, -75.67f)
                curveToRelative(6.53f, 0.0f, 11.2f, 1.91f, 14.26f, 5.85f)
                curveTo(232.22f, 69.46f, 226.89f, 96.48f, 221.24f, 118.72f)
                close()
            }
        }
        .build()
        return `_butterfly-thin`!!
    }

private var `_butterfly-thin`: ImageVector? = null
