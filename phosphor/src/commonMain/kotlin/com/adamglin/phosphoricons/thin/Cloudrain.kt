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

public val ThinGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.33f, 194.22f)
                lineToRelative(-32.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.66f, -4.44f)
                lineToRelative(32.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.66f, 4.44f)
                close()
                moveTo(228.0f, 92.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f)
                lineTo(130.14f, 164.0f)
                lineTo(99.33f, 210.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.66f, -4.44f)
                lineTo(120.53f, 164.0f)
                lineTo(76.0f, 164.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 87.51f, 69.39f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 228.0f, 92.0f)
                close()
                moveTo(220.0f, 92.0f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 92.0f, 88.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, -0.46f)
                arcToRelative(71.63f, 71.63f, 0.0f, false, true, 1.42f, -10.65f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 76.0f, 156.0f)
                horizontalLineToRelative(80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 220.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
