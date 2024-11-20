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

public val ThinGroup.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) {
            return _lessThanOrEqual!!
        }
        _lessThanOrEqual = Builder(name = "LessThanOrEqual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.62f, -3.75f)
                lineToRelative(152.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.76f, 7.5f)
                lineTo(59.57f, 104.0f)
                lineToRelative(141.81f, 52.25f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 164.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.38f, -0.25f)
                lineToRelative(-152.0f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 104.0f)
                close()
                moveTo(200.0f, 196.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(200.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
