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

public val LightGroup.Crosshairsimple: ImageVector
    get() {
        if (_crosshairsimple != null) {
            return _crosshairsimple!!
        }
        _crosshairsimple = Builder(name = "Crosshairsimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(134.0f, 217.8f)
                lineTo(134.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(33.8f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 38.2f, 134.0f)
                lineTo(72.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(38.2f, 122.0f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 122.0f, 38.2f)
                lineTo(122.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 38.2f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 217.8f, 122.0f)
                lineTo(184.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(33.8f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 134.0f, 217.8f)
                close()
            }
        }
        .build()
        return _crosshairsimple!!
    }

private var _crosshairsimple: ImageVector? = null
