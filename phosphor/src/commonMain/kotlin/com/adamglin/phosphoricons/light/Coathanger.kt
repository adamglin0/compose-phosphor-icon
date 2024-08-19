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

public val LightGroup.Coathanger: ImageVector
    get() {
        if (_coathanger != null) {
            return _coathanger!!
        }
        _coathanger = Builder(name = "Coathanger", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.37f, 172.8f)
                lineTo(138.0f, 96.0f)
                lineToRelative(25.59f, -19.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 166.0f, 72.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -76.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 51.82f, -2.88f)
                lineToRelative(-29.32f, 22.0f)
                lineToRelative(-0.21f, 0.16f)
                lineTo(15.63f, 172.8f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 24.0f, 198.0f)
                lineTo(232.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.39f, -25.2f)
                close()
                moveTo(233.87f, 184.63f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 232.0f, 186.0f)
                lineTo(24.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.19f, -3.6f)
                lineTo(128.0f, 103.5f)
                lineToRelative(105.17f, 78.9f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 233.87f, 184.63f)
                close()
            }
        }
        .build()
        return _coathanger!!
    }

private var _coathanger: ImageVector? = null
