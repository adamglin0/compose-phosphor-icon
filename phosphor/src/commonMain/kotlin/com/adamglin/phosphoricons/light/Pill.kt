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

public val LightGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.0f, 41.0f)
                arcToRelative(51.28f, 51.28f, 0.0f, false, false, -72.5f, 0.0f)
                lineTo(41.0f, 142.5f)
                arcTo(51.26f, 51.26f, 0.0f, false, false, 113.49f, 215.0f)
                lineTo(215.0f, 113.5f)
                arcTo(51.31f, 51.31f, 0.0f, false, false, 215.0f, 41.0f)
                close()
                moveTo(105.0f, 206.5f)
                arcTo(39.26f, 39.26f, 0.0f, false, true, 49.48f, 151.0f)
                lineTo(96.0f, 104.49f)
                lineTo(151.52f, 160.0f)
                close()
                moveTo(206.52f, 105.0f)
                lineTo(160.0f, 151.51f)
                lineTo(104.48f, 96.0f)
                lineTo(151.0f, 49.5f)
                arcTo(39.26f, 39.26f, 0.0f, false, true, 206.52f, 105.0f)
                close()
                moveTo(188.26f, 83.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.48f)
                lineToRelative(24.0f, -24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 188.26f, 83.76f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
