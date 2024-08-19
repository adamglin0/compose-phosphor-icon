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

public val ThinGroup.`Picnic-table-thin`: ImageVector
    get() {
        if (`_picnic-table-thin` != null) {
            return `_picnic-table-thin`!!
        }
        `_picnic-table-thin` = Builder(name = "Picnic-table-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 132.0f)
                horizontalLineTo(198.47f)
                lineToRelative(-32.0f, -64.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(89.53f)
                lineToRelative(-32.0f, 64.0f)
                horizontalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(53.53f)
                lineTo(28.42f, 190.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.79f, 5.37f)
                arcTo(4.12f, 4.12f, 0.0f, false, false, 32.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -2.21f)
                lineTo(62.47f, 140.0f)
                horizontalLineTo(193.53f)
                lineToRelative(26.89f, 53.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 196.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.79f, -0.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.79f, -5.37f)
                lineTo(202.47f, 140.0f)
                horizontalLineTo(248.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(66.47f, 132.0f)
                lineToRelative(32.0f, -64.0f)
                horizontalLineToRelative(59.06f)
                lineToRelative(32.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_picnic-table-thin`!!
    }

private var `_picnic-table-thin`: ImageVector? = null
