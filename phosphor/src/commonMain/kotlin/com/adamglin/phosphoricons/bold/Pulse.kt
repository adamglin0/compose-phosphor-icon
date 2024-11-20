package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(207.42f)
                lineToRelative(-36.69f, 73.37f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 220.0f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.61f, -7.72f)
                lineTo(95.0f, 71.15f)
                lineTo(66.92f, 133.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 140.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(48.27f)
                lineTo(85.08f, 35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.13f, 0.7f)
                lineToRelative(54.28f, 142.46f)
                lineToRelative(27.78f, -55.56f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 116.0f)
                horizontalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
