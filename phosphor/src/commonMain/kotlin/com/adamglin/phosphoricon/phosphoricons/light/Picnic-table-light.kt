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

public val LightGroup.`Picnic-table-light`: ImageVector
    get() {
        if (`_picnic-table-light` != null) {
            return `_picnic-table-light`!!
        }
        `_picnic-table-light` = Builder(name = "Picnic-table-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 130.0f)
                horizontalLineTo(199.71f)
                lineToRelative(-30.0f, -60.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(86.29f)
                lineToRelative(-30.0f, 60.0f)
                horizontalLineTo(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(50.29f)
                lineTo(26.63f, 189.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.74f, 5.36f)
                lineTo(63.71f, 142.0f)
                horizontalLineTo(192.29f)
                lineToRelative(26.34f, 52.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.74f, -5.36f)
                lineTo(205.71f, 142.0f)
                horizontalLineTo(248.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(69.71f, 130.0f)
                lineToRelative(30.0f, -60.0f)
                horizontalLineToRelative(56.58f)
                lineToRelative(30.0f, 60.0f)
                close()
            }
        }
        .build()
        return `_picnic-table-light`!!
    }

private var `_picnic-table-light`: ImageVector? = null
