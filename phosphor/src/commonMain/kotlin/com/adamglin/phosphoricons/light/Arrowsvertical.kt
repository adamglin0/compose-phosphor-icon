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

public val LightGroup.Arrowsvertical: ImageVector
    get() {
        if (_arrowsvertical != null) {
            return _arrowsvertical!!
        }
        _arrowsvertical = Builder(name = "Arrowsvertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.24f, 195.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(122.0f, 217.51f)
                verticalLineToRelative(-179.0f)
                lineTo(100.24f, 60.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(134.0f, 38.49f)
                verticalLineToRelative(179.0f)
                lineToRelative(21.76f, -21.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 164.24f, 195.76f)
                close()
            }
        }
        .build()
        return _arrowsvertical!!
    }

private var _arrowsvertical: ImageVector? = null
