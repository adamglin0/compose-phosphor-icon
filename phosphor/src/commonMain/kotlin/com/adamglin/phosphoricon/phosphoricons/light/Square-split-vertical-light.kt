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

public val LightGroup.`Square-split-vertical-light`: ImageVector
    get() {
        if (`_square-split-vertical-light` != null) {
            return `_square-split-vertical-light`!!
        }
        `_square-split-vertical-light` = Builder(name = "Square-split-vertical-light", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 42.0f)
                horizontalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 42.0f)
                close()
                moveTo(56.0f, 54.0f)
                horizontalLineTo(200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(66.0f)
                horizontalLineTo(54.0f)
                verticalLineTo(56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 54.0f)
                close()
                moveTo(200.0f, 202.0f)
                horizontalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(134.0f)
                horizontalLineTo(202.0f)
                verticalLineToRelative(66.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 200.0f, 202.0f)
                close()
            }
        }
        .build()
        return `_square-split-vertical-light`!!
    }

private var `_square-split-vertical-light`: ImageVector? = null
