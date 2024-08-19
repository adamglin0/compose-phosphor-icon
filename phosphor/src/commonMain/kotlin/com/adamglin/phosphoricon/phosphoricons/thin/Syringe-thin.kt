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

public val ThinGroup.`Syringe-thin`: ImageVector
    get() {
        if (`_syringe-thin` != null) {
            return `_syringe-thin`!!
        }
        `_syringe-thin` = Builder(name = "Syringe-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 69.17f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(202.34f, 48.0f)
                lineTo(168.0f, 82.34f)
                lineTo(130.83f, 45.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.66f)
                lineTo(134.34f, 60.0f)
                lineTo(47.51f, 146.83f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 155.31f)
                verticalLineToRelative(51.0f)
                lineTo(21.17f, 229.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(49.66f, 212.0f)
                horizontalLineToRelative(51.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, -3.51f)
                lineTo(196.0f, 121.66f)
                lineToRelative(9.17f, 9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(173.66f, 88.0f)
                lineTo(208.0f, 53.66f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                close()
                moveTo(103.51f, 202.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 1.17f)
                horizontalLineTo(52.0f)
                verticalLineTo(155.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.82f)
                lineTo(74.0f, 131.66f)
                lineToRelative(23.17f, 23.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineTo(79.66f, 126.0f)
                lineTo(98.0f, 107.66f)
                lineToRelative(23.17f, 23.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(103.66f, 102.0f)
                lineTo(140.0f, 65.66f)
                lineToRelative(25.17f, 25.17f)
                horizontalLineToRelative(0.0f)
                lineTo(190.34f, 116.0f)
                close()
            }
        }
        .build()
        return `_syringe-thin`!!
    }

private var `_syringe-thin`: ImageVector? = null
