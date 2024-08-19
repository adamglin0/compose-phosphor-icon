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

public val ThinGroup.`Gender-intersex-thin`: ImageVector
    get() {
        if (`_gender-intersex-thin` != null) {
            return `_gender-intersex-thin`!!
        }
        `_gender-intersex-thin` = Builder(name = "Gender-intersex-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(30.34f)
                lineTo(163.55f, 70.79f)
                arcTo(60.0f, 60.0f, 0.0f, true, false, 116.0f, 171.85f)
                verticalLineTo(196.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(204.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(124.0f)
                verticalLineTo(171.85f)
                arcTo(59.94f, 59.94f, 0.0f, false, false, 168.68f, 77.0f)
                lineTo(204.0f, 41.66f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(120.0f, 164.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 120.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_gender-intersex-thin`!!
    }

private var `_gender-intersex-thin`: ImageVector? = null
