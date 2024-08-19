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

public val LightGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(203.71f)
                lineToRelative(-38.34f, 76.68f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 160.0f, 214.0f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.31f, -3.85f)
                lineTo(95.51f, 55.57f)
                lineTo(61.46f, 130.48f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 56.0f, 134.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(52.14f)
                lineToRelative(38.4f, -84.48f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.07f, 0.34f)
                lineTo(160.74f, 193.1f)
                lineToRelative(33.89f, -67.78f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 200.0f, 122.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 128.0f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
