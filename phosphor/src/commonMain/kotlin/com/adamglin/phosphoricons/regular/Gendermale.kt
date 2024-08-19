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

public val RegularGroup.Gendermale: ImageVector
    get() {
        if (_gendermale != null) {
            return _gendermale!!
        }
        _gendermale = Builder(name = "Gendermale", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 32.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(28.69f)
                lineTo(154.62f, 90.07f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 11.31f, 11.31f)
                lineTo(208.0f, 59.32f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 32.0f)
                close()
                moveTo(149.24f, 197.29f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -90.53f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 149.24f, 197.29f)
                close()
            }
        }
        .build()
        return _gendermale!!
    }

private var _gendermale: ImageVector? = null
