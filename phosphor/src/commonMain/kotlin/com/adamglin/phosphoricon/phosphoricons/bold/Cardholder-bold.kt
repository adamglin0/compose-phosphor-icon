package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Cardholder-bold`: ImageVector
    get() {
        if (`_cardholder-bold` != null) {
            return `_cardholder-bold`!!
        }
        `_cardholder-bold` = Builder(name = "Cardholder-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                horizontalLineTo(48.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineTo(208.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                verticalLineTo(72.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(48.0f, 68.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 88.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 68.0f)
                close()
                moveTo(208.0f, 188.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(112.0f)
                horizontalLineTo(85.66f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 84.68f, 0.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_cardholder-bold`!!
    }

private var `_cardholder-bold`: ImageVector? = null
