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

public val LightGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 140.0f)
                close()
                moveTo(164.0f, 130.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 130.0f)
                close()
                moveTo(229.77f, 140.72f)
                arcToRelative(14.24f, 14.24f, 0.0f, false, true, -5.89f, 1.29f)
                arcToRelative(13.72f, 13.72f, 0.0f, false, true, -9.88f, -4.23f)
                lineTo(214.0f, 184.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f)
                lineTo(80.0f, 222.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, -38.0f)
                lineTo(42.0f, 137.78f)
                arcTo(13.76f, 13.76f, 0.0f, false, true, 32.11f, 142.0f)
                arcToRelative(14.23f, 14.23f, 0.0f, false, true, -5.88f, -1.29f)
                arcToRelative(13.82f, 13.82f, 0.0f, false, true, -8.0f, -15.34f)
                lineToRelative(16.42f, -88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 17.16f, -11.0f)
                lineToRelative(0.24f, 0.07f)
                lineTo(104.86f, 42.0f)
                horizontalLineToRelative(46.28f)
                lineToRelative(52.79f, -15.51f)
                lineToRelative(0.24f, -0.07f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 17.16f, 11.0f)
                lineToRelative(16.42f, 88.0f)
                arcTo(13.81f, 13.81f, 0.0f, false, true, 229.77f, 140.72f)
                close()
                moveTo(93.88f, 51.27f)
                lineTo(48.84f, 38.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.49f, 0.27f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.88f, 1.32f)
                lineToRelative(-16.42f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.54f, 1.61f)
                close()
                moveTo(202.0f, 184.0f)
                lineTo(202.0f, 122.43f)
                lineTo(149.06f, 54.0f)
                lineTo(106.94f, 54.0f)
                lineTo(54.0f, 122.43f)
                lineTo(54.0f, 184.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, 26.0f)
                horizontalLineToRelative(42.0f)
                lineTo(122.0f, 194.48f)
                lineToRelative(-14.24f, -14.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(128.0f, 183.51f)
                lineToRelative(11.76f, -11.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(134.0f, 194.48f)
                lineTo(134.0f, 210.0f)
                horizontalLineToRelative(42.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 202.0f, 184.0f)
                close()
                moveTo(226.0f, 127.6f)
                lineToRelative(-16.42f, -88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.88f, -1.31f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, -1.49f, -0.27f)
                lineToRelative(-45.0f, 13.23f)
                lineToRelative(60.32f, 78.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 226.0f, 127.6f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
