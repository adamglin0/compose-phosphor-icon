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

public val LightGroup.Lightningslash: ImageVector
    get() {
        if (_lightningslash != null) {
            return _lightningslash!!
        }
        _lightningslash = Builder(name = "Lightningslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(84.05f, 88.58f)
                lineTo(43.61f, 131.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.28f, 9.71f)
                lineToRelative(59.23f, 22.21f)
                lineToRelative(-15.0f, 75.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.14f, 6.52f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 96.0f, 246.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.39f, -1.91f)
                lineToRelative(63.34f, -67.87f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(106.0f, 220.46f)
                lineToRelative(11.85f, -59.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.77f, -6.8f)
                lineToRelative(-55.6f, -20.85f)
                lineToRelative(33.64f, -36.0f)
                lineToRelative(63.48f, 69.83f)
                close()
                moveTo(110.0f, 69.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.29f, -8.48f)
                lineToRelative(45.88f, -49.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.27f, 5.27f)
                lineToRelative(-15.0f, 75.0f)
                lineToRelative(59.23f, 22.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.28f, 9.71f)
                lineTo(190.08f, 148.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.77f, -8.19f)
                lineToRelative(16.18f, -17.33f)
                lineToRelative(-55.6f, -20.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.77f, -6.8f)
                lineTo(150.0f, 35.54f)
                lineTo(118.5f, 69.25f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 110.0f, 69.55f)
                close()
            }
        }
        .build()
        return _lightningslash!!
    }

private var _lightningslash: ImageVector? = null
