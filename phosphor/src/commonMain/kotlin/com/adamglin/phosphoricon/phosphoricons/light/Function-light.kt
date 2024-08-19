package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Function-light`: ImageVector
    get() {
        if (`_function-light` != null) {
            return `_function-light`!!
        }
        `_function-light` = Builder(name = "Function-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(170.71f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -25.58f, 21.35f)
                lineTo(135.19f, 122.0f)
                horizontalLineTo(184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(133.0f)
                lineToRelative(-10.33f, 56.8f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 85.29f, 222.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(85.29f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 25.58f, -21.35f)
                lineTo(120.81f, 134.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(51.0f)
                lineToRelative(10.33f, -56.8f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 170.71f, 34.0f)
                horizontalLineTo(200.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_function-light`!!
    }

private var `_function-light`: ImageVector? = null
