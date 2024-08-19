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

public val ThinGroup.`Volleyball-thin`: ImageVector
    get() {
        if (`_volleyball-thin` != null) {
            return `_volleyball-thin`!!
        }
        `_volleyball-thin` = Builder(name = "Volleyball-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(213.0f, 163.19f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -102.18f, 2.57f)
                lineTo(130.31f, 132.0f)
                horizontalLineToRelative(89.6f)
                arcTo(91.61f, 91.61f, 0.0f, false, true, 213.0f, 163.19f)
                close()
                moveTo(85.52f, 46.42f)
                arcTo(91.11f, 91.11f, 0.0f, false, true, 116.0f, 36.79f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 169.29f, 124.0f)
                horizontalLineToRelative(-39.0f)
                close()
                moveTo(219.91f, 124.0f)
                lineTo(177.29f, 124.0f)
                arcToRelative(100.06f, 100.06f, 0.0f, false, false, -46.0f, -87.93f)
                arcTo(92.11f, 92.11f, 0.0f, false, true, 219.91f, 124.0f)
                close()
                moveTo(78.59f, 50.42f)
                lineToRelative(21.3f, 36.89f)
                arcToRelative(100.09f, 100.09f, 0.0f, false, false, -53.16f, 83.77f)
                arcTo(91.92f, 91.92f, 0.0f, false, true, 78.59f, 50.42f)
                close()
                moveTo(55.0f, 183.94f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 48.87f, -89.7f)
                lineTo(123.38f, 128.0f)
                lineTo(78.59f, 205.58f)
                arcTo(92.75f, 92.75f, 0.0f, false, true, 55.0f, 183.94f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.37f, 91.37f, 0.0f, false, true, -42.48f, -10.42f)
                lineToRelative(21.3f, -36.89f)
                arcToRelative(100.07f, 100.07f, 0.0f, false, false, 99.1f, 4.16f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_volleyball-thin`!!
    }

private var `_volleyball-thin`: ImageVector? = null
