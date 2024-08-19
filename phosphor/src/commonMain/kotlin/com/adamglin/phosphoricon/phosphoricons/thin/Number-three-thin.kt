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

public val ThinGroup.`Number-three-thin`: ImageVector
    get() {
        if (`_number-three-thin` != null) {
            return `_number-three-thin`!!
        }
        `_number-three-thin` = Builder(name = "Number-three-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 160.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -86.67f, 38.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.34f, -6.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 120.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineTo(160.0f, 52.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, 6.4f)
                lineToRelative(-43.61f, 58.15f)
                arcTo(52.08f, 52.08f, 0.0f, false, true, 172.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_number-three-thin`!!
    }

private var `_number-three-thin`: ImageVector? = null
