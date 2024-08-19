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

public val LightGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.6f, 63.47f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, -6.35f, -8.67f)
                arcToRelative(199.48f, 199.48f, 0.0f, false, false, -206.5f, 0.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 20.05f, 74.0f)
                lineToRelative(96.0f, 157.27f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 74.0f)
                arcTo(13.81f, 13.81f, 0.0f, false, false, 237.6f, 63.47f)
                close()
                moveTo(61.07f, 118.2f)
                arcTo(26.0f, 26.0f, 0.0f, true, true, 87.17f, 161.0f)
                close()
                moveTo(152.07f, 188.52f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.91f, -44.1f)
                close()
                moveTo(185.27f, 134.12f)
                arcTo(37.65f, 37.65f, 0.0f, false, false, 168.0f, 130.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -22.25f, 68.8f)
                lineToRelative(-16.0f, 26.24f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.46f, 0.0f)
                lineTo(93.59f, 171.49f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 54.66f, 107.7f)
                lineTo(46.05f, 93.59f)
                arcToRelative(154.14f, 154.14f, 0.0f, false, true, 163.9f, 0.0f)
                close()
                moveTo(225.76f, 67.77f)
                lineTo(216.2f, 83.35f)
                arcToRelative(166.11f, 166.11f, 0.0f, false, false, -176.4f, 0.0f)
                lineTo(30.29f, 67.77f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.23f, -1.47f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 31.0f, 65.06f)
                arcToRelative(187.46f, 187.46f, 0.0f, false, true, 194.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.92f, 1.24f)
                arcTo(1.88f, 1.88f, 0.0f, false, true, 225.71f, 67.77f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
