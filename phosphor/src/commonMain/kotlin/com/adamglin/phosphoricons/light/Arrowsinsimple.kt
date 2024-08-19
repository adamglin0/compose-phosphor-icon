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

public val LightGroup.Arrowsinsimple: ImageVector
    get() {
        if (_arrowsinsimple != null) {
            return _arrowsinsimple!!
        }
        _arrowsinsimple = Builder(name = "Arrowsinsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 52.24f)
                lineTo(158.48f, 106.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineTo(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(97.52f)
                lineToRelative(53.76f, -53.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
                moveTo(112.0f, 138.0f)
                horizontalLineTo(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(97.52f)
                lineTo(43.76f, 203.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(106.0f, 158.48f)
                verticalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 138.0f)
                close()
            }
        }
        .build()
        return _arrowsinsimple!!
    }

private var _arrowsinsimple: ImageVector? = null
