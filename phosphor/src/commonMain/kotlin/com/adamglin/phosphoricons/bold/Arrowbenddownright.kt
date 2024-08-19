package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Arrowbenddownright: ImageVector
    get() {
        if (_arrowbenddownright != null) {
            return _arrowbenddownright!!
        }
        _arrowbenddownright = Builder(name = "Arrowbenddownright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 160.49f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(195.0f, 164.0f)
                horizontalLineTo(128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 20.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f)
                horizontalLineToRelative(67.0f)
                lineToRelative(-27.52f, -27.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.49f, 160.49f)
                close()
            }
        }
        .build()
        return _arrowbenddownright!!
    }

private var _arrowbenddownright: ImageVector? = null
