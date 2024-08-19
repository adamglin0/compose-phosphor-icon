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

public val LightGroup.Linuxlogo: ImageVector
    get() {
        if (_linuxlogo != null) {
            return _linuxlogo!!
        }
        _linuxlogo = Builder(name = "Linuxlogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.74f, 212.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.42f, -0.94f)
                curveTo(218.0f, 210.05f, 186.0f, 169.17f, 186.0f, 88.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 70.0f, 88.0f)
                curveToRelative(0.0f, 81.17f, -31.95f, 122.05f, -33.31f, 123.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.38f, -7.49f)
                curveTo(27.68f, 203.79f, 58.0f, 164.56f, 58.0f, 88.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, true, 140.0f, 0.0f)
                curveToRelative(0.0f, 76.63f, 30.38f, 115.87f, 30.69f, 116.26f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 227.74f, 212.69f)
                close()
                moveTo(100.0f, 90.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 100.0f, 90.0f)
                close()
                moveTo(166.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 166.0f, 100.0f)
                close()
                moveTo(98.69f, 130.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, 10.74f)
                lineToRelative(32.0f, 16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 158.0f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, false, 2.69f, -0.63f)
                lineToRelative(32.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, -10.74f)
                lineTo(128.0f, 145.29f)
                close()
                moveTo(128.0f, 178.0f)
                arcToRelative(52.07f, 52.07f, 0.0f, false, false, -45.24f, 27.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.49f, 5.84f)
                arcToRelative(39.33f, 39.33f, 0.0f, false, true, 69.51f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 214.0f)
                arcToRelative(5.89f, 5.89f, 0.0f, false, false, 2.91f, -0.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.33f, -8.16f)
                arcTo(52.09f, 52.09f, 0.0f, false, false, 128.0f, 178.0f)
                close()
            }
        }
        .build()
        return _linuxlogo!!
    }

private var _linuxlogo: ImageVector? = null
