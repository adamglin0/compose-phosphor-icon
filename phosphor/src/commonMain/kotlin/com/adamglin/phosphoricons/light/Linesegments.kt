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

public val LightGroup.Linesegments: ImageVector
    get() {
        if (_linesegments != null) {
            return _linesegments!!
        }
        _linesegments = Builder(name = "Linesegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.23f, 34.77f)
                arcToRelative(30.06f, 30.06f, 0.0f, false, false, -42.44f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.06f, 30.06f, 0.0f, false, false, 0.0f, 42.44f)
                curveToRelative(0.65f, 0.64f, 1.32f, 1.24f, 2.0f, 1.81f)
                lineToRelative(-28.14f, 52.26f)
                arcTo(30.11f, 30.11f, 0.0f, false, false, 143.46f, 135.0f)
                lineTo(121.0f, 112.54f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 74.78f, 74.78f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.43f)
                arcToRelative(26.28f, 26.28f, 0.0f, false, false, 2.0f, 1.82f)
                lineTo(48.64f, 171.29f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -29.87f, 7.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 42.44f, 0.0f)
                curveToRelative(-0.65f, -0.64f, -1.32f, -1.24f, -2.0f, -1.81f)
                lineToRelative(28.14f, -52.26f)
                arcTo(30.07f, 30.07f, 0.0f, false, false, 112.54f, 121.0f)
                lineTo(135.0f, 143.46f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 46.25f, -4.67f)
                arcToRelative(26.28f, 26.28f, 0.0f, false, false, -2.0f, -1.82f)
                lineToRelative(28.14f, -52.26f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 29.87f, -49.94f)
                close()
                moveTo(52.72f, 212.77f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 52.72f, 212.74f)
                close()
                moveTo(83.27f, 108.77f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.46f, 0.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 83.27f, 108.73f)
                close()
                moveTo(172.73f, 172.77f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 172.73f, 172.73f)
                close()
                moveTo(228.73f, 68.77f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 228.74f, 68.72f)
                close()
            }
        }
        .build()
        return _linesegments!!
    }

private var _linesegments: ImageVector? = null
