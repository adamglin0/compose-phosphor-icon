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

public val FillGroup.Microphonestage: ImageVector
    get() {
        if (_microphonestage != null) {
            return _microphonestage!!
        }
        _microphonestage = Builder(name = "Microphonestage", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.06f, 46.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.11f, 0.54f)
                arcTo(71.54f, 71.54f, 0.0f, false, false, 96.0f, 88.0f)
                arcToRelative(73.29f, 73.29f, 0.0f, false, false, 0.63f, 9.42f)
                lineTo(27.12f, 192.22f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 28.71f, 213.0f)
                lineTo(43.0f, 227.29f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 20.78f, 1.59f)
                lineToRelative(94.81f, -69.53f)
                arcTo(73.29f, 73.29f, 0.0f, false, false, 168.0f, 160.0f)
                arcToRelative(71.54f, 71.54f, 0.0f, false, false, 41.09f, -12.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.54f, -6.11f)
                close()
                moveTo(117.67f, 149.64f)
                lineTo(101.67f, 165.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 11.31f)
                close()
                moveTo(227.07f, 129.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.12f, 0.54f)
                lineTo(126.38f, 35.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.54f, -6.12f)
                arcTo(71.93f, 71.93f, 0.0f, false, true, 227.07f, 129.08f)
                close()
            }
        }
        .build()
        return _microphonestage!!
    }

private var _microphonestage: ImageVector? = null
