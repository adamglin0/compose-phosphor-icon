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

public val LightGroup.Funnelsimplex: ImageVector
    get() {
        if (_funnelsimplex != null) {
            return _funnelsimplex!!
        }
        _funnelsimplex = Builder(name = "Funnelsimplex", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 142.0f)
                lineTo(64.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(192.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(232.0f, 82.0f)
                lineTo(24.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(232.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(128.0f, 178.0f)
                lineTo(104.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(220.24f, 171.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(192.0f, 191.51f)
                lineToRelative(-19.76f, -19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(183.51f, 200.0f)
                lineToRelative(-19.75f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(192.0f, 208.49f)
                lineToRelative(19.76f, 19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(200.49f, 200.0f)
                lineToRelative(19.75f, -19.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 220.24f, 171.76f)
                close()
            }
        }
        .build()
        return _funnelsimplex!!
    }

private var _funnelsimplex: ImageVector? = null
