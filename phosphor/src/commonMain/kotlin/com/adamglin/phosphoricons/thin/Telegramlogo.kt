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

public val ThinGroup.Telegramlogo: ImageVector
    get() {
        if (_telegramlogo != null) {
            return _telegramlogo!!
        }
        _telegramlogo = Builder(name = "Telegramlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.27f, 29.22f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.1f, -0.87f)
                lineTo(18.51f, 107.66f)
                arcToRelative(10.22f, 10.22f, 0.0f, false, false, 1.75f, 19.56f)
                lineTo(76.0f, 138.16f)
                lineTo(76.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.51f, 11.13f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 88.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.62f, -3.68f)
                lineToRelative(28.0f, -29.0f)
                lineToRelative(43.0f, 37.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.89f, 3.0f)
                arcToRelative(12.47f, 12.47f, 0.0f, false, false, 3.74f, -0.59f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, 8.0f, -8.72f)
                lineTo(227.87f, 34.12f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 226.27f, 29.22f)
                close()
                moveTo(20.0f, 117.38f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 1.42f, -2.27f)
                lineTo(196.07f, 46.76f)
                lineToRelative(-117.0f, 83.85f)
                lineTo(21.81f, 119.37f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 20.0f, 117.38f)
                close()
                moveTo(90.87f, 202.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 200.0f)
                lineTo(84.0f, 143.7f)
                lineTo(118.58f, 174.0f)
                close()
                moveTo(179.45f, 208.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.57f, 2.09f)
                lineTo(86.43f, 135.18f)
                lineTo(218.13f, 40.8f)
                close()
            }
        }
        .build()
        return _telegramlogo!!
    }

private var _telegramlogo: ImageVector? = null
