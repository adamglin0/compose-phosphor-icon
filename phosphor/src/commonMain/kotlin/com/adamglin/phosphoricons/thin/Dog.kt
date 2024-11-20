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

public val ThinGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(164.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 148.0f)
                close()
                moveTo(228.94f, 138.89f)
                arcToRelative(12.12f, 12.12f, 0.0f, false, true, -5.0f, 1.11f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, true, -9.35f, -4.62f)
                lineTo(212.0f, 132.09f)
                lineTo(212.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(44.0f, 132.09f)
                lineToRelative(-2.53f, 3.27f)
                arcTo(11.88f, 11.88f, 0.0f, false, true, 32.1f, 140.0f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, true, -5.0f, -1.11f)
                arcToRelative(11.82f, 11.82f, 0.0f, false, true, -6.84f, -13.14f)
                lineToRelative(16.42f, -88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.7f, -9.43f)
                lineToRelative(0.16f, 0.0f)
                lineTo(104.58f, 44.0f)
                horizontalLineToRelative(46.84f)
                lineTo(204.5f, 28.4f)
                lineToRelative(0.16f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.7f, 9.43f)
                lineToRelative(16.42f, 88.0f)
                arcTo(11.81f, 11.81f, 0.0f, false, true, 228.94f, 138.89f)
                close()
                moveTo(97.25f, 50.18f)
                lineTo(49.34f, 36.1f)
                arcToRelative(4.18f, 4.18f, 0.0f, false, false, -0.92f, -0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.92f, 3.26f)
                lineToRelative(-16.42f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.08f, 3.22f)
                close()
                moveTo(204.0f, 121.75f)
                lineTo(150.0f, 52.0f)
                lineTo(106.0f, 52.0f)
                lineTo(52.0f, 121.75f)
                lineTo(52.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(44.0f)
                lineTo(124.0f, 193.66f)
                lineToRelative(-14.83f, -14.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(128.0f, 186.34f)
                lineToRelative(13.17f, -13.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineTo(132.0f, 193.66f)
                lineTo(132.0f, 212.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                close()
                moveTo(227.92f, 127.23f)
                lineTo(211.5f, 39.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, -3.16f)
                lineTo(158.75f, 50.18f)
                lineToRelative(62.11f, 80.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.06f, -3.23f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
