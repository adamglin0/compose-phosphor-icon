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

public val LightGroup.`Shuffle-light`: ImageVector
    get() {
        if (`_shuffle-light` != null) {
            return `_shuffle-light`!!
        }
        `_shuffle-light` = Builder(name = "Shuffle-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 179.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(217.52f, 190.0f)
                lineTo(200.94f, 190.0f)
                arcToRelative(70.16f, 70.16f, 0.0f, false, true, -57.0f, -29.31f)
                lineToRelative(-41.71f, -58.4f)
                arcTo(58.11f, 58.11f, 0.0f, false, false, 55.06f, 78.0f)
                lineTo(32.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(55.06f, 66.0f)
                arcToRelative(70.16f, 70.16f, 0.0f, false, true, 57.0f, 29.31f)
                lineToRelative(41.71f, 58.4f)
                arcTo(58.11f, 58.11f, 0.0f, false, false, 200.94f, 178.0f)
                horizontalLineToRelative(16.58f)
                lineToRelative(-13.76f, -13.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
                moveTo(144.18f, 105.35f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, 3.48f, 1.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.89f, -2.51f)
                lineToRelative(1.19f, -1.67f)
                arcTo(58.11f, 58.11f, 0.0f, false, true, 200.94f, 78.0f)
                horizontalLineToRelative(16.58f)
                lineTo(203.76f, 91.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(217.52f, 66.0f)
                lineTo(200.94f, 66.0f)
                arcToRelative(70.16f, 70.16f, 0.0f, false, false, -57.0f, 29.31f)
                lineTo(142.78f, 97.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.18f, 105.35f)
                close()
                moveTo(111.82f, 150.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.37f, 1.39f)
                lineToRelative(-1.19f, 1.67f)
                arcTo(58.11f, 58.11f, 0.0f, false, true, 55.06f, 178.0f)
                lineTo(32.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(55.06f, 190.0f)
                arcToRelative(70.16f, 70.16f, 0.0f, false, false, 57.0f, -29.31f)
                lineToRelative(1.19f, -1.67f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 111.82f, 150.65f)
                close()
            }
        }
        .build()
        return `_shuffle-light`!!
    }

private var `_shuffle-light`: ImageVector? = null
