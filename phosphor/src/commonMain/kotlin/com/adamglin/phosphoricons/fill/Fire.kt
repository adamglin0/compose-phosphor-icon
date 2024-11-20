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

public val FillGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.38f, 17.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.63f, 3.41f)
                lineToRelative(-22.0f, 60.41f)
                lineTo(84.59f, 58.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.93f, 0.89f)
                curveTo(51.0f, 87.53f, 40.0f, 116.08f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 84.55f, 165.21f, 36.0f, 143.38f, 17.85f)
                close()
                moveTo(183.89f, 153.34f)
                arcToRelative(57.6f, 57.6f, 0.0f, false, true, -46.56f, 46.55f)
                arcTo(7.65f, 7.65f, 0.0f, false, true, 136.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.32f, -15.89f)
                curveToRelative(16.57f, -2.79f, 30.63f, -16.85f, 33.44f, -33.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.78f, 2.68f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
