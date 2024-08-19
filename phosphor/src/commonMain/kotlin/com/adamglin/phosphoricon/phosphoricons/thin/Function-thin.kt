package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Function-thin`: ImageVector
    get() {
        if (`_function-thin` != null) {
            return `_function-thin`!!
        }
        `_function-thin` = Builder(name = "Function-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(170.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.55f, 23.0f)
                lineToRelative(-10.37f, 57.0f)
                horizontalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(131.34f)
                lineToRelative(-10.63f, 58.44f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 85.29f, 220.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(85.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.55f, -23.0f)
                lineToRelative(10.37f, -57.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(52.66f)
                lineToRelative(10.63f, -58.44f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 170.71f, 36.0f)
                horizontalLineTo(200.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_function-thin`!!
    }

private var `_function-thin`: ImageVector? = null
