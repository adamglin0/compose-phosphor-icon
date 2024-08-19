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

public val FillGroup.Arrowsinsimple: ImageVector
    get() {
        if (_arrowsinsimple != null) {
            return _arrowsinsimple!!
        }
        _arrowsinsimple = Builder(name = "Arrowsinsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 144.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineTo(88.0f, 179.31f)
                lineTo(53.66f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(76.69f, 168.0f)
                lineTo(58.34f, 149.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 136.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 144.0f)
                close()
                moveTo(213.66f, 42.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(168.0f, 76.69f)
                lineTo(149.66f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineTo(179.31f, 88.0f)
                lineToRelative(34.35f, -34.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 42.34f)
                close()
            }
        }
        .build()
        return _arrowsinsimple!!
    }

private var _arrowsinsimple: ImageVector? = null
