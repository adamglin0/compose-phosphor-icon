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

public val LightGroup.Arrowsleftright: ImageVector
    get() {
        if (_arrowsleftright != null) {
            return _arrowsleftright!!
        }
        _arrowsleftright = Builder(name = "Arrowsleftright", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 171.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(193.51f, 182.0f)
                horizontalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(193.51f)
                lineToRelative(-21.75f, -21.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
                moveTo(75.76f, 116.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(62.49f, 86.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(62.49f)
                lineTo(84.24f, 52.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                close()
            }
        }
        .build()
        return _arrowsleftright!!
    }

private var _arrowsleftright: ImageVector? = null
