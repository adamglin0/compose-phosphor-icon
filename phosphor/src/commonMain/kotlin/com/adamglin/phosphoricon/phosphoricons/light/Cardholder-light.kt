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

public val LightGroup.`Cardholder-light`: ImageVector
    get() {
        if (`_cardholder-light` != null) {
            return `_cardholder-light`!!
        }
        `_cardholder-light` = Builder(name = "Cardholder-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 50.0f)
                horizontalLineTo(48.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 26.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineTo(208.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(72.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 208.0f, 50.0f)
                close()
                moveTo(38.0f, 94.0f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(38.0f)
                close()
                moveTo(48.0f, 62.0f)
                horizontalLineTo(208.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineTo(82.0f)
                horizontalLineTo(38.0f)
                verticalLineTo(72.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 62.0f)
                close()
                moveTo(208.0f, 194.0f)
                horizontalLineTo(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                verticalLineTo(126.0f)
                horizontalLineTo(90.47f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.06f, 0.0f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(58.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 208.0f, 194.0f)
                close()
            }
        }
        .build()
        return `_cardholder-light`!!
    }

private var `_cardholder-light`: ImageVector? = null
