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

public val LightGroup.Pintglass: ImageVector
    get() {
        if (_pintglass != null) {
            return _pintglass!!
        }
        _pintglass = Builder(name = "Pintglass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.49f, 28.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 26.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.71f)
                lineToRelative(23.16f, 193.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 87.1f, 238.0f)
                horizontalLineToRelative(81.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.9f, -12.33f)
                lineTo(206.0f, 32.71f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 204.49f, 28.0f)
                close()
                moveTo(193.24f, 38.0f)
                lineToRelative(-3.36f, 28.0f)
                horizontalLineTo(66.12f)
                lineTo(62.76f, 38.0f)
                close()
                moveTo(170.89f, 224.24f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.76f)
                horizontalLineTo(87.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.76f)
                lineTo(67.56f, 78.0f)
                horizontalLineTo(188.44f)
                close()
            }
        }
        .build()
        return _pintglass!!
    }

private var _pintglass: ImageVector? = null
