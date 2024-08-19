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

public val ThinGroup.Numberfive: ImageVector
    get() {
        if (_numberfive != null) {
            return _numberfive!!
        }
        _numberfive = Builder(name = "Numberfive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 160.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -86.67f, 38.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.34f, -6.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.84f, -66.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 85.0f, 122.64f)
                lineToRelative(15.09f, -75.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 104.0f, 44.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(107.28f)
                lineTo(94.77f, 114.53f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 172.0f, 160.0f)
                close()
            }
        }
        .build()
        return _numberfive!!
    }

private var _numberfive: ImageVector? = null
