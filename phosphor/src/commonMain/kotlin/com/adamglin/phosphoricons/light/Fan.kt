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

public val LightGroup.Fan: ImageVector
    get() {
        if (_fan != null) {
            return _fan!!
        }
        _fan = Builder(name = "Fan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.06f, 135.52f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -88.0f, -33.42f)
                curveToRelative(-0.69f, -0.41f, -1.41f, -0.8f, -2.14f, -1.15f)
                lineToRelative(16.86f, -67.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.58f, -6.51f)
                arcTo(58.0f, 58.0f, 0.0f, true, false, 98.0f, 127.86f)
                lineTo(98.0f, 128.0f)
                curveToRelative(0.0f, 0.77f, 0.0f, 1.54f, 0.1f, 2.3f)
                lineTo(31.37f, 149.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 27.0f, 154.85f)
                arcTo(58.0f, 58.0f, 0.0f, true, false, 142.88f, 154.0f)
                curveToRelative(0.7f, -0.4f, 1.39f, -0.83f, 2.06f, -1.29f)
                lineTo(194.81f, 201.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.94f, 1.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, 29.31f, -66.51f)
                close()
                moveTo(110.0f, 128.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 110.0f, 128.0f)
                close()
                moveTo(78.0f, 76.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 67.08f, -40.9f)
                lineTo(129.32f, 98.0f)
                quadToRelative(-0.66f, 0.0f, -1.32f, 0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -27.33f, 17.66f)
                arcTo(45.84f, 45.84f, 0.0f, false, true, 78.0f, 76.0f)
                close()
                moveTo(108.0f, 197.3f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -69.0f, -37.64f)
                lineToRelative(62.39f, -17.82f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 158.0f)
                arcToRelative(29.29f, 29.29f, 0.0f, false, false, 3.0f, -0.15f)
                arcTo(45.85f, 45.85f, 0.0f, false, true, 108.0f, 197.3f)
                close()
                moveTo(214.9f, 173.54f)
                arcToRelative(45.91f, 45.91f, 0.0f, false, true, -15.0f, 15.7f)
                lineToRelative(-46.63f, -45.12f)
                arcToRelative(29.91f, 29.91f, 0.0f, false, false, -0.93f, -33.62f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 62.52f, 63.0f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null
