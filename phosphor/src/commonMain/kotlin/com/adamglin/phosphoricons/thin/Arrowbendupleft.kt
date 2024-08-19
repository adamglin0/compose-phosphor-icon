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

public val ThinGroup.Arrowbendupleft: ImageVector
    get() {
        if (_arrowbendupleft != null) {
            return _arrowbendupleft!!
        }
        _arrowbendupleft = Builder(name = "Arrowbendupleft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, -92.0f)
                horizontalLineTo(41.66f)
                lineToRelative(41.17f, 41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineTo(41.66f, 100.0f)
                horizontalLineTo(128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 200.0f)
                close()
            }
        }
        .build()
        return _arrowbendupleft!!
    }

private var _arrowbendupleft: ImageVector? = null
