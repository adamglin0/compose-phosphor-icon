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

public val RegularGroup.Crosshairsimple: ImageVector
    get() {
        if (_crosshairsimple != null) {
            return _crosshairsimple!!
        }
        _crosshairsimple = Builder(name = "Crosshairsimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(136.0f, 215.63f)
                lineTo(136.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(31.63f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 40.37f, 136.0f)
                lineTo(72.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.37f, 120.0f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 120.0f, 40.37f)
                lineTo(120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 40.37f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 215.63f, 120.0f)
                lineTo(184.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(31.63f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 136.0f, 215.63f)
                close()
            }
        }
        .build()
        return _crosshairsimple!!
    }

private var _crosshairsimple: ImageVector? = null
