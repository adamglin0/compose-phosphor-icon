package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Arrowuupleft: ImageVector
    get() {
        if (_arrowuupleft != null) {
            return _arrowuupleft!!
        }
        _arrowuupleft = Builder(name = "Arrowuupleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 144.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
                horizontalLineTo(51.31f)
                lineToRelative(34.35f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.66f, 45.66f)
                lineTo(51.31f, 80.0f)
                horizontalLineTo(168.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 232.0f, 144.0f)
                close()
            }
        }
        .build()
        return _arrowuupleft!!
    }

private var _arrowuupleft: ImageVector? = null
