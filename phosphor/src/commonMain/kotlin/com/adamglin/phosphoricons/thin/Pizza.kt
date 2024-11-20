package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.66f, 63.94f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, -5.44f, -7.43f)
                arcToRelative(197.51f, 197.51f, 0.0f, false, false, -204.44f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, 16.47f)
                lineToRelative(96.0f, 157.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.54f, 0.0f)
                lineTo(234.25f, 73.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 235.66f, 63.94f)
                close()
                moveTo(58.59f, 118.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 86.25f, 163.3f)
                close()
                moveTo(152.59f, 191.41f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 29.15f, -47.76f)
                close()
                moveTo(185.92f, 136.8f)
                arcTo(35.66f, 35.66f, 0.0f, false, false, 168.0f, 132.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -19.56f, 66.22f)
                lineToRelative(-17.0f, 27.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.88f, 0.0f)
                lineToRelative(-34.0f, -55.67f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.33f, -59.54f)
                lineTo(43.33f, 93.0f)
                arcToRelative(156.0f, 156.0f, 0.0f, false, true, 169.34f, 0.0f)
                close()
                moveTo(227.4f, 68.8f)
                lineTo(216.85f, 86.14f)
                arcToRelative(164.07f, 164.07f, 0.0f, false, false, -177.7f, 0.0f)
                lineTo(28.58f, 68.81f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -0.46f, -3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.82f, -2.48f)
                arcToRelative(189.47f, 189.47f, 0.0f, false, true, 196.12f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.82f, 2.48f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 227.42f, 68.81f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
