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

public val LightGroup.Pushpin: ImageVector
    get() {
        if (_pushpin != null) {
            return _pushpin!!
        }
        _pushpin = Builder(name = "Pushpin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.91f, 82.79f)
                lineTo(173.22f, 22.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.81f, 0.0f)
                lineTo(98.93f, 76.77f)
                curveToRelative(-9.52f, -3.25f, -34.0f, -8.34f, -59.71f, 12.41f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 38.1f, 110.0f)
                lineToRelative(49.71f, 49.71f)
                lineToRelative(-44.05f, 44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(44.05f, -44.05f)
                lineTo(146.0f, 217.89f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, 4.11f)
                quadToRelative(0.49f, 0.0f, 1.0f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.19f, -5.54f)
                curveToRelative(19.72f, -26.21f, 17.15f, -47.23f, 12.46f, -59.3f)
                lineToRelative(54.37f, -54.55f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 233.91f, 82.79f)
                close()
                moveTo(225.42f, 94.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-57.27f, 57.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.11f, 6.92f)
                curveToRelative(9.94f, 19.88f, -1.71f, 40.32f, -9.54f, 50.72f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 0.2f)
                lineTo(46.58f, 101.51f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.18f, -3.0f)
                curveToRelative(12.5f, -10.09f, 24.5f, -12.76f, 33.7f, -12.76f)
                arcToRelative(42.13f, 42.13f, 0.0f, false, true, 17.25f, 3.41f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.64f, 88.0f)
                lineTo(161.9f, 30.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(60.69f, 60.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 225.42f, 94.1f)
                close()
            }
        }
        .build()
        return _pushpin!!
    }

private var _pushpin: ImageVector? = null
