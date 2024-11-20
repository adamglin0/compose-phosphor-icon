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

public val LightGroup.Yarn: ImageVector
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = Builder(name = "Yarn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 218.0f)
                lineTo(176.0f, 218.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, -48.0f, 12.0f)
                lineToRelative(104.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(89.53f, 89.53f, 0.0f, false, true, 48.24f, 14.0f)
                arcToRelative(220.06f, 220.06f, 0.0f, false, false, -32.19f, 17.19f)
                arcTo(220.38f, 220.38f, 0.0f, false, false, 93.2f, 45.0f)
                arcTo(89.65f, 89.65f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(78.2f, 53.07f)
                arcToRelative(208.61f, 208.61f, 0.0f, false, true, 55.09f, 23.57f)
                arcTo(223.79f, 223.79f, 0.0f, false, false, 110.45f, 95.8f)
                arcTo(180.0f, 180.0f, 0.0f, false, false, 54.23f, 76.5f)
                arcTo(90.85f, 90.85f, 0.0f, false, true, 78.2f, 53.07f)
                close()
                moveTo(47.58f, 87.62f)
                arcToRelative(168.13f, 168.13f, 0.0f, false, true, 54.07f, 17.11f)
                arcTo(223.44f, 223.44f, 0.0f, false, false, 83.42f, 127.0f)
                arcTo(140.43f, 140.43f, 0.0f, false, false, 39.0f, 114.79f)
                arcTo(89.53f, 89.53f, 0.0f, false, true, 47.58f, 87.62f)
                close()
                moveTo(55.11f, 180.73f)
                arcTo(89.49f, 89.49f, 0.0f, false, true, 38.0f, 128.0f)
                curveToRelative(0.0f, -0.42f, 0.0f, -0.83f, 0.0f, -1.25f)
                arcTo(128.5f, 128.5f, 0.0f, false, true, 76.6f, 137.08f)
                arcTo(220.45f, 220.45f, 0.0f, false, false, 55.11f, 180.73f)
                close()
                moveTo(64.11f, 191.37f)
                arcTo(211.27f, 211.27f, 0.0f, false, true, 187.39f, 60.44f)
                arcToRelative(90.62f, 90.62f, 0.0f, false, true, 18.76f, 23.0f)
                arcTo(181.86f, 181.86f, 0.0f, false, false, 88.22f, 208.71f)
                arcTo(90.4f, 90.4f, 0.0f, false, true, 64.15f, 191.37f)
                close()
                moveTo(127.11f, 217.99f)
                arcToRelative(89.71f, 89.71f, 0.0f, false, true, -27.75f, -4.65f)
                arcToRelative(169.86f, 169.86f, 0.0f, false, true, 112.0f, -119.0f)
                arcToRelative(89.12f, 89.12f, 0.0f, false, true, 6.34f, 27.41f)
                arcTo(142.57f, 142.57f, 0.0f, false, false, 127.15f, 218.0f)
                close()
                moveTo(217.73f, 134.46f)
                arcToRelative(90.15f, 90.15f, 0.0f, false, true, -77.88f, 82.75f)
                arcTo(130.62f, 130.62f, 0.0f, false, true, 217.77f, 134.46f)
                close()
            }
        }
        .build()
        return _yarn!!
    }

private var _yarn: ImageVector? = null
