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

public val LightGroup.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 134.0f)
                lineTo(40.0f, 134.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, -10.28f, -4.56f)
                arcToRelative(14.17f, 14.17f, 0.0f, false, true, -3.66f, -10.84f)
                arcToRelative(101.81f, 101.81f, 0.0f, false, true, 42.75f, -74.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 89.0f, 49.0f)
                lineToRelative(26.0f, 45.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.4f, 6.0f)
                lineTo(78.62f, 55.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.88f, -0.65f)
                arcTo(89.83f, 89.83f, 0.0f, false, false, 38.0f, 119.68f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 0.57f, 1.67f)
                arcTo(1.88f, 1.88f, 0.0f, false, false, 40.0f, 122.0f)
                lineTo(92.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(229.94f, 118.6f)
                arcToRelative(101.81f, 101.81f, 0.0f, false, false, -42.75f, -74.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 167.0f, 49.0f)
                lineTo(141.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.4f, 6.0f)
                lineTo(177.38f, 55.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.88f, -0.65f)
                arcTo(89.83f, 89.83f, 0.0f, false, true, 218.0f, 119.68f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, -0.57f, 1.67f)
                arcTo(1.88f, 1.88f, 0.0f, false, true, 216.0f, 122.0f)
                lineTo(164.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 10.28f, -4.56f)
                arcTo(14.17f, 14.17f, 0.0f, false, false, 229.94f, 118.6f)
                close()
                moveTo(151.2f, 156.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.39f, 6.0f)
                lineToRelative(25.82f, 44.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.88f, 2.82f)
                arcToRelative(90.29f, 90.29f, 0.0f, false, true, -75.5f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.88f, -2.82f)
                lineToRelative(25.82f, -44.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.39f, -6.0f)
                lineTo(79.0f, 200.91f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.23f, 19.71f)
                arcToRelative(102.29f, 102.29f, 0.0f, false, false, 85.58f, 0.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 177.0f, 200.91f)
                close()
                moveTo(128.0f, 138.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 138.0f)
                close()
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
