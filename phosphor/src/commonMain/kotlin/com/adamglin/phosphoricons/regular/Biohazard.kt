package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Biohazard: ImageVector
    get() {
        if (_biohazard != null) {
            return _biohazard!!
        }
        _biohazard = Builder(name = "Biohazard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.68f, 104.28f)
                quadToRelative(-1.4f, -2.88f, -3.06f, -5.6f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -26.92f, -78.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.4f, 14.19f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 170.72f, 84.4f)
                arcToRelative(63.85f, 63.85f, 0.0f, false, false, -85.46f, 0.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 107.7f, 34.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.4f, -14.19f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -26.93f, 78.0f)
                arcToRelative(62.59f, 62.59f, 0.0f, false, false, -3.05f, 5.58f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 16.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(44.09f, 44.09f, 0.0f, false, true, 32.89f, -42.58f)
                arcTo(63.94f, 63.94f, 0.0f, false, false, 109.0f, 193.11f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -56.65f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.62f, 13.47f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 126.74f, 196.0f)
                lineToRelative(1.26f, 0.0f)
                lineToRelative(1.26f, 0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 83.05f, 18.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.62f, -13.47f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -56.65f, -8.0f)
                arcToRelative(63.94f, 63.94f, 0.0f, false, false, 44.07f, -71.69f)
                arcTo(44.09f, 44.09f, 0.0f, false, true, 224.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 185.68f, 104.28f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(47.91f, 47.91f, 0.0f, false, true, 35.56f, 15.79f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -71.13f, 0.0f)
                arcTo(47.89f, 47.89f, 0.0f, false, true, 128.0f, 84.0f)
                close()
                moveTo(128.12f, 133.92f)
                lineTo(128.0f, 134.12f)
                lineTo(127.88f, 133.92f)
                horizontalLineToRelative(0.24f)
                close()
                moveTo(80.0f, 132.0f)
                arcToRelative(47.6f, 47.6f, 0.0f, false, true, 1.44f, -11.65f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 36.0f, 58.46f)
                arcTo(48.07f, 48.07f, 0.0f, false, true, 80.0f, 132.0f)
                close()
                moveTo(138.57f, 178.81f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 36.0f, -58.46f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -36.0f, 58.46f)
                close()
            }
        }
        .build()
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
