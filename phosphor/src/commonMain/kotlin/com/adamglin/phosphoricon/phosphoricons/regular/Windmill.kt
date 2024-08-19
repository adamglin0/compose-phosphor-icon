package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Windmill: ImageVector
    get() {
        if (_windmill != null) {
            return _windmill!!
        }
        _windmill = Builder(name = "Windmill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 224.0f)
                lineTo(182.94f, 224.0f)
                lineToRelative(-6.3f, -44.12f)
                lineToRelative(3.24f, 1.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.91f, -5.67f)
                lineToRelative(12.0f, -20.34f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.67f, -21.91f)
                lineToRelative(-35.0f, -20.61f)
                lineToRelative(40.69f, -69.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.67f, -21.91f)
                lineToRelative(-20.34f, -12.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f)
                lineToRelative(-20.61f, 35.0f)
                lineTo(76.12f, 10.22f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f)
                lineToRelative(-12.0f, 20.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.67f, 21.92f)
                lineToRelative(35.0f, 20.61f)
                lineTo(42.21f, 147.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.67f, 21.91f)
                lineToRelative(20.34f, 12.0f)
                arcToRelative(15.57f, 15.57f, 0.0f, false, false, 10.58f, 2.0f)
                lineTo(73.06f, 224.0f)
                lineTo(32.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(224.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(200.0f, 147.66f)
                lineTo(188.0f, 168.0f)
                lineToRelative(-69.13f, -40.69f)
                lineToRelative(12.0f, -20.35f)
                close()
                moveTo(179.66f, 24.0f)
                lineTo(200.0f, 36.0f)
                lineToRelative(-40.69f, 69.14f)
                lineTo(139.0f, 93.17f)
                close()
                moveTo(56.0f, 44.35f)
                lineTo(68.0f, 24.0f)
                lineTo(137.14f, 64.7f)
                lineToRelative(-12.0f, 20.35f)
                close()
                moveTo(76.34f, 168.0f)
                lineTo(56.0f, 156.0f)
                lineTo(96.69f, 86.86f)
                lineToRelative(20.36f, 12.0f)
                close()
                moveTo(89.22f, 224.0f)
                lineTo(98.0f, 162.8f)
                lineToRelative(12.77f, -21.7f)
                lineTo(159.0f, 169.5f)
                lineToRelative(7.79f, 54.5f)
                close()
            }
        }
        .build()
        return _windmill!!
    }

private var _windmill: ImageVector? = null
