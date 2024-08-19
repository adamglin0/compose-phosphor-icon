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

public val BoldGroup.`Brandy-bold`: ImageVector
    get() {
        if (`_brandy-bold` != null) {
            return `_brandy-bold`!!
        }
        `_brandy-bold` = Builder(name = "Brandy-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(99.63f, 99.63f, 0.0f, false, false, -16.18f, -54.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, -5.45f)
                lineTo(54.23f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, 5.45f)
                arcTo(99.63f, 99.63f, 0.0f, false, false, 28.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(100.15f, 100.15f, 0.0f, false, false, 88.0f, 99.28f)
                lineTo(116.0f, 212.0f)
                lineTo(88.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 212.0f)
                lineTo(140.0f, 187.28f)
                arcTo(100.15f, 100.15f, 0.0f, false, false, 228.0f, 88.0f)
                close()
                moveTo(61.05f, 52.0f)
                lineTo(195.0f, 52.0f)
                arcToRelative(75.43f, 75.43f, 0.0f, false, true, 8.1f, 24.0f)
                lineTo(53.0f, 76.0f)
                arcTo(75.43f, 75.43f, 0.0f, false, true, 61.05f, 52.0f)
                close()
                moveTo(128.05f, 164.0f)
                arcToRelative(76.12f, 76.12f, 0.0f, false, true, -75.0f, -64.0f)
                lineTo(203.0f, 100.0f)
                arcTo(76.12f, 76.12f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_brandy-bold`!!
    }

private var `_brandy-bold`: ImageVector? = null
