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

public val BoldGroup.Arrowfatdown: ImageVector
    get() {
        if (_arrowfatdown != null) {
            return _arrowfatdown!!
        }
        _arrowfatdown = Builder(name = "Arrowfatdown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.09f, 131.41f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 124.0f)
                horizontalLineTo(188.0f)
                verticalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 68.0f, 48.0f)
                verticalLineToRelative(76.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 20.49f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 235.09f, 131.41f)
                close()
                moveTo(128.0f, 215.0f)
                lineTo(61.0f, 148.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(52.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(19.0f)
                close()
            }
        }
        .build()
        return _arrowfatdown!!
    }

private var _arrowfatdown: ImageVector? = null
