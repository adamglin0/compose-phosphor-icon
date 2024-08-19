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

public val ThinGroup.Microphoneslash: ImageVector
    get() {
        if (_microphoneslash != null) {
            return _microphoneslash!!
        }
        _microphoneslash = Builder(name = "Microphoneslash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 221.31f)
                lineTo(51.0f, 45.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 50.69f)
                lineTo(84.0f, 93.55f)
                lineTo(84.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 66.0f, 38.12f)
                lineToRelative(16.38f, 18.0f)
                arcTo(67.21f, 67.21f, 0.0f, false, true, 128.0f, 196.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(76.09f, 76.09f, 0.0f, false, false, 72.0f, 75.89f)
                lineTo(124.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 203.89f)
                arcToRelative(75.1f, 75.1f, 0.0f, false, false, 39.79f, -13.77f)
                lineTo(205.0f, 226.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(92.0f, 102.35f)
                lineTo(144.43f, 160.0f)
                arcTo(35.83f, 35.83f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(189.12f, 157.85f)
                arcTo(67.44f, 67.44f, 0.0f, false, false, 196.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(75.28f, 75.28f, 0.0f, false, true, -7.7f, 33.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.18f, -3.52f)
                close()
                moveTo(87.63f, 46.46f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 64.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(44.2f, 44.2f, 0.0f, false, true, -0.24f, 4.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 3.58f)
                lineToRelative(-0.42f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.57f, -4.39f)
                arcTo(36.67f, 36.67f, 0.0f, false, false, 164.0f, 128.0f)
                lineTo(164.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 95.0f, 49.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.34f, -3.2f)
                close()
            }
        }
        .build()
        return _microphoneslash!!
    }

private var _microphoneslash: ImageVector? = null
