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

public val ThinGroup.Arrowuupleft: ImageVector
    get() {
        if (_arrowuupleft != null) {
            return _arrowuupleft!!
        }
        _arrowuupleft = Builder(name = "Arrowuupleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 144.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, true, -60.0f, 60.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                horizontalLineTo(41.66f)
                lineToRelative(41.17f, 41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineTo(41.66f, 84.0f)
                horizontalLineTo(168.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 228.0f, 144.0f)
                close()
            }
        }
        .build()
        return _arrowuupleft!!
    }

private var _arrowuupleft: ImageVector? = null
