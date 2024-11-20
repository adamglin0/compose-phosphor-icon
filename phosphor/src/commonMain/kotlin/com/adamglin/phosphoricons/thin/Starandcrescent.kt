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

public val ThinGroup.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.82f, 53.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.13f)
                arcTo(91.09f, 91.09f, 0.0f, false, false, 112.0f, 36.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 0.0f, 184.0f)
                arcToRelative(91.09f, 91.09f, 0.0f, false, false, 41.82f, -10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.13f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 0.0f, -149.68f)
                close()
                moveTo(100.0f, 128.0f)
                arcToRelative(91.63f, 91.63f, 0.0f, false, false, 43.21f, 78.0f)
                arcTo(83.23f, 83.23f, 0.0f, false, true, 112.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 0.0f, -168.0f)
                arcToRelative(83.23f, 83.23f, 0.0f, false, true, 31.21f, 6.0f)
                arcTo(91.63f, 91.63f, 0.0f, false, false, 100.0f, 128.0f)
                close()
                moveTo(249.58f, 124.33f)
                lineTo(220.87f, 111.93f)
                lineTo(218.38f, 79.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.08f, -2.24f)
                lineToRelative(-20.19f, 24.46f)
                lineTo(161.0f, 94.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.41f, 5.91f)
                lineTo(172.82f, 128.0f)
                lineToRelative(-16.27f, 27.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.41f, 5.91f)
                lineToRelative(30.15f, -7.46f)
                lineToRelative(20.19f, 24.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.09f, 1.45f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, false, 1.2f, -0.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.79f, -3.5f)
                lineToRelative(2.49f, -32.24f)
                lineToRelative(28.71f, -12.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.34f)
                close()
                moveTo(215.48f, 137.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.4f, 3.36f)
                lineToRelative(-1.92f, 24.77f)
                lineToRelative(-15.49f, -18.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.08f, -1.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.0f, 0.12f)
                lineToRelative(-23.36f, 5.78f)
                lineTo(180.91f, 130.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -4.06f)
                lineTo(168.27f, 104.5f)
                lineToRelative(23.36f, 5.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -1.33f)
                lineToRelative(15.49f, -18.76f)
                lineTo(213.08f, 115.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 3.36f)
                lineTo(237.9f, 128.0f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
