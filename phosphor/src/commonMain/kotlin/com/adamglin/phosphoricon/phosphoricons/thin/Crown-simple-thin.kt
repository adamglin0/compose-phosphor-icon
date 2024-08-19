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

public val ThinGroup.`Crown-simple-thin`: ImageVector
    get() {
        if (`_crown-simple-thin` != null) {
            return `_crown-simple-thin`!!
        }
        `_crown-simple-thin` = Builder(name = "Crown-simple-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.18f, 77.21f)
                arcTo(11.89f, 11.89f, 0.0f, false, false, 215.0f, 80.08f)
                lineToRelative(-37.81f, 40.76f)
                lineTo(138.9f, 35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.82f, 0.05f)
                lineTo(78.81f, 120.84f)
                lineTo(41.0f, 80.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.81f, 10.0f)
                lineToRelative(0.0f, 0.15f)
                lineToRelative(22.69f, 103.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 54.71f, 204.0f)
                lineTo(201.29f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -9.83f)
                lineToRelative(22.69f, -103.9f)
                lineToRelative(0.0f, -0.15f)
                arcTo(11.89f, 11.89f, 0.0f, false, false, 229.18f, 77.21f)
                close()
                moveTo(227.94f, 88.66f)
                lineTo(205.26f, 192.54f)
                lineToRelative(0.0f, 0.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.3f)
                lineTo(54.71f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, -3.3f)
                lineToRelative(0.0f, -0.16f)
                lineTo(28.06f, 88.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, -3.26f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.08f, 0.08f)
                lineToRelative(42.0f, 45.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.59f, -1.09f)
                lineToRelative(40.72f, -91.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.24f, 0.0f)
                lineToRelative(40.74f, 91.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.59f, 1.09f)
                lineToRelative(42.0f, -45.24f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.08f, -0.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, 3.26f)
                close()
            }
        }
        .build()
        return `_crown-simple-thin`!!
    }

private var `_crown-simple-thin`: ImageVector? = null
