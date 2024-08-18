package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Picnic-table`: ImageVector
    get() {
        if (`_picnic-table` != null) {
            return `_picnic-table`!!
        }
        `_picnic-table` = Builder(name = "Picnic-table", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                horizontalLineTo(200.94f)
                lineToRelative(-28.0f, -56.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(83.06f)
                lineToRelative(-28.0f, 56.0f)
                horizontalLineTo(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(47.06f)
                lineTo(24.84f, 188.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.58f, 10.73f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.17f, -4.42f)
                lineTo(64.94f, 144.0f)
                horizontalLineTo(191.06f)
                lineToRelative(25.78f, 51.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 200.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.57f, -0.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.58f, -10.73f)
                lineTo(208.94f, 144.0f)
                horizontalLineTo(248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(72.94f, 128.0f)
                lineToRelative(28.0f, -56.0f)
                horizontalLineToRelative(54.12f)
                lineToRelative(28.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_picnic-table`!!
    }

private var `_picnic-table`: ImageVector? = null
