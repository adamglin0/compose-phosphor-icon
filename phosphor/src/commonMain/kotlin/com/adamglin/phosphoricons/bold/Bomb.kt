package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcTo(48.71f, 48.71f, 0.0f, false, true, 228.67f, 56.0f)
                curveTo(224.23f, 66.64f, 217.43f, 68.0f, 212.0f, 68.0f)
                curveToRelative(-8.81f, 0.0f, -14.91f, -8.5f, -23.91f, -22.49f)
                curveTo(178.5f, 30.58f, 166.55f, 12.0f, 144.0f, 12.0f)
                curveToRelative(-18.14f, 0.0f, -32.0f, 9.78f, -39.14f, 27.54f)
                arcTo(68.26f, 68.26f, 0.0f, false, false, 101.27f, 52.0f)
                horizontalLineTo(88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 68.0f, 72.0f)
                verticalLineToRelative(7.18f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 112.0f, 252.0f)
                horizontalLineToRelative(1.66f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 156.0f, 79.18f)
                verticalLineTo(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(125.93f)
                arcToRelative(40.89f, 40.89f, 0.0f, false, true, 1.4f, -4.0f)
                curveToRelative(4.44f, -10.62f, 11.24f, -12.0f, 16.67f, -12.0f)
                curveToRelative(8.81f, 0.0f, 14.91f, 8.5f, 23.91f, 22.49f)
                curveTo(177.5f, 73.42f, 189.45f, 92.0f, 212.0f, 92.0f)
                curveToRelative(18.14f, 0.0f, 32.0f, -9.78f, 39.14f, -27.54f)
                arcTo(71.91f, 71.91f, 0.0f, false, false, 256.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 28.0f)
                close()
                moveTo(139.2f, 97.65f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, -54.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.2f, -11.0f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(19.5f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.0f, 0.5f, 0.0f)
                reflectiveCurveToRelative(0.34f, 0.0f, 0.51f, 0.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(86.66f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 139.2f, 97.65f)
                close()
                moveTo(111.45f, 201.76f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 210.17f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.6f, -0.55f)
                arcTo(51.79f, 51.79f, 0.0f, false, true, 60.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(27.89f, 27.89f, 0.0f, false, false, 19.6f, 26.72f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 111.45f, 201.76f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
