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

public val FillGroup.Arrowudownright: ImageVector
    get() {
        if (_arrowudownright != null) {
            return _arrowudownright!!
        }
        _arrowudownright = Builder(name = "Arrowudownright", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 173.66f)
                lineToRelative(-48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 216.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(88.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 88.0f, 48.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 173.66f)
                close()
            }
        }
        .build()
        return _arrowudownright!!
    }

private var _arrowudownright: ImageVector? = null
