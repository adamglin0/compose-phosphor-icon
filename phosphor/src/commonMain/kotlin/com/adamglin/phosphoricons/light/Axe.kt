package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.25f, 98.36f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -11.48f, -9.44f)
                arcToRelative(138.65f, 138.65f, 0.0f, false, true, -54.6f, -19.6f)
                lineToRelative(12.1f, -12.11f)
                arcToRelative(23.0f, 23.0f, 0.0f, true, false, -32.48f, -32.48f)
                lineTo(152.0f, 39.47f)
                curveToRelative(-3.21f, -3.73f, -5.19f, -6.46f, -5.92f, -7.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -21.35f, -1.88f)
                lineTo(86.09f, 68.77f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 88.0f, 90.12f)
                curveToRelative(1.0f, 0.73f, 3.77f, 2.71f, 7.5f, 5.92f)
                lineTo(8.73f, 182.79f)
                arcTo(23.0f, 23.0f, 0.0f, false, false, 25.0f, 222.0f)
                arcToRelative(22.79f, 22.79f, 0.0f, false, false, 16.24f, -6.73f)
                lineToRelative(84.11f, -84.1f)
                arcToRelative(138.65f, 138.65f, 0.0f, false, true, 19.6f, 54.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.44f, 11.48f)
                arcToRelative(13.86f, 13.86f, 0.0f, false, false, 14.35f, -3.36f)
                lineToRelative(81.18f, -81.18f)
                arcTo(13.87f, 13.87f, 0.0f, false, false, 253.25f, 98.36f)
                close()
                moveTo(175.25f, 33.21f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 15.52f, 15.52f)
                lineTo(177.0f, 62.49f)
                arcToRelative(153.67f, 153.67f, 0.0f, false, true, -16.76f, -14.26f)
                close()
                moveTo(32.73f, 206.79f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -15.52f, -15.52f)
                lineToRelative(87.0f, -87.0f)
                arcTo(153.67f, 153.67f, 0.0f, false, true, 118.49f, 121.0f)
                close()
                moveTo(241.41f, 104.22f)
                lineToRelative(-81.19f, 81.19f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, -2.0f, 0.48f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.38f, -1.71f)
                curveTo(148.17f, 119.4f, 100.3f, 84.11f, 94.87f, 80.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 94.0f, 78.82f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 0.57f, -1.57f)
                lineToRelative(38.67f, -38.67f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.39f, -0.58f)
                horizontalLineToRelative(0.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.48f, 0.86f)
                curveToRelative(3.81f, 5.43f, 39.1f, 53.3f, 103.88f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.71f, 1.38f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 241.41f, 104.22f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
