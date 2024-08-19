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

public val ThinGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(202.47f)
                lineToRelative(-38.89f, 77.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 212.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.54f, -2.58f)
                lineToRelative(-60.59f, -159.0f)
                lineToRelative(-36.0f, 79.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 132.0f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(53.42f)
                lineTo(92.36f, 38.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.38f, 0.23f)
                lineTo(160.5f, 198.06f)
                lineToRelative(35.92f, -71.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 124.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 128.0f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
