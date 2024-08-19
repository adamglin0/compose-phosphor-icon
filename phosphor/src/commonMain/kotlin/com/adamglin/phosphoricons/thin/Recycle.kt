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

public val ThinGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -17.31f, -30.0f)
                lineToRelative(39.14f, -67.62f)
                lineToRelative(-23.43f, 6.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.07f, -7.72f)
                lineToRelative(32.77f, -8.77f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 74.0f, 107.0f)
                lineToRelative(8.79f, 32.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 4.9f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, -1.0f, 0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, -3.0f)
                lineToRelative(-6.3f, -23.47f)
                lineTo(29.65f, 186.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 204.0f)
                lineTo(88.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 208.0f)
                close()
                moveTo(233.28f, 182.0f)
                lineTo(210.14f, 142.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.93f, 4.0f)
                lineToRelative(23.14f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 204.0f)
                lineTo(137.66f, 204.0f)
                lineToRelative(17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(137.66f, 212.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.31f, -30.0f)
                close()
                moveTo(138.38f, 34.0f)
                lineToRelative(39.14f, 67.62f)
                lineToRelative(-23.43f, -6.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.07f, 7.73f)
                lineToRelative(32.78f, 8.78f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, false, 1.0f, 0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.86f, -3.0f)
                lineToRelative(8.79f, -32.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.72f, -2.07f)
                lineToRelative(-6.3f, 23.47f)
                lineTo(145.31f, 30.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.62f, 0.0f)
                lineTo(87.53f, 70.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.93f, 4.0f)
                lineToRelative(23.15f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.77f, 0.0f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
