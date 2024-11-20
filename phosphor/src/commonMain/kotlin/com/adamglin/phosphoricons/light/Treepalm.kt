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

public val LightGroup.TreePalm: ImageVector
    get() {
        if (_treePalm != null) {
            return _treePalm!!
        }
        _treePalm = Builder(name = "TreePalm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.35f, 54.61f)
                arcToRelative(64.87f, 64.87f, 0.0f, false, false, -94.85f, 0.0f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 128.0f, 75.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, -13.5f, -20.37f)
                arcToRelative(64.87f, 64.87f, 0.0f, false, false, -94.85f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.0f, 9.64f)
                lineToRelative(61.83f, 26.9f)
                curveToRelative(-1.85f, 0.34f, -3.7f, 0.74f, -5.54f, 1.23f)
                arcToRelative(69.42f, 69.42f, 0.0f, false, false, -42.5f, 32.39f)
                arcToRelative(68.65f, 68.65f, 0.0f, false, false, -7.0f, 52.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.86f, 4.12f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.93f, 0.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.64f, -1.23f)
                lineTo(122.0f, 116.64f)
                verticalLineTo(224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(116.64f)
                lineToRelative(84.17f, 64.13f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.64f, 1.23f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.93f, -0.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.86f, -4.12f)
                arcToRelative(68.65f, 68.65f, 0.0f, false, false, -7.0f, -52.79f)
                arcToRelative(69.42f, 69.42f, 0.0f, false, false, -42.5f, -32.39f)
                curveToRelative(-1.84f, -0.49f, -3.69f, -0.89f, -5.54f, -1.23f)
                lineToRelative(61.83f, -26.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.0f, -9.64f)
                close()
                moveTo(67.08f, 46.0f)
                arcToRelative(53.16f, 53.16f, 0.0f, false, true, 38.73f, 16.88f)
                arcToRelative(58.77f, 58.77f, 0.0f, false, true, 15.47f, 31.65f)
                lineTo(34.93f, 57.0f)
                arcTo(52.59f, 52.59f, 0.0f, false, true, 67.08f, 46.0f)
                close()
                moveTo(38.29f, 165.33f)
                arcToRelative(56.77f, 56.77f, 0.0f, false, true, 7.48f, -34.53f)
                arcTo(57.58f, 57.58f, 0.0f, false, true, 81.0f, 104.0f)
                arcToRelative(58.79f, 58.79f, 0.0f, false, true, 15.12f, -2.0f)
                arcToRelative(57.67f, 57.67f, 0.0f, false, true, 20.43f, 3.73f)
                close()
                moveTo(210.23f, 130.8f)
                arcToRelative(56.77f, 56.77f, 0.0f, false, true, 7.48f, 34.53f)
                lineToRelative(-78.24f, -59.61f)
                arcToRelative(58.24f, 58.24f, 0.0f, false, true, 70.76f, 25.08f)
                close()
                moveTo(134.72f, 94.53f)
                arcToRelative(58.77f, 58.77f, 0.0f, false, true, 15.47f, -31.65f)
                arcTo(53.16f, 53.16f, 0.0f, false, true, 188.92f, 46.0f)
                arcToRelative(52.59f, 52.59f, 0.0f, false, true, 32.15f, 11.0f)
                close()
            }
        }
        .build()
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
