package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Wifislash: ImageVector
    get() {
        if (_wifislash != null) {
            return _wifislash!!
        }
        _wifislash = Builder(name = "Wifislash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-33.67f, -37.0f)
                lineToRelative(-28.1f, 33.88f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -12.31f, -5.77f)
                lineTo(11.65f, 92.8f)
                arcTo(15.65f, 15.65f, 0.0f, false, true, 8.11f, 80.91f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 14.28f, 70.1f)
                arcTo(188.26f, 188.26f, 0.0f, false, true, 46.6f, 50.35f)
                lineToRelative(-4.29f, -4.72f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, 0.13f, -11.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.48f, 0.37f)
                close()
                moveTo(247.92f, 80.91f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -6.17f, -10.81f)
                arcTo(186.67f, 186.67f, 0.0f, false, false, 128.0f, 32.0f)
                arcToRelative(191.0f, 191.0f, 0.0f, false, false, -42.49f, 4.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 6.59f)
                lineTo(186.0f, 156.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -0.14f)
                lineTo(244.35f, 92.8f)
                arcTo(15.65f, 15.65f, 0.0f, false, false, 247.89f, 80.91f)
                close()
            }
        }
        .build()
        return _wifislash!!
    }

private var _wifislash: ImageVector? = null
